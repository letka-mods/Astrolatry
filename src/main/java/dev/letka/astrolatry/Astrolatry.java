package dev.letka.astrolatry;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Astrolatry implements ModInitializer {
	public static final String MOD_ID = "astrolatry";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		dev.letka.astrolatry.common.item.ModItemGroups.registerItemGroups();
		dev.letka.astrolatry.common.item.ModItems.registerModItems();
		dev.letka.astrolatry.common.block.ModBlocks.registerModBlocks();
		dev.letka.astrolatry.common.block.ModBlockEntities.registerBlockEntities();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
