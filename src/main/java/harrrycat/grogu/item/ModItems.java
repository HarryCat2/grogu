package harrrycat.grogu.item;

import harrrycat.grogu.Grogu;

import net.minecraft.item.Item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.Locale;
import java.util.function.Function;

import static net.minecraft.item.Items.register;

public class ModItems {

    // Grogu Armor
    public static final Item BESKAR_CHAINMAIL = registerItem(
            "beskar_chainmail",
            settings -> new Item(settings
                    .maxCount(1)
                    .fireproof()
            )
    );
    public static final Item RONDEL = registerItem(
            "rondel",
            settings -> new Item(settings
                    .maxCount(1)
                    .fireproof()

            )
    );
    public static final Item BLUE_COOKIES = registerItem(
            "blue_cookies",
            settings -> new BlueCookieItem(settings
                    .maxCount(8)
                    //.food(ModFoodComponents.BLUE_COOKIES)
            )
    );

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(Grogu.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Grogu.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Grogu.LOGGER.info("Registering Mod Items for " + Grogu.MOD_ID);

    }
}
