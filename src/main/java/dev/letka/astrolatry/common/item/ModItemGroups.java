package dev.letka.astrolatry.common.item;

import dev.letka.astrolatry.Astrolatry;
import dev.letka.astrolatry.common.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ASTROLATRY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Astrolatry.MOD_ID, "astrolatry"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.astrolatry"))
                    .icon(() -> new ItemStack(ModItems.STELLAR_CRYSTAL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.STELLAR_CRYSTAL);
                        entries.add(ModItems.STAR_INFUSED_POWDER);
                        entries.add(ModItems.TWIG);
                        entries.add(ModItems.WAND);
                        entries.add(ModItems.COPPER_POWDER);
                        entries.add(ModItems.GOLD_POWDER);
                        entries.add(ModItems.TUMBAGA_POWDER);
                        entries.add(ModItems.TUMBAGA_INGOT);
                        entries.add(ModItems.STARGAZER);

                        entries.add(ModBlocks.HOOK);

                        entries.add(ModBlocks.KAPTUSIA_PLUSHIE);
                    }).build());

    public static void registerItemGroups() {
        Astrolatry.LOGGER.info("Registering Item Groups for " + Astrolatry.MOD_ID);
    }
}