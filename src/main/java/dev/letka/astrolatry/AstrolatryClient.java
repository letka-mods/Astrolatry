package dev.letka.astrolatry;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class AstrolatryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(dev.letka.astrolatry.common.block.ModBlocks.KAPTUSIA_PLUSHIE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(dev.letka.astrolatry.common.block.ModBlocks.HOOK, RenderLayer.getCutout());

        BlockEntityRendererFactories.register(dev.letka.astrolatry.common.block.ModBlockEntities.HOOK_BLOCK_ENTITY_BLOCK_ENTITY_TYPE, dev.letka.astrolatry.common.block.entity.renderer.HookBlockEntityRenderer::new);
    }
}
