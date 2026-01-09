package net.julio12318.siivagunnermusicdiscmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.julio12318.siivagunnermusicdiscmod.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SIIVA_JUKEBOX);
        addDrop(ModBlocks.VOICE_JUKEBOX);
        addDrop(ModBlocks.KFAD_JUKEBOX);
        addDrop(ModBlocks.MISSINGNO_JUKEBOX);
        addDrop(ModBlocks.ROBOBOT_JUKEBOX);
        addDrop(ModBlocks.SORRIZO_JUKEBOX);
        addDrop(ModBlocks.HALATION_JUKEBOX);
        addDrop(ModBlocks.LAW_DISORDER_JUKEBOX);
    }
}
