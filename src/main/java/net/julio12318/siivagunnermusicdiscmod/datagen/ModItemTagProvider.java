package net.julio12318.siivagunnermusicdiscmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.julio12318.siivagunnermusicdiscmod.item.ModItems;
import net.julio12318.siivagunnermusicdiscmod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.KIRBY_DISCS)
                .add(ModItems.MUSIC_DISC_META_KNIGHT)
                .add(ModItems.MUSIC_DISC_DEDEDE);
        getOrCreateTagBuilder(ModTags.Items.LAZYTOWN_DISCS)
                .add(ModItems.MUSIC_DISC_ROBBIE_ROTTEN)
                .add(ModItems.MUSIC_DISC_STINGY);
    }
}
