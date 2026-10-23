package dev.letka.astrolatry.common.block;

import dev.letka.astrolatry.Astrolatry;
import dev.letka.astrolatry.common.block.custom.HookBlock;
import dev.letka.astrolatry.common.block.custom.PlushieBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
public class ModBlocks {

    public static final Block KAPTUSIA_PLUSHIE = registerBlock("kaptusia_plushie",
            new PlushieBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));

    public static final Block HOOK = registerBlock("hook",
            new HookBlock(AbstractBlock.Settings.create()
                    .solid().
                    requiresTool().
                    strength(1.0F, 2.0F).
                    sounds(BlockSoundGroup.CHAIN).nonOpaque())
            );

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Astrolatry.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(Astrolatry.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Astrolatry.LOGGER.info("Registering Mod Blocks for " + Astrolatry.MOD_ID);
    }


}