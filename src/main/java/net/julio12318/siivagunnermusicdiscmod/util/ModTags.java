package net.julio12318.siivagunnermusicdiscmod.util;

import net.julio12318.siivagunnermusicdiscmod.SiIvaGunnerMusicDiscMod;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> KIRBY_DISCS = createTag("kirby_discs");
        public static final TagKey<Item> LAZYTOWN_DISCS = createTag("lazytown_discs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(SiIvaGunnerMusicDiscMod.MOD_ID, name));
        }
    }
}
