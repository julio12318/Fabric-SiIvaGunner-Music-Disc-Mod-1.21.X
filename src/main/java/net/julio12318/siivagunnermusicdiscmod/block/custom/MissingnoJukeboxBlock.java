package net.julio12318.siivagunnermusicdiscmod.block.custom;

import com.mojang.serialization.MapCodec;
import net.julio12318.siivagunnermusicdiscmod.block.ModBlocks;
import net.julio12318.siivagunnermusicdiscmod.block.entity.ModBlockEntities;
import net.julio12318.siivagunnermusicdiscmod.block.entity.custom.MissingnoJukeboxBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.JukeboxPlayableComponent;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class MissingnoJukeboxBlock extends BlockWithEntity implements BlockEntityProvider {
    public static final MapCodec<MissingnoJukeboxBlock> CODEC = MissingnoJukeboxBlock.createCodec(MissingnoJukeboxBlock::new);
    public static final BooleanProperty HAS_RECORD;

    public MissingnoJukeboxBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(HAS_RECORD, false));
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new MissingnoJukeboxBlockEntity(pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {
            BlockEntity var7 = world.getBlockEntity(pos);
            if (var7 instanceof MissingnoJukeboxBlockEntity missingnoJukeboxBlockEntity) {
                missingnoJukeboxBlockEntity.dropRecord();
            }

            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        NbtComponent nbtComponent = itemStack.getOrDefault(DataComponentTypes.BLOCK_ENTITY_DATA, NbtComponent.DEFAULT);
        if (nbtComponent.contains("RecordItem")) {
            world.setBlockState(pos, state.with(HAS_RECORD, true), 2);
        }

    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (state.get(HAS_RECORD)) {
            BlockEntity var7 = world.getBlockEntity(pos);
            if (var7 instanceof MissingnoJukeboxBlockEntity missingnoJukeboxBlockEntity) {
                missingnoJukeboxBlockEntity.dropRecord();
                return ActionResult.success(world.isClient);
            }
        }

        return ActionResult.PASS;
    }


    public static ItemActionResult tryPlayStack(World world, BlockPos pos, ItemStack stack, PlayerEntity player) {
        JukeboxPlayableComponent jukeboxPlayableComponent = stack.get(DataComponentTypes.JUKEBOX_PLAYABLE);
        if (jukeboxPlayableComponent == null) {
            return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        } else {
            BlockState blockState = world.getBlockState(pos);
            if (blockState.isOf(ModBlocks.MISSINGNO_JUKEBOX) && !(Boolean)blockState.get(MissingnoJukeboxBlock.HAS_RECORD)) {
                if (!world.isClient) {
                    ItemStack itemStack = stack.splitUnlessCreative(1, player);
                    BlockEntity var8 = world.getBlockEntity(pos);
                    if (var8 instanceof MissingnoJukeboxBlockEntity missingnoJukeboxBlockEntity) {
                        missingnoJukeboxBlockEntity.setStack(itemStack);
                        world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));
                    }

                    player.incrementStat(Stats.PLAY_RECORD);
                }

                return ItemActionResult.success(world.isClient);
            } else {
                return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
            }
        }
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        System.out.println("Jukebox is being interacted with!");
        if (state.get(HAS_RECORD)) {
            return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        } else {
            System.out.println("This jukebox does not have a record");
            ItemStack itemStack = player.getStackInHand(hand);
            System.out.println(itemStack);
            ItemActionResult itemActionResult = tryPlayStack(world, pos, itemStack, player);
            System.out.println("The item was " + itemActionResult.isAccepted());
            return !itemActionResult.isAccepted() ? ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION : itemActionResult;
        }
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        BlockEntity var6 = world.getBlockEntity(pos);
        if (var6 instanceof MissingnoJukeboxBlockEntity missingnoJukeboxBlockEntity) {
            if (missingnoJukeboxBlockEntity.getManager().isPlaying()) {
                return 15;
            }
        }

        return 0;
    }

    @Override
    protected boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    @Override
    protected int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        BlockEntity var5 = world.getBlockEntity(pos);
        if (var5 instanceof MissingnoJukeboxBlockEntity missingnoJukeboxBlockEntity) {
            return missingnoJukeboxBlockEntity.getComparatorOutput();
        } else {
            return 0;
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HAS_RECORD);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return state.get(HAS_RECORD) ? validateTicker(type, ModBlockEntities.MISSINGNO_JUKEBOX_E, MissingnoJukeboxBlockEntity::tick) : null;
    }

    static {
        HAS_RECORD = Properties.HAS_RECORD;
    }
}
