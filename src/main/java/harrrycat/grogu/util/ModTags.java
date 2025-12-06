package harrrycat.grogu.util;

import harrrycat.grogu.Grogu;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static harrrycat.grogu.Grogu.id;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createtag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Grogu.MOD_ID));
        }

        public static class Items {
            public static final TagKey<Item> CAN_LGM_EAT = TagKey.of(RegistryKeys.ITEM, id("grogu_can_eat"));
            public static final TagKey<Item> CAN_LGM_EQUIP = TagKey.of(RegistryKeys.ITEM, id("grogu_can_eat"));

            private static TagKey<Item> createtag(String name) {
                return TagKey.of(RegistryKeys.ITEM, Identifier.of(Grogu.MOD_ID));
            }
        }

    }
}
