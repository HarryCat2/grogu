package harrrycat.grogu;

import harrrycat.grogu.renderers.GroguEntityRenderer;
import harrrycat.grogu.renderers.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class GroguClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.register(Grogu.GROGU_ENTITY, GroguEntityRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(GroguEntityRenderer.MODEL_LAYER, GroguModel::getTexturedModelData);
	}
}