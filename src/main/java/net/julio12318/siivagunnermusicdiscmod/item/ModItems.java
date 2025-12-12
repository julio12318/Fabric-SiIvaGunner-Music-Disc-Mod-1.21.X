package net.julio12318.siivagunnermusicdiscmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.julio12318.siivagunnermusicdiscmod.SiIvaGunnerMusicDiscMod;
import net.julio12318.siivagunnermusicdiscmod.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MUSIC_DISC_SIIVA = registerItem("music_disc_siiva",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_SIIVA_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_GRAND_DAD = registerItem("music_disc_grand_dad",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_GRAND_DAD_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_NOZOMI = registerItem("music_disc_nozomi",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_NOZOMI_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_TITO_DICK = registerItem("music_disc_tito_dick",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_TITO_DICK_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_LOUD_NIGRA = registerItem("music_disc_loud_nigra",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_LOUD_NIGRA_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_CHAD_WARDEN = registerItem("music_disc_chad_warden",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_CHAD_WARDEN_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_VOICE = registerItem("music_disc_voice",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_VOICE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_SENS = registerItem("music_disc_sens",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_SENS_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_FELIX = registerItem("music_disc_felix",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_FELIX_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_HARUKA = registerItem("music_disc_haruka",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_HARUKA_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_ROBBIE_ROTTEN = registerItem("music_disc_robbie_rotten",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_ROBBIE_ROTTEN_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_WOOD_MAN = registerItem("music_disc_wood_man",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_WOOD_MAN_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_META_KNIGHT = registerItem("music_disc_meta_knight",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_META_KNIGHT_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_SANTA = registerItem("music_disc_santa",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_SANTA_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_JOKE_EXPLAINER = registerItem("music_disc_joke_explainer",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_JOKE_EXPLAINER_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_ANDONUTS = registerItem("music_disc_andonuts",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_ANDONUTS_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_STINGY = registerItem("music_disc_stingy",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_STINGY_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_BEAN = registerItem("music_disc_bean",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_BEAN_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_SIIVA_AI = registerItem("music_disc_siiva_ai",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_SIIVA_AI_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_HALTMANN = registerItem("music_disc_haltmann",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_HALTMANN_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_SUSIE = registerItem("music_disc_susie",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_SUSIE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_KAZOO_MASTER = registerItem("music_disc_kazoo_master",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_KAZOO_MASTER_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_SNOOP_DOGG = registerItem("music_disc_snoop_dogg",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_SNOOP_DOGG_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_SOULJA_BOY = registerItem("music_disc_soulja_boy",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_SOULJA_BOY_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_CHIP = registerItem("music_disc_chip",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_CHIP_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_CHARLES_BARKLEY = registerItem("music_disc_charles_barkley",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_CHARLES_BARKLEY_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_PARAPPA = registerItem("music_disc_parappa",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_PARAPPA_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_HH = registerItem("music_disc_hh",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_HH_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_NICK_CROMPTON = registerItem("music_disc_nick_crompton",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_NICK_CROMPTON_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_MONIKA = registerItem("music_disc_monika",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_MONIKA_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_MISHA = registerItem("music_disc_misha",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_MISHA_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_PSY = registerItem("music_disc_psy",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_PSY_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_HOMER = registerItem("music_disc_homer",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_HOMER_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_PETER = registerItem("music_disc_peter",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_PETER_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_2B = registerItem("music_disc_2b",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_2B_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_RENTAL = registerItem("music_disc_rental",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_RENTAL_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_READER_JEROME = registerItem("music_disc_reader_jerome",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_READER_JEROME_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_OGG = registerItem("music_disc_ogg",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_OGG_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_GADGET = registerItem("music_disc_gadget",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_GADGET_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_NOSTALGIA_CRITIC = registerItem("music_disc_nostalgia_critic",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_NOSTALGIA_CRITIC_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_TAKANE = registerItem("music_disc_takane",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_TAKANE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_8BIT_BEAST = registerItem("music_disc_8bit_beast",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_8BIT_BEAST_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_LADY = registerItem("music_disc_lady",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_LADY_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_PROTO = registerItem("music_disc_proto",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_PROTO_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_AJIT_PAI = registerItem("music_disc_ajit_pai",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_AJIT_PAI_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_GENO = registerItem("music_disc_geno",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_GENO_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_OFF_THE_HOOK = registerItem("music_disc_off_the_hook",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_OFF_THE_HOOK_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_WEIRD_AL = registerItem("music_disc_weird_al",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_WEIRD_AL_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_PITBULL = registerItem("music_disc_pitbull",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_PITBULL_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_NINTENDO_POWER = registerItem("music_disc_nintendo_power",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_NINTENDO_POWER_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_MEN_IN_BLACK = registerItem("music_disc_men_in_black",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_MEN_IN_BLACK_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_ZUN = registerItem("music_disc_zun",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_ZUN_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_THANOS = registerItem("music_disc_thanos",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_THANOS_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_WARIO_WALUIGI = registerItem("music_disc_wario_waluigi",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_WARIO_WALUIGI_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_DEDEDE = registerItem("music_disc_dedede",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_DEDEDE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_SNAKE = registerItem("music_disc_snake",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_SNAKE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_DJ_PROFESSOR_K = registerItem("music_disc_dj_professor_k",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_DJ_PROFESSOR_K_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_ETIKA = registerItem("music_disc_etika",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_ETIKA_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_HYPERCAM = registerItem("music_disc_hypercam",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_HYPERCAM_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_QUOTE = registerItem("music_disc_quote",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_QUOTE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_ADAM_LEVINE = registerItem("music_disc_adam_levine",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_ADAM_LEVINE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_JOHNNY_BRAVO = registerItem("music_disc_johnny_bravo",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_JOHNNY_BRAVO_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_KRABS = registerItem("music_disc_krabs",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_KRABS_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_MARIYA_TAKEUCHI = registerItem("music_disc_mariya_takeuchi",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_MARIYA_TAKEUCHI_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_ROBOTNIK = registerItem("music_disc_robotnik",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_ROBOTNIK_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_DAFT_PUNK = registerItem("music_disc_daft_punk",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_DAFT_PUNK_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_PAPYRUS = registerItem("music_disc_papyrus",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_PAPYRUS_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_JACK_ELMO = registerItem("music_disc_jack_elmo",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_JACK_ELMO_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_PICCOLO = registerItem("music_disc_piccolo",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_PICCOLO_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_JACK_BROS = registerItem("music_disc_jack_bros",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_JACK_BROS_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_HOBART = registerItem("music_disc_hobart",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_HOBART_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_RHYTHM_MASTERS = registerItem("music_disc_rhythm_masters",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_RHYTHM_MASTERS_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_NICO_NICO = registerItem("music_disc_nico_nico",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_NICO_NICO_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_DONKEY_KONG = registerItem("music_disc_donkey_kong",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_DONKEY_KONG_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_MISSINGNO = registerItem("music_disc_missingno",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_MISSINGNO_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_JAZZ_CATS = registerItem("music_disc_jazz_cats",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_JAZZ_CATS_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_EMINEM = registerItem("music_disc_eminem",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_EMINEM_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_LAW_DISORDER = registerItem("music_disc_law_disorder",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_LAW_DISORDER_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_JOHN_NOTWOODMAN = registerItem("music_disc_john_notwoodman",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_JOHN_NOTWOODMAN_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_MR_BEAN = registerItem("music_disc_mr_bean",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_MR_BEAN_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_COOL_MEME_TEAM = registerItem("music_disc_cool_meme_team",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_COOL_MEME_TEAM_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_BOYKISSER = registerItem("music_disc_boykisser",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_BOYKISSER_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_POMNI = registerItem("music_disc_pomni",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_POMNI_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_GEDAGEDI = registerItem("music_disc_gedagedi",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_GEDAGEDI_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_NUMBERPHILE = registerItem("music_disc_numberphile",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_NUMBERPHILE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_CHARLIE = registerItem("music_disc_charlie",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_CHARLIE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_BRAINLESS_KITTY = registerItem("music_disc_brainless_kitty",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_BRAINLESS_KITTY_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_SILENTO = registerItem("music_disc_silento",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_SILENTO_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_HCB = registerItem("music_disc_hcb",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_HCB_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_GIRELLE = registerItem("music_disc_girelle",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_GIRELLE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_GAIJIN_GOOMBA = registerItem("music_disc_gaijin_goomba",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_GAIJIN_GOOMBA_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_FREDDY_FAZBEAR = registerItem("music_disc_freddy_fazbear",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_FREDDY_FAZBEAR_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_BOYFRIEND = registerItem("music_disc_boyfriend",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_BOYFRIEND_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_BAROES = registerItem("music_disc_baroes",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_BAROES_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_RAFT_RIDE = registerItem("music_disc_raft_ride",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_RAFT_RIDE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_HAMOOD = registerItem("music_disc_hamood",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_HAMOOD_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_TOTINOS = registerItem("music_disc_totinos",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_TOTINOS_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_SEAN_KINGSTON = registerItem("music_disc_sean_kingston",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_SEAN_KINGSTON_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_SMOOTH = registerItem("music_disc_smooth",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_SMOOTH_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_BOB_DYLAN = registerItem("music_disc_bob_dylan",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_BOB_DYLAN_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_MASKED_WOLF = registerItem("music_disc_masked_wolf",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_MASKED_WOLF_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_KSI = registerItem("music_disc_ksi",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_KSI_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_BURNICE = registerItem("music_disc_burnice",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_BURNICE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_OMORIBOY= registerItem("music_disc_omoriboy",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_OMORIBOY_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_SUPER_IDOL = registerItem("music_disc_super_idol",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_SUPER_IDOL_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_MAX_VERSTAPPEN = registerItem("music_disc_max_verstappen",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_MAX_VERSTAPPEN_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_NOAKA = registerItem("music_disc_noaka",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_NOAKA_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_400 = registerItem("music_disc_400",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_400_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_MAN = registerItem("music_disc_man",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MUSIC_MAN_KEY).maxCount(1)));

    public static final Item MISSINGNO_FRAGMENT = registerItem("missingno_fragment",
            new Item(new Item.Settings()));
    public static final Item BAT_WING = registerItem("bat_wing",
            new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SiIvaGunnerMusicDiscMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SiIvaGunnerMusicDiscMod.LOGGER.info("Registering Mod Items for " + SiIvaGunnerMusicDiscMod.MOD_ID);
    }
}
