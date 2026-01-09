package net.julio12318.siivagunnermusicdiscmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.julio12318.siivagunnermusicdiscmod.block.ModBlocks;
import net.julio12318.siivagunnermusicdiscmod.block.custom.HalationJukeboxBlock;
import net.julio12318.siivagunnermusicdiscmod.block.custom.LawDisorderJukeboxBlock;
import net.julio12318.siivagunnermusicdiscmod.block.custom.RobobotJukeboxBlock;
import net.julio12318.siivagunnermusicdiscmod.block.custom.SorrizoJukeboxBlock;
import net.julio12318.siivagunnermusicdiscmod.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSingleton(ModBlocks.SIIVA_JUKEBOX, TexturedModel.CUBE_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.VOICE_JUKEBOX, TexturedModel.CUBE_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.KFAD_JUKEBOX, TexturedModel.CUBE_TOP);

        //MissingNo Jukebox Model Generator
        Identifier missingnoOffIdentifier = TexturedModel.CUBE_TOP.upload(ModBlocks.MISSINGNO_JUKEBOX, blockStateModelGenerator.modelCollector);
        TextureMap missingnoOnTextureMap = (new TextureMap()).put(TextureKey.SIDE, TextureMap.getSubId(ModBlocks.MISSINGNO_JUKEBOX, "_side_on")).put(TextureKey.TOP, TextureMap.getSubId(ModBlocks.MISSINGNO_JUKEBOX, "_top_on"));
        Identifier missingnoOnIdentifier = Models.CUBE_TOP.upload(ModBlocks.MISSINGNO_JUKEBOX, "_on", missingnoOnTextureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.MISSINGNO_JUKEBOX).coordinate(BlockStateModelGenerator.createBooleanModelMap(RobobotJukeboxBlock.HAS_RECORD, missingnoOnIdentifier, missingnoOffIdentifier)));

        //Robobot Jukebox Model Generator
        Identifier robobotOffIdentifier = TexturedModel.CUBE_TOP.upload(ModBlocks.ROBOBOT_JUKEBOX, blockStateModelGenerator.modelCollector);
        TextureMap robobotOnTextureMap = (new TextureMap()).put(TextureKey.SIDE, TextureMap.getSubId(ModBlocks.ROBOBOT_JUKEBOX, "_side_on")).put(TextureKey.TOP, TextureMap.getSubId(ModBlocks.ROBOBOT_JUKEBOX, "_top"));
        Identifier robobotOnIdentifier = Models.CUBE_TOP.upload(ModBlocks.ROBOBOT_JUKEBOX, "_on", robobotOnTextureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.ROBOBOT_JUKEBOX).coordinate(BlockStateModelGenerator.createBooleanModelMap(RobobotJukeboxBlock.HAS_RECORD, robobotOnIdentifier, robobotOffIdentifier)));

        //Sorrizo Jukebox Model Generator
        Identifier sorrizoOffIdentifier = TexturedModel.CUBE_TOP.upload(ModBlocks.SORRIZO_JUKEBOX, blockStateModelGenerator.modelCollector);
        TextureMap sorrizoOnTextureMap = (new TextureMap()).put(TextureKey.SIDE, TextureMap.getSubId(ModBlocks.SORRIZO_JUKEBOX, "_side_on")).put(TextureKey.TOP, TextureMap.getSubId(ModBlocks.SORRIZO_JUKEBOX, "_top"));
        Identifier sorrizoOnIdentifier = Models.CUBE_TOP.upload(ModBlocks.SORRIZO_JUKEBOX, "_on", sorrizoOnTextureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.SORRIZO_JUKEBOX).coordinate(BlockStateModelGenerator.createBooleanModelMap(SorrizoJukeboxBlock.HAS_RECORD, sorrizoOnIdentifier, sorrizoOffIdentifier)));

        //Snow Halation Jukebox Model Generator
        Identifier halationOffIdentifier = TexturedModel.CUBE_TOP.upload(ModBlocks.HALATION_JUKEBOX, blockStateModelGenerator.modelCollector);
        TextureMap halationOnTextureMap = (new TextureMap()).put(TextureKey.SIDE, TextureMap.getSubId(ModBlocks.HALATION_JUKEBOX, "_side_on")).put(TextureKey.TOP, TextureMap.getSubId(ModBlocks.HALATION_JUKEBOX, "_top"));
        Identifier halationOnIdentifier = Models.CUBE_TOP.upload(ModBlocks.HALATION_JUKEBOX, "_on", halationOnTextureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.HALATION_JUKEBOX).coordinate(BlockStateModelGenerator.createBooleanModelMap(HalationJukeboxBlock.HAS_RECORD, halationOnIdentifier, halationOffIdentifier)));

        //Law & Disorder Jukebox Model Generator
        Identifier lawDisorderOffIdentifier = TexturedModel.CUBE_TOP.upload(ModBlocks.LAW_DISORDER_JUKEBOX, blockStateModelGenerator.modelCollector);
        TextureMap lawDisorderOnTextureMap = (new TextureMap()).put(TextureKey.SIDE, TextureMap.getSubId(ModBlocks.LAW_DISORDER_JUKEBOX, "_side_on")).put(TextureKey.TOP, TextureMap.getSubId(ModBlocks.LAW_DISORDER_JUKEBOX, "_top"));
        Identifier lawDisorderOnIdentifier = Models.CUBE_TOP.upload(ModBlocks.LAW_DISORDER_JUKEBOX, "_on", lawDisorderOnTextureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.LAW_DISORDER_JUKEBOX).coordinate(BlockStateModelGenerator.createBooleanModelMap(LawDisorderJukeboxBlock.HAS_RECORD, lawDisorderOnIdentifier, lawDisorderOffIdentifier)));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MUSIC_DISC_SIIVA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_GRAND_DAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_NOZOMI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_TITO_DICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_LOUD_NIGRA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CHAD_WARDEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_VOICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SENS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_FELIX, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HARUKA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ROBBIE_ROTTEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_WOOD_MAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_META_KNIGHT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SANTA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_JOKE_EXPLAINER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ANDONUTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_STINGY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SIIVA_AI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HALTMANN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SUSIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_KAZOO_MASTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SNOOP_DOGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SOULJA_BOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CHIP, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CHARLES_BARKLEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_PARAPPA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_NICK_CROMPTON, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MONIKA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MISHA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_PSY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HOMER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_PETER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_2B, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_RENTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_READER_JEROME, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_OGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_GADGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_NOSTALGIA_CRITIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_TAKANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_8BIT_BEAST, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_LADY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_PROTO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_AJIT_PAI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_GENO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_OFF_THE_HOOK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_WEIRD_AL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_PITBULL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_NINTENDO_POWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MEN_IN_BLACK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ZUN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_THANOS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_WARIO_WALUIGI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DEDEDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SNAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DJ_PROFESSOR_K, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ETIKA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HYPERCAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_QUOTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ADAM_LEVINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_JOHNNY_BRAVO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_KRABS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MARIYA_TAKEUCHI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ROBOTNIK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DAFT_PUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_PAPYRUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_JACK_ELMO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_PICCOLO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_JACK_BROS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HOBART, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_RHYTHM_MASTERS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_NICO_NICO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DONKEY_KONG, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MISSINGNO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_JAZZ_CATS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_EMINEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_LAW_DISORDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_JOHN_NOTWOODMAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MR_BEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_COOL_MEME_TEAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BOYKISSER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_POMNI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_GEDAGEDI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_NUMBERPHILE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CHARLIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BRAINLESS_KITTY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SILENTO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HCB, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_GIRELLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_GAIJIN_GOOMBA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_FREDDY_FAZBEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BOYFRIEND, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BAROES, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_RAFT_RIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HAMOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_TOTINOS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SEAN_KINGSTON, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SMOOTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BOB_DYLAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MASKED_WOLF, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_KSI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BURNICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_OMORIBOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SUPER_IDOL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MAX_VERSTAPPEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_NOAKA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_400, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SORRIZO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_JERRY_TEMPORARY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CORALINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_GRINCH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DADDY_SPEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ANGRY_JOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SUMIREKO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_REIMU, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CIRNO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HALATION, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SSS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MMM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_PSY9TH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_TSA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SHOVELWARE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_RIP2, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BOMBERTRACKS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_INSTALLER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SPMM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_LAZYTUNES, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_INCOMPETRACKS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MPP, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BAKA_MITUNES, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_JSRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_EK, Models.GENERATED);

        itemModelGenerator.register(ModItems.MISSINGNO_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAT_WING, Models.GENERATED);
    }
}
