package harrrycat.grogu.renderers;

import harrrycat.grogu.Grogu;
import harrrycat.grogu.entity.GroguEntity;

import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GroguEntityRenderer extends MobEntityRenderer<GroguEntity, LivingEntityRenderState, GroguModel>
{
	public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(Grogu.id("grogu"), "temp");
	public static final Identifier TEXTURE = (Grogu.id("textures/entity/grogu.png"));
	public GroguEntityRenderer(EntityRendererFactory.Context context)
	{
		super(context, new GroguModel(context.getPart(MODEL_LAYER)), 0.1f);
	}

	@Override
	public Identifier getTexture(LivingEntityRenderState state)
	{
		return TEXTURE;
	}

	@Override
	public LivingEntityRenderState createRenderState()
	{
		return new LivingEntityRenderState();
	}

	@Override
	public void render(LivingEntityRenderState livingEntityRenderState, MatrixStack matrixStack, OrderedRenderCommandQueue queue, CameraRenderState i)
	{
		super.render(livingEntityRenderState, matrixStack, queue, i);
	}
}

