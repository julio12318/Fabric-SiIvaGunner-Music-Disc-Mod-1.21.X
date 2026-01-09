package net.julio12318.siivagunnermusicdiscmod.block.entity;

import net.julio12318.siivagunnermusicdiscmod.SiIvaGunnerMusicDiscMod;
import net.julio12318.siivagunnermusicdiscmod.block.ModBlocks;
import net.julio12318.siivagunnermusicdiscmod.block.entity.custom.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<SiIvaJukeboxBlockEntity> SIIVA_JUKEBOX_E =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(SiIvaGunnerMusicDiscMod.MOD_ID, "siiva_jukebox_e"),
                    BlockEntityType.Builder.create(SiIvaJukeboxBlockEntity::new, ModBlocks.SIIVA_JUKEBOX).build(null));

    public static final BlockEntityType<VoiceJukeboxBlockEntity> VOICE_JUKEBOX_E =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(SiIvaGunnerMusicDiscMod.MOD_ID, "voice_jukebox_e"),
                    BlockEntityType.Builder.create(VoiceJukeboxBlockEntity::new, ModBlocks.VOICE_JUKEBOX).build(null));

    public static final BlockEntityType<KfadJukeboxBlockEntity> KFAD_JUKEBOX_E =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(SiIvaGunnerMusicDiscMod.MOD_ID, "kfad_jukebox_e"),
                    BlockEntityType.Builder.create(KfadJukeboxBlockEntity::new, ModBlocks.KFAD_JUKEBOX).build(null));

    public static final BlockEntityType<MissingnoJukeboxBlockEntity> MISSINGNO_JUKEBOX_E =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(SiIvaGunnerMusicDiscMod.MOD_ID, "missingno_jukebox_e"),
                    BlockEntityType.Builder.create(MissingnoJukeboxBlockEntity::new, ModBlocks.MISSINGNO_JUKEBOX).build(null));

    public static final BlockEntityType<RobobotJukeboxBlockEntity> ROBOBOT_JUKEBOX_E =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(SiIvaGunnerMusicDiscMod.MOD_ID, "robobot_jukebox_e"),
                    BlockEntityType.Builder.create(RobobotJukeboxBlockEntity::new, ModBlocks.ROBOBOT_JUKEBOX).build(null));

    public static final BlockEntityType<SorrizoJukeboxBlockEntity> SORRIZO_JUKEBOX_E =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(SiIvaGunnerMusicDiscMod.MOD_ID, "sorrizo_jukebox_e"),
                    BlockEntityType.Builder.create(SorrizoJukeboxBlockEntity::new, ModBlocks.SORRIZO_JUKEBOX).build(null));

    public static final BlockEntityType<HalationJukeboxBlockEntity> HALATION_JUKEBOX_E =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(SiIvaGunnerMusicDiscMod.MOD_ID, "halation_jukebox_e"),
                    BlockEntityType.Builder.create(HalationJukeboxBlockEntity::new, ModBlocks.HALATION_JUKEBOX).build(null));

    public static final BlockEntityType<LawDisorderJukeboxBlockEntity> LAW_DISORDER_JUKEBOX_E =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(SiIvaGunnerMusicDiscMod.MOD_ID, "law_disorder_jukebox_e"),
                    BlockEntityType.Builder.create(LawDisorderJukeboxBlockEntity::new, ModBlocks.LAW_DISORDER_JUKEBOX).build(null));

    public static void registerBlockEntities() {
        SiIvaGunnerMusicDiscMod.LOGGER.info("Registering Block Entities for " + SiIvaGunnerMusicDiscMod.MOD_ID);
    }
}
