package dev.letka.astrolatry.common.item;

import dev.letka.astrolatry.Astrolatry;
import dev.letka.astrolatry.common.item.custom.StargazerItem;
import dev.letka.astrolatry.common.item.custom.StellarCrystalItem;
import dev.letka.astrolatry.common.item.custom.StellarPowderItem;
import dev.letka.astrolatry.common.item.custom.WandItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STELLAR_CRYSTAL = registerItem("stellar_crystal", new StellarCrystalItem(new Item.Settings()));

    public static final Item STAR_INFUSED_POWDER = registerItem("stellar_powder", new StellarPowderItem(new Item.Settings()));

    public static final Item TWIG = registerItem("twig", new Item(new Item.Settings()));

    public static final Item WAND = registerItem("wand", new WandItem(new Item.Settings().maxCount(1)));

    public static final Item COPPER_POWDER = registerItem("copper_powder", new Item(new Item.Settings()));

    public static final Item GOLD_POWDER = registerItem("gold_powder", new Item(new Item.Settings()));

    public static final Item TUMBAGA_POWDER = registerItem("tumbaga_powder", new Item(new Item.Settings()));

    public static final Item TUMBAGA_INGOT = registerItem("tumbaga_ingot", new Item(new Item.Settings()));

    public static final Item STARGAZER = registerItem("stargazer", new StargazerItem(new Item.Settings()));

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, Identifier.of(Astrolatry.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Astrolatry.LOGGER.info("Registering Mod Items for " + Astrolatry.MOD_ID);
    }
}