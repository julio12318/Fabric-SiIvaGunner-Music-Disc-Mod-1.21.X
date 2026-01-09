package net.julio12318.siivagunnermusicdiscmod.block.entity.custom;

import com.google.common.annotations.VisibleForTesting;
import net.julio12318.siivagunnermusicdiscmod.block.custom.KfadJukeboxBlock;
import net.julio12318.siivagunnermusicdiscmod.block.entity.ModBlockEntities;
import net.julio12318.siivagunnermusicdiscmod.block.jukebox.KfadJukeboxManager;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.ItemEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SingleStackInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Clearable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.Optional;

public class KfadJukeboxBlockEntity extends BlockEntity implements Clearable, SingleStackInventory.SingleStackBlockEntityInventory{
    public static final String RECORD_ITEM_NBT_KEY = "RecordItem";
    public static final String TICKS_SINCE_SONG_STARTED_NBT_KEY = "ticks_since_song_started";
    private ItemStack recordStack;
    private final KfadJukeboxManager manager;


    public KfadJukeboxBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.KFAD_JUKEBOX_E, pos, state);
        this.recordStack = ItemStack.EMPTY;
        this.manager = new KfadJukeboxManager(this::onManagerChange, this.getPos());
    }


    public KfadJukeboxManager getManager() {
        return this.manager;
    }

    public void onManagerChange() {
        assert this.world != null;
        this.world.updateNeighborsAlways(this.getPos(), this.getCachedState().getBlock());
        this.markDirty();
    }


    private void onRecordStackChanged(boolean hasRecord) {
        if (this.world != null && this.world.getBlockState(this.getPos()) == this.getCachedState()) {
            this.world.setBlockState(this.getPos(), (BlockState)this.getCachedState().with(KfadJukeboxBlock.HAS_RECORD, hasRecord), 2);
            this.world.emitGameEvent(GameEvent.BLOCK_CHANGE, this.getPos(), GameEvent.Emitter.of(this.getCachedState()));
        }
    }


    public void dropRecord() {
        if (this.world != null && !this.world.isClient) {
            BlockPos blockPos = this.getPos();
            ItemStack itemStack = this.getStack();
            if (!itemStack.isEmpty()) {
                this.emptyStack();
                Vec3d vec3d = Vec3d.add(blockPos, (double)0.5F, 1.01, (double)0.5F).addRandom(this.world.random, 0.7F);
                ItemStack itemStack2 = itemStack.copy();
                ItemEntity itemEntity = new ItemEntity(this.world, vec3d.getX(), vec3d.getY(), vec3d.getZ(), itemStack2);
                itemEntity.setToDefaultPickupDelay();
                this.world.spawnEntity(itemEntity);
            }
        }
    }

    public static void tick(World world, BlockPos pos, BlockState state, KfadJukeboxBlockEntity blockEntity) {
        blockEntity.manager.tick(world, state);
    }


    public int getComparatorOutput() {
        return (Integer) JukeboxSong.getSongEntryFromStack(this.world.getRegistryManager(), this.recordStack).map(RegistryEntry::value).map(JukeboxSong::comparatorOutput).orElse(0);
    }

    @Override
    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.readNbt(nbt, registryLookup);
        if (nbt.contains("RecordItem", 10)) {
            this.recordStack = (ItemStack)ItemStack.fromNbt(registryLookup, nbt.getCompound("RecordItem")).orElse(ItemStack.EMPTY);
        } else {
            this.recordStack = ItemStack.EMPTY;
        }

        if (nbt.contains("ticks_since_song_started", 4)) {
            JukeboxSong.getSongEntryFromStack(registryLookup, this.recordStack).ifPresent((song) -> this.manager.setValues(song, nbt.getLong("ticks_since_song_started")));
        }

    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.writeNbt(nbt, registryLookup);
        if (!this.getStack().isEmpty()) {
            nbt.put("RecordItem", this.getStack().encode(registryLookup));
        }

        if (this.manager.getSong() != null) {
            nbt.putLong("ticks_since_song_started", this.manager.getTicksSinceSongStarted());
        }

    }

    @Override
    public BlockEntity asBlockEntity() {
        return this;
    }

    @Override
    public ItemStack getStack() {
        return this.recordStack;
    }

    @Override
    public ItemStack decreaseStack(int count) {
        ItemStack itemStack = this.recordStack;
        this.setStack(ItemStack.EMPTY);
        return itemStack;
    }

    @Override
    public void setStack(ItemStack stack) {
        this.recordStack = stack;
        boolean bl = !this.recordStack.isEmpty();
        Optional<RegistryEntry<JukeboxSong>> optional = JukeboxSong.getSongEntryFromStack(this.world.getRegistryManager(), this.recordStack);
        this.onRecordStackChanged(bl);
        if (bl && optional.isPresent()) {
            this.manager.startPlaying(this.world, (RegistryEntry)optional.get());
        } else {
            this.manager.stopPlaying(this.world, this.getCachedState());
        }
    }

    @Override
    public int getMaxCountPerStack() {

        return 1;
    }

    @Override
    public boolean isValid(int slot, ItemStack stack) {
        return stack.contains(DataComponentTypes.JUKEBOX_PLAYABLE) && this.getStack(slot).isEmpty();
    }

    @Override
    public boolean canTransferTo(Inventory hopperInventory, int slot, ItemStack stack) {
        return hopperInventory.containsAny(ItemStack::isEmpty);
    }

    @VisibleForTesting
    public void setDisc(ItemStack stack) {
        this.recordStack = stack;
        JukeboxSong.getSongEntryFromStack(this.world.getRegistryManager(), stack).ifPresent((song) -> this.manager.setValues(song, 0L));
        this.world.updateNeighborsAlways(this.getPos(), this.getCachedState().getBlock());
        this.markDirty();
    }

    @VisibleForTesting
    public void reloadDisc() {
        JukeboxSong.getSongEntryFromStack(this.world.getRegistryManager(), this.getStack()).ifPresent((song) -> this.manager.startPlaying(this.world, song));
    }
}
