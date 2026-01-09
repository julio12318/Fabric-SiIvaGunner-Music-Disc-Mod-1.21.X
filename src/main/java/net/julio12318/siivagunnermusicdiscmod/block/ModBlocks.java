package net.julio12318.siivagunnermusicdiscmod.block;

import net.julio12318.siivagunnermusicdiscmod.SiIvaGunnerMusicDiscMod;
import net.julio12318.siivagunnermusicdiscmod.block.custom.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SIIVA_JUKEBOX = registerBlock("siiva_jukebox", new SiIvaJukeboxBlock(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block VOICE_JUKEBOX = registerBlock("voice_jukebox", new VoiceJukeboxBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block KFAD_JUKEBOX = registerBlock("kfad_jukebox", new KfadJukeboxBlock(AbstractBlock.Settings.create().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block MISSINGNO_JUKEBOX = registerBlock("missingno_jukebox", new MissingnoJukeboxBlock(AbstractBlock.Settings.create().mapColor(MapColor.WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block ROBOBOT_JUKEBOX = registerBlock("robobot_jukebox", new RobobotJukeboxBlock(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block SORRIZO_JUKEBOX = registerBlock("sorrizo_jukebox", new SorrizoJukeboxBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIME).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block HALATION_JUKEBOX = registerBlock("halation_jukebox", new HalationJukeboxBlock(AbstractBlock.Settings.create().mapColor(MapColor.PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block LAW_DISORDER_JUKEBOX = registerBlock("law_disorder_jukebox", new LawDisorderJukeboxBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SiIvaGunnerMusicDiscMod.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SiIvaGunnerMusicDiscMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
}
