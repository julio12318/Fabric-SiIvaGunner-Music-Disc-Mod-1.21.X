package net.julio12318.siivagunnermusicdiscmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.julio12318.siivagunnermusicdiscmod.datagen.ModItemTagProvider;
import net.julio12318.siivagunnermusicdiscmod.datagen.ModLootTableProvider;
import net.julio12318.siivagunnermusicdiscmod.datagen.ModModelProvider;
import net.julio12318.siivagunnermusicdiscmod.datagen.ModRecipeProvider;

public class SiIvaGunnerMusicDiscModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);

	}
}
