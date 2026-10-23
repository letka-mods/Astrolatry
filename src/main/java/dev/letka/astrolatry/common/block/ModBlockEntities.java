package dev.letka.astrolatry.common.block;

import dev.letka.astrolatry.Astrolatry;
import dev.letka.astrolatry.common.block.entity.HookBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<HookBlockEntity> HOOK_BLOCK_ENTITY_BLOCK_ENTITY_TYPE = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            Identifier.of(Astrolatry.MOD_ID, "hook"),
            FabricBlockEntityTypeBuilder.create(HookBlockEntity::new,
                    ModBlocks.HOOK).build());

    public static void registerBlockEntities() {
        Astrolatry.LOGGER.info("Registering Block Entities for " + Astrolatry.MOD_ID);
    }

}