package net.julio12318.siivagunnermusicdiscmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.julio12318.siivagunnermusicdiscmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        //SiIva Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_SIIVA)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.STONE)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .offerTo(recipeExporter);

        //Grand Dad Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_GRAND_DAD)
                .pattern("BCC")
                .pattern("BAC")
                .pattern("BBC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.STONE)
                .input('C', Items.FLINT)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(recipeExporter);

        // Nozomi Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_NOZOMI)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.SNOW_BLOCK)
                .criterion(hasItem(Items.SNOW_BLOCK), conditionsFromItem(Items.SNOW_BLOCK))
                .offerTo(recipeExporter);

        // Tito Dick Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_TITO_DICK)
                .pattern("BBB")
                .pattern("BAB")
                .pattern(" B ")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(recipeExporter);

        // Loud Nigra Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_LOUD_NIGRA)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.NOTE_BLOCK)
                .criterion(hasItem(Items.NOTE_BLOCK), conditionsFromItem(Items.NOTE_BLOCK))
                .offerTo(recipeExporter);

        // Chad Warden Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_CHAD_WARDEN)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.OBSIDIAN)
                .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                .offerTo(recipeExporter);

        // The Voice Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_VOICE)
                .pattern("BCB")
                .pattern("BAB")
                .pattern(" B ")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.OBSIDIAN)
                .input('C', Items.ENDER_EYE)
                .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                .criterion(hasItem(Items.ENDER_EYE), conditionsFromItem(Items.ENDER_EYE))
                .offerTo(recipeExporter);

        // Sens Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_SENS)
                .pattern("BCB")
                .pattern("BAB")
                .pattern("BDB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.BONE)
                .input('C', Items.LEATHER_HELMET)
                .input('D', Items.WOODEN_SWORD)
                .criterion(hasItem(Items.BONE), conditionsFromItem(Items.BONE))
                .criterion(hasItem(Items.LEATHER_HELMET), conditionsFromItem(Items.LEATHER_HELMET))
                .criterion(hasItem(Items.WOODEN_SWORD), conditionsFromItem(Items.WOODEN_SWORD))
                .offerTo(recipeExporter);

        // Felix Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_FELIX)
                .pattern("CCC")
                .pattern("CAC")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.LEATHER)
                .input('C', Items.BONE)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .criterion(hasItem(Items.BONE), conditionsFromItem(Items.BONE))
                .offerTo(recipeExporter);

        // Haruka Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_HARUKA)
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.COMPASS)
                .criterion(hasItem(Items.COMPASS), conditionsFromItem(Items.COMPASS))
                .offerTo(recipeExporter);

        // Robbie Rotten Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_ROBBIE_ROTTEN)
                .pattern(" B ")
                .pattern("BAB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.CAKE)
                .criterion(hasItem(Items.CAKE), conditionsFromItem(Items.CAKE))
                .offerTo(recipeExporter);

        // Wood Man Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_WOOD_MAN)
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.OAK_LEAVES)
                .input('C', Items.IRON_INGOT)
                .criterion(hasItem(Items.OAK_LEAVES), conditionsFromItem(Items.OAK_LEAVES))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter);

        // Meta Knight Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_META_KNIGHT)
                .input(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input(Items.IRON_HELMET)
                .input(Items.GOLDEN_SWORD)
                .criterion(hasItem(Items.IRON_HELMET), conditionsFromItem(Items.IRON_HELMET))
                .criterion(hasItem(Items.GOLDEN_SWORD), conditionsFromItem(Items.GOLDEN_SWORD))
                .offerTo(recipeExporter);

        // Santa Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_SANTA)
                .pattern("BCB")
                .pattern("CAC")
                .pattern("BCB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.RED_WOOL)
                .input('C', Blocks.WHITE_WOOL)
                .criterion(hasItem(Items.RED_WOOL), conditionsFromItem(Items.RED_WOOL))
                .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
                .offerTo(recipeExporter);

        //Joke-Explainer Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_JOKE_EXPLAINER)
                .pattern("BCB")
                .pattern("BAB")
                .pattern("BDB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.IRON_INGOT)
                .input('C', Items.TORCH)
                .input('D', Items.BOOK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.TORCH), conditionsFromItem(Items.TORCH))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(recipeExporter);

        //Dr. Andonuts Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_ANDONUTS)
                .pattern("B B")
                .pattern(" A ")
                .pattern(" C ")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.WHITE_WOOL)
                .input('C', Items.CAKE)
                .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
                .criterion(hasItem(Items.CAKE), conditionsFromItem(Items.CAKE))
                .offerTo(recipeExporter);

        // Green de la Bean Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_BEAN)
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.COCOA_BEANS)
                .input('C', Items.GREEN_DYE)
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                .criterion(hasItem(Items.GREEN_DYE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(recipeExporter);

        // SiIva A.I. Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_SIIVA_AI)
                .input(ModItems.MUSIC_DISC_SIIVA)
                .input(ModItems.MUSIC_DISC_GRAND_DAD)
                .input(ModItems.MUSIC_DISC_GADGET)
                .criterion(hasItem(ModItems.MUSIC_DISC_SIIVA), conditionsFromItem(ModItems.MUSIC_DISC_SIIVA))
                .criterion(hasItem(ModItems.MUSIC_DISC_GRAND_DAD), conditionsFromItem(ModItems.MUSIC_DISC_GRAND_DAD))
                .criterion(hasItem(ModItems.MUSIC_DISC_GADGET), conditionsFromItem(ModItems.MUSIC_DISC_GADGET))
                .offerTo(recipeExporter);

        // Haltmann Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_HALTMANN)
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.EGG)
                .input('C', Items.GOLD_INGOT)
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .offerTo(recipeExporter);

        // Susie Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_SUSIE)
                .input(ModItems.MUSIC_DISC_HALTMANN)
                .input(Items.FIRE_CHARGE)
                .criterion(hasItem(ModItems.MUSIC_DISC_HALTMANN), conditionsFromItem(ModItems.MUSIC_DISC_HALTMANN))
                .offerTo(recipeExporter);

        // Kazoo Master Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_KAZOO_MASTER)
                .input(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input(Items.GOAT_HORN)
                .criterion(hasItem(Items.GOAT_HORN), conditionsFromItem(Items.GOAT_HORN))
                .offerTo(recipeExporter);

        // Snoop Dogg Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_SNOOP_DOGG)
                .input(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input(Items.WOLF_ARMOR)
                .input(Items.CROSSBOW)
                .criterion(hasItem(Items.WOLF_ARMOR), conditionsFromItem(Items.WOLF_ARMOR))
                .criterion(hasItem(Items.CROSSBOW), conditionsFromItem(Items.CROSSBOW))
                .offerTo(recipeExporter);

        // Soulja Boy Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_SOULJA_BOY)
                .pattern("BAB")
                .pattern(" C ")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.NOTE_BLOCK)
                .input('C', Items.IRON_SWORD)
                .criterion(hasItem(Items.IRON_SWORD), conditionsFromItem(Items.IRON_SWORD))
                .offerTo(recipeExporter);

        // Chip tha Ripper Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_CHIP)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', ItemTags.SLABS)
                .criterion(hasItem(Items.OAK_SLAB), conditionsFromItem(Items.OAK_SLAB))
                .criterion(hasItem(Items.COBBLESTONE_SLAB), conditionsFromItem(Items.COBBLESTONE_SLAB))
                .offerTo(recipeExporter);

        // Charles Barkley Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_CHARLES_BARKLEY)
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.BLACK_WOOL)
                .input('C', Blocks.ORANGE_WOOL)
                .criterion(hasItem(Items.ORANGE_WOOL), conditionsFromItem(Items.ORANGE_WOOL))
                .offerTo(recipeExporter);



        // HH Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_HH)
                .pattern("BCB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.PAPER)
                .input('C', Items.SNOWBALL)
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(recipeExporter);

        // Nick Crompton Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_NICK_CROMPTON)
                .pattern("BCB")
                .pattern("DAD")
                .pattern("BCB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.BLUE_WOOL)
                .input('C', Blocks.WHITE_WOOL)
                .input('D', Blocks.RED_WOOL)
                .criterion(hasItem(Items.RED_WOOL), conditionsFromItem(Items.RED_WOOL))
                .offerTo(recipeExporter);

        // PSY Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_PSY)
                .pattern("BAB")
                .pattern("CCC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.TINTED_GLASS)
                .input('C', Items.LIGHT_BLUE_CONCRETE)
                .criterion(hasItem(Items.TINTED_GLASS), conditionsFromItem(Items.TINTED_GLASS))
                .offerTo(recipeExporter);

        // Homer Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_HOMER)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.YELLOW_CONCRETE)
                .criterion(hasItem(Items.YELLOW_CONCRETE), conditionsFromItem(Items.YELLOW_CONCRETE))
                .offerTo(recipeExporter);

        // Peter Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_PETER)
                .pattern(" C ")
                .pattern("BAB")
                .pattern("DDD")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.WHITE_WOOL)
                .input('D', Blocks.GREEN_WOOL)
                .input('C', Items.CLOCK)
                .criterion(hasItem(Items.CLOCK), conditionsFromItem(Items.CLOCK))
                .offerTo(recipeExporter);


        // 2B Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_2B)
                .pattern("BBB")
                .pattern("CAC")
                .pattern(" D ")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.IRON_INGOT)
                .input('C', Blocks.BLACK_WOOL)
                .input('D', Items.IRON_SWORD)
                .criterion(hasItem(Items.WEEPING_VINES), conditionsFromItem(Items.WEEPING_VINES))
                .offerTo(recipeExporter);

        // Mr Rental Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_RENTAL)
                .input(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input(Items.MINECART)
                .input(Items.CROSSBOW)
                .criterion(hasItem(Items.CROSSBOW), conditionsFromItem(Items.CROSSBOW))
                .offerTo(recipeExporter);

        // Monika Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_MONIKA)
                .input(ModItems.MUSIC_DISC_MISHA)
                .input(Items.WRITABLE_BOOK)
                .criterion(hasItem(ModItems.MUSIC_DISC_MISHA), conditionsFromItem(ModItems.MUSIC_DISC_MISHA))
                .offerTo(recipeExporter);

        // Misha Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_MISHA)
                .pattern("BBB")
                .pattern("CAC")
                .pattern("DDD")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.RED_CONCRETE)
                .input('C', Blocks.IRON_BLOCK)
                .input('D', Items.BLACK_CONCRETE)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter);


        // Reader and Jerome Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_READER_JEROME)
                .pattern(" A ")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.WRITABLE_BOOK)
                .criterion(hasItem(Items.WRITABLE_BOOK), conditionsFromItem(Items.WRITABLE_BOOK))
                .offerTo(recipeExporter);

        // Ogg Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_OGG)
                .input(ModItems.MUSIC_DISC_READER_JEROME)
                .input(ModItems.MUSIC_DISC_GADGET)
                .criterion(hasItem(ModItems.MUSIC_DISC_READER_JEROME), conditionsFromItem(ModItems.MUSIC_DISC_READER_JEROME))
                .criterion(hasItem(ModItems.MUSIC_DISC_GADGET), conditionsFromItem(ModItems.MUSIC_DISC_GADGET))
                .offerTo(recipeExporter);

        // Inspector Gadget Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_GADGET)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.BRICK)
                .criterion(hasItem(Items.BRICK), conditionsFromItem(Items.BRICK))
                .offerTo(recipeExporter);

        // Nostalgia Critic Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_NOSTALGIA_CRITIC)
                .pattern("B ")
                .pattern("AC")
                .input('A', ModItems.MUSIC_DISC_GADGET)
                .input('B', Items.LEATHER_HELMET)
                .input('C', Items.CROSSBOW)
                .criterion(hasItem(ModItems.MUSIC_DISC_GADGET), conditionsFromItem(ModItems.MUSIC_DISC_GADGET))
                .offerTo(recipeExporter);

        // Hamood Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_TAKANE)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', ModItems.BAT_WING)
                .criterion(hasItem(ModItems.BAT_WING), conditionsFromItem(ModItems.BAT_WING))
                .offerTo(recipeExporter);

        // Ajit Pai Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_AJIT_PAI)
                .pattern("BBB")
                .pattern("BAB")
                .pattern(" C ")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.COCOA_BEANS)
                .input('C', Items.BUCKET)
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                .criterion(hasItem(Items.BUCKET), conditionsFromItem(Items.BUCKET))
                .offerTo(recipeExporter);

        //Geno Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_GENO)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', ItemTags.PLANKS)
                .criterion(hasItem(Items.ACACIA_PLANKS), conditionsFromItem(Items.ACACIA_PLANKS))
                .criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS))
                .criterion(hasItem(Items.BIRCH_PLANKS), conditionsFromItem(Items.BIRCH_PLANKS))
                .criterion(hasItem(Items.JUNGLE_PLANKS), conditionsFromItem(Items.JUNGLE_PLANKS))
                .criterion(hasItem(Items.SPRUCE_PLANKS), conditionsFromItem(Items.SPRUCE_PLANKS))
                .criterion(hasItem(Items.DARK_OAK_PLANKS), conditionsFromItem(Items.DARK_OAK_PLANKS))
                .criterion(hasItem(Items.BAMBOO_PLANKS), conditionsFromItem(Items.BAMBOO_PLANKS))
                .criterion(hasItem(Items.CHERRY_PLANKS), conditionsFromItem(Items.CHERRY_PLANKS))
                .criterion(hasItem(Items.CRIMSON_PLANKS), conditionsFromItem(Items.CRIMSON_PLANKS))
                .criterion(hasItem(Items.WARPED_PLANKS), conditionsFromItem(Items.WARPED_PLANKS))
                .criterion(hasItem(Items.MANGROVE_PLANKS), conditionsFromItem(Items.MANGROVE_PLANKS))
                .offerTo(recipeExporter);

        // Off the Hook Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_OFF_THE_HOOK)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.INK_SAC)
                .criterion(hasItem(Items.INK_SAC), conditionsFromItem(Items.INK_SAC))
                .offerTo(recipeExporter);

        // Weird Al Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_WEIRD_AL)
                .pattern("BCC")
                .pattern("BAD")
                .pattern("BCC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', ItemTags.PLANKS)
                .input('C', Blocks.WHITE_WOOL)
                .input('D', Blocks.BLACK_WOOL)
                .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(recipeExporter);

        // Pitbull and the Aliens Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_PITBULL)
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.MAP)
                .criterion(hasItem(Items.MAP), conditionsFromItem(Items.MAP))
                .offerTo(recipeExporter);

        // Nintendo Power Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_NINTENDO_POWER)
                .pattern("BCD")
                .pattern("BAD")
                .pattern("BCD")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.RED_CONCRETE)
                .input('C', Blocks.GLASS_PANE)
                .input('D', Items.LIGHT_BLUE_CONCRETE)
                .criterion(hasItem(Items.GLASS_PANE), conditionsFromItem(Items.GLASS_PANE))
                .offerTo(recipeExporter);

        // ZUN Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_ZUN)
                .input(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input(Items.GOAT_HORN)
                .input(Items.GOAT_HORN)
                .input(Items.GOAT_HORN)
                .input(Items.POTION)
                .criterion(hasItem(Items.GOAT_HORN), conditionsFromItem(Items.GOAT_HORN))
                .criterion(hasItem(Items.POTION), conditionsFromItem(Items.POTION))
                .offerTo(recipeExporter);

        // Thanos Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_THANOS)
                .input(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input(Items.REDSTONE)
                .input(Items.COPPER_INGOT)
                .input(Items.GOLD_INGOT)
                .input(Items.EMERALD)
                .input(Items.DIAMOND)
                .input(Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(recipeExporter);

        // Wario/Waluigi Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_WARIO_WALUIGI)
                .pattern("CBB")
                .pattern("CAB")
                .pattern("CCB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.PURPLE_CONCRETE)
                .input('C', Items.YELLOW_CONCRETE)
                .criterion(hasItem(Items.PURPLE_CONCRETE), conditionsFromItem(Items.PURPLE_CONCRETE))
                .criterion(hasItem(Items.YELLOW_CONCRETE), conditionsFromItem(Items.YELLOW_CONCRETE))
                .offerTo(recipeExporter);

        // King Dedede Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_DEDEDE)
                .pattern("B  ")
                .pattern("CA ")
                .pattern("C  ")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.OAK_LOG)
                .input('C', Items.STICK)
                .criterion(hasItem(Items.OAK_LOG), conditionsFromItem(Items.OAK_LOG))
                .offerTo(recipeExporter);

        // Snake Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_SNAKE)
                .pattern("B")
                .pattern("A")
                .pattern("B")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.SHULKER_SHELL)
                .criterion(hasItem(Items.SHULKER_SHELL), conditionsFromItem(Items.SHULKER_SHELL))
                .offerTo(recipeExporter);


        // DJ Professor K Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_DJ_PROFESSOR_K)
                .pattern("CBC")
                .pattern("CAC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.REDSTONE_BLOCK)
                .input('C', Blocks.GOLD_BLOCK)
                .criterion(hasItem(Items.REDSTONE_BLOCK), conditionsFromItem(Items.REDSTONE_BLOCK))
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter);


        // Etika Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_ETIKA)
                .pattern("B B")
                .pattern("CAC")
                .pattern("DDD")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.WHITE_WOOL)
                .input('C', Blocks.BLACK_WOOL)
                .input('D', Blocks.PACKED_ICE)
                .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(Items.PACKED_ICE), conditionsFromItem(Items.PACKED_ICE))
                .offerTo(recipeExporter);

        // HyperCam 2 Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_HYPERCAM)
                .pattern("CBC")
                .pattern("CAC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.REDSTONE_BLOCK)
                .input('C', Items.GOLD_INGOT)
                .criterion(hasItem(Items.REDSTONE_BLOCK), conditionsFromItem(Items.REDSTONE_BLOCK))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(recipeExporter);

        // Adam Levine Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_ADAM_LEVINE)
                .pattern("B B")
                .pattern("BAB")
                .pattern(" B ")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.WEEPING_VINES)
                .criterion(hasItem(Items.WEEPING_VINES), conditionsFromItem(Items.WEEPING_VINES))
                .offerTo(recipeExporter);

        // Johnny Bravo Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_JOHNNY_BRAVO)
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.COAL_BLOCK)
                .input('C', Blocks.QUARTZ_BLOCK)
                .criterion(hasItem(Items.COAL_BLOCK), conditionsFromItem(Items.COAL_BLOCK))
                .offerTo(recipeExporter);

        // Mr. Krabs Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_KRABS)
                .pattern("CCC")
                .pattern("DAD")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.FIRE_CORAL_BLOCK)
                .input('C', Items.GOLD_NUGGET)
                .input('D', Items.SHEARS)
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(recipeExporter);

        // Mariya Takeuchi Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_MARIYA_TAKEUCHI)
                .pattern("B B")
                .pattern(" A ")
                .pattern("B B")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.BELL)
                .criterion(hasItem(Items.BELL), conditionsFromItem(Items.BELL))
                .offerTo(recipeExporter);

        // Dr. Robotnik Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_ROBOTNIK)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.EGG)
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .offerTo(recipeExporter);

        // Daft Punk Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_DAFT_PUNK)
                .pattern("CBC")
                .pattern("DAE")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.LEATHER_HELMET)
                .input('C', Items.IRON_HELMET)
                .input('D', Items.CROSSBOW)
                .input('E', Items.DIAMOND_SWORD)
                .criterion(hasItem(Items.CROSSBOW), conditionsFromItem(Items.CROSSBOW))
                .criterion(hasItem(Items.DIAMOND_SWORD), conditionsFromItem(Items.DIAMOND_SWORD))
                .offerTo(recipeExporter);

        // Papyrus Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_PAPYRUS)
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CBC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.BONE)
                .input('C', Items.BLUE_DYE)
                .criterion(hasItem(Items.BONE), conditionsFromItem(Items.BONE))
                .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(recipeExporter);

        //Jack & Elmo Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_JACK_ELMO)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.REDSTONE_BLOCK)
                .criterion(hasItem(Items.REDSTONE_BLOCK), conditionsFromItem(Items.REDSTONE_BLOCK))
                .offerTo(recipeExporter);

        // Dr. Piccolo Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_PICCOLO)
                .pattern("CBC")
                .pattern("BAB")
                .pattern("CDC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.GREEN_CONCRETE)
                .input('C', Items.PURPLE_CONCRETE)
                .input('D', Items.POTION)
                .criterion(hasItem(Items.GREEN_CONCRETE), conditionsFromItem(Items.GREEN_CONCRETE))
                .criterion(hasItem(Items.PURPLE_CONCRETE), conditionsFromItem(Items.PURPLE_CONCRETE))
                .criterion(hasItem(Items.POTION), conditionsFromItem(Items.POTION))
                .offerTo(recipeExporter);

        //Jack Bros Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_JACK_BROS)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("CCC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.SNOWBALL)
                .input('C', Items.PHANTOM_MEMBRANE)
                .criterion(hasItem(Items.SNOWBALL), conditionsFromItem(Items.SNOWBALL))
                .criterion(hasItem(Items.PHANTOM_MEMBRANE), conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(recipeExporter);

        // HOBaRT Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_HOBART)
                .pattern("BCD")
                .pattern("IAE")
                .pattern("HGF")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.APPLE)
                .input('C', Items.CARROT)
                .input('D', Items.POTATO)
                .input('E', Items.MELON)
                .input('F', Blocks.PUMPKIN)
                .input('G', Items.BEETROOT)
                .input('H', Items.SWEET_BERRIES)
                .input('I', Items.WHEAT)
                .criterion(hasItem(Items.PUMPKIN), conditionsFromItem(Items.PUMPKIN))
                .offerTo(recipeExporter);

        //Rhythm Masters Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_RHYTHM_MASTERS)
                .pattern("BAB")
                .pattern(" C ")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.NOTE_BLOCK)
                .input('C', Blocks.REPEATER)
                .criterion(hasItem(Items.NOTE_BLOCK), conditionsFromItem(Items.NOTE_BLOCK))
                .criterion(hasItem(Items.REPEATER), conditionsFromItem(Items.REPEATER))
                .offerTo(recipeExporter);

        //Nico Nico Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_NICO_NICO)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter);

        // MissingNo Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_MISSINGNO)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', ModItems.MISSINGNO_FRAGMENT)
                .criterion(hasItem(ModItems.MISSINGNO_FRAGMENT), conditionsFromItem(ModItems.MISSINGNO_FRAGMENT))
                .offerTo(recipeExporter);

        // Eminem Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_EMINEM)
                .pattern("B B")
                .pattern(" A ")
                .pattern("B B")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.LAVA_BUCKET)
                .criterion(hasItem(Items.IRON_HELMET), conditionsFromItem(Items.IRON_HELMET))
                .criterion(hasItem(Items.LAVA_BUCKET), conditionsFromItem(Items.LAVA_BUCKET))
                .offerTo(recipeExporter);

        // John Notwoodman Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_JOHN_NOTWOODMAN)
                .pattern("B")
                .pattern("A")
                .input('A', ModItems.MUSIC_DISC_WOOD_MAN)
                .input('B', Items.LEATHER_HELMET)
                .criterion(hasItem(ModItems.MUSIC_DISC_WOOD_MAN), conditionsFromItem(ModItems.MUSIC_DISC_WOOD_MAN))
                .offerTo(recipeExporter);

        // Mr. Bean Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_MR_BEAN)
                .pattern("BCB")
                .pattern("DAD")
                .pattern("BCB")
                .input('A', ModItems.MUSIC_DISC_BEAN)
                .input('B', Blocks.BLUE_WOOL)
                .input('C', Blocks.WHITE_WOOL)
                .input('D', Blocks.RED_WOOL)
                .criterion(hasItem(ModItems.MUSIC_DISC_BEAN), conditionsFromItem(ModItems.MUSIC_DISC_BEAN))
                .offerTo(recipeExporter);

        // Cool Meme Team Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_COOL_MEME_TEAM)
                .input(Items.APPLE)
                .input(Items.RABBIT_FOOT)
                .input(Blocks.RED_WOOL)
                .input(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .criterion(hasItem(Items.RABBIT_FOOT), conditionsFromItem(Items.RABBIT_FOOT))
                .offerTo(recipeExporter);

        // Pomni Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_POMNI)
                .pattern("BCB")
                .pattern("CAC")
                .pattern("BCB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.RED_WOOL)
                .input('C', Blocks.BLUE_WOOL)
                .criterion(hasItem(Items.RED_WOOL), conditionsFromItem(Items.RED_WOOL))
                .criterion(hasItem(Items.BLUE_WOOL), conditionsFromItem(Items.BLUE_WOOL))
                .offerTo(recipeExporter);

        // Gedagedi Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_GEDAGEDI)
                .pattern("BCB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.COOKED_CHICKEN)
                .input('C', Items.LEATHER_HELMET)
                .criterion(hasItem(Items.COOKED_CHICKEN), conditionsFromItem(Items.COOKED_CHICKEN))
                .criterion(hasItem(Items.LEATHER_HELMET), conditionsFromItem(Items.LEATHER_HELMET))
                .offerTo(recipeExporter);

        // Numberphile Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_NUMBERPHILE)
                .input(Items.MUSIC_DISC_5)
                .input(Items.MUSIC_DISC_11)
                .input(Items.MUSIC_DISC_13)
                .criterion(hasItem(Items.MUSIC_DISC_5), conditionsFromItem(Items.MUSIC_DISC_5))
                .criterion(hasItem(Items.MUSIC_DISC_11), conditionsFromItem(Items.MUSIC_DISC_11))
                .criterion(hasItem(Items.MUSIC_DISC_13), conditionsFromItem(Items.MUSIC_DISC_13))
                .offerTo(recipeExporter);

        // Charlie Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_CHARLIE)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.COOKED_BEEF)
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(Items.COOKED_BEEF))
                .offerTo(recipeExporter);

        // Silento Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_SILENTO)
                .input(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input(Items.FISHING_ROD)
                .input(Items.LEATHER_HORSE_ARMOR)
                .input(Items.LEATHER_HORSE_ARMOR)
                .criterion(hasItem(Items.FISHING_ROD), conditionsFromItem(Items.FISHING_ROD))
                .offerTo(recipeExporter);

        // HCB Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_HCB)
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.BREAD)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .offerTo(recipeExporter);

        // Gaijin Goomba Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_GAIJIN_GOOMBA)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BCB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.BROWN_MUSHROOM)
                .input('C', Items.IRON_SWORD)
                .criterion(hasItem(Items.BROWN_MUSHROOM), conditionsFromItem(Items.BROWN_MUSHROOM))
                .criterion(hasItem(Items.IRON_SWORD), conditionsFromItem(Items.IRON_SWORD))
                .offerTo(recipeExporter);

        // Freddy Fazbear Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_FREDDY_FAZBEAR)
                .pattern(" B ")
                .pattern("CAC")
                .pattern("DDD")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.LEATHER_HELMET)
                .input('C', Items.LEATHER)
                .input('D', Items.IRON_INGOT)
                .criterion(hasItem(Items.BLUE_CONCRETE), conditionsFromItem(Items.BLUE_CONCRETE))
                .criterion(hasItem(Items.GREEN_CONCRETE), conditionsFromItem(Items.GREEN_CONCRETE))
                .offerTo(recipeExporter);

        // Boyfriend Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_BOYFRIEND)
                .pattern(" A ")
                .pattern("B B")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.HEART_OF_THE_SEA)
                .criterion(hasItem(Items.HEART_OF_THE_SEA), conditionsFromItem(Items.HEART_OF_THE_SEA))
                .offerTo(recipeExporter);

        // Baroes Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_BAROES)
                .pattern("BCB")
                .pattern("CAC")
                .pattern("BCB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.LIME_CONCRETE)
                .input('C', Blocks.BLUE_CONCRETE)
                .criterion(hasItem(Items.BLUE_CONCRETE), conditionsFromItem(Items.BLUE_CONCRETE))
                .criterion(hasItem(Items.LIME_CONCRETE), conditionsFromItem(Items.LIME_CONCRETE))
                .offerTo(recipeExporter);

        // Raft Ride Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_RAFT_RIDE)
                .input(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input(Items.BAMBOO_RAFT)
                .criterion(hasItem(Items.BAMBOO_RAFT), conditionsFromItem(Items.BAMBOO_RAFT))
                .offerTo(recipeExporter);

        // Hamood Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_HAMOOD)
                .pattern("BBB")
                .pattern("CAC")
                .pattern("DDD")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.BLACK_WOOL)
                .input('C', Blocks.LIME_WOOL)
                .input('D', Blocks.BROWN_WOOL)
                .criterion(hasItem(Items.LIME_WOOL), conditionsFromItem(Items.LIME_WOOL))
                .offerTo(recipeExporter);

        // Totino's Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_TOTINOS)
                .pattern("BBB")
                .pattern(" A ")
                .pattern("BBB")
                .input('A', ModItems.MUSIC_DISC_ROBOTNIK)
                .input('B', Items.WHEAT)
                .criterion(hasItem(ModItems.MUSIC_DISC_ROBOTNIK), conditionsFromItem(ModItems.MUSIC_DISC_ROBOTNIK))
                .offerTo(recipeExporter);

        // Sean Kingston Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_SEAN_KINGSTON)
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" C ")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.BONE)
                .input('C', ItemTags.BOATS)
                .criterion(hasItem(Items.BONE), conditionsFromItem(Items.BONE))
                .offerTo(recipeExporter);

        // Smooth Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_SMOOTH)
                .input(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input(Blocks.SMOOTH_BASALT)
                .input(Blocks.SMOOTH_STONE)
                .input(Blocks.SMOOTH_SANDSTONE)
                .input(Blocks.SMOOTH_QUARTZ)
                .input(Blocks.SMOOTH_RED_SANDSTONE)
                .criterion(hasItem(Items.SMOOTH_BASALT), conditionsFromItem(Items.SMOOTH_BASALT))
                .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                .criterion(hasItem(Items.SMOOTH_SANDSTONE), conditionsFromItem(Items.SMOOTH_SANDSTONE))
                .criterion(hasItem(Items.SMOOTH_QUARTZ), conditionsFromItem(Items.SMOOTH_QUARTZ))
                .criterion(hasItem(Items.SMOOTH_RED_SANDSTONE), conditionsFromItem(Items.SMOOTH_RED_SANDSTONE))
                .offerTo(recipeExporter);

        // Bob Dylan Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_BOB_DYLAN)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("CBC")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.SHORT_GRASS)
                .input('C', Items.TORCH)
                .criterion(hasItem(Items.SHORT_GRASS), conditionsFromItem(Items.SHORT_GRASS))
                .offerTo(recipeExporter);

        // KSI Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_KSI)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.ICE)
                .criterion(hasItem(Items.ICE), conditionsFromItem(Items.ICE))
                .offerTo(recipeExporter);

        // Burnice Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_BURNICE)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.MAGMA_BLOCK)
                .criterion(hasItem(Items.MAGMA_BLOCK), conditionsFromItem(Items.MAGMA_BLOCK))
                .offerTo(recipeExporter);

        // Super Idol Disc Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_SUPER_IDOL)
                .input(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(recipeExporter);

        // Max Verstappen Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_MAX_VERSTAPPEN)
                .pattern("B")
                .pattern("A")
                .pattern("C")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Items.IRON_HELMET)
                .input('C', Items.MINECART)
                .criterion(hasItem(Items.IRON_HELMET), conditionsFromItem(Items.IRON_HELMET))
                .criterion(hasItem(Items.MINECART), conditionsFromItem(Items.MINECART))
                .offerTo(recipeExporter);

        // Noaka Disc Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_NOAKA)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BCB")
                .input('A', ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .input('B', Blocks.GOLD_BLOCK)
                .input('C', Items.NETHER_STAR)
                .criterion(hasItem(Items.NETHER_STAR), conditionsFromItem(Items.NETHER_STAR))
                .offerTo(recipeExporter);
    }


}
