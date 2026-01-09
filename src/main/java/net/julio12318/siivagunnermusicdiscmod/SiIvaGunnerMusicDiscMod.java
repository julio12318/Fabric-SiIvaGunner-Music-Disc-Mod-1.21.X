package net.julio12318.siivagunnermusicdiscmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.julio12318.siivagunnermusicdiscmod.block.entity.ModBlockEntities;
import net.julio12318.siivagunnermusicdiscmod.item.ModItemGroups;
import net.julio12318.siivagunnermusicdiscmod.item.ModItems;
import net.julio12318.siivagunnermusicdiscmod.particle.ModParticles;
import net.julio12318.siivagunnermusicdiscmod.sound.ModSounds;
import net.julio12318.siivagunnermusicdiscmod.util.ModLootTableModifiers;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.passive.PandaEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SiIvaGunnerMusicDiscMod implements ModInitializer {
	public static final String MOD_ID = "siivagunnermusicdiscmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModSounds.registerSounds();
		ModLootTableModifiers.modifyLootTables();
		ModBlockEntities.registerBlockEntities();
		ModParticles.registerParticles();


		ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register(((serverWorld, entity, livingEntity) -> {
			if (entity instanceof CreeperEntity creeper && creeper.isIgnited()) {
				if (creeper.shouldDropHead()) {
					if (livingEntity instanceof WolfEntity wolf) {
						entity.dropStack(new ItemStack(ModItems.MUSIC_DISC_PARAPPA));
						creeper.onHeadDropped();
					} else if (livingEntity instanceof PandaEntity panda) {
						entity.dropStack(new ItemStack(ModItems.MUSIC_DISC_LAW_DISORDER));
						creeper.onHeadDropped();
					} else if (livingEntity instanceof EndermanEntity enderman) {
						entity.dropStack(new ItemStack(ModItems.MUSIC_DISC_MAN));
						creeper.onHeadDropped();
					}
				}
			}
		}));
	}
}