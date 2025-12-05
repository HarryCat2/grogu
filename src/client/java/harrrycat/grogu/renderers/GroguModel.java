package harrrycat.grogu.renderers;

import harrrycat.grogu.Grogu;
import harrrycat.grogu.entity.GroguEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class GroguModel extends EntityModel<EntityRenderState>
{

	private final ModelPart legs;
	private final ModelPart torso;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart left_ear;
	private final ModelPart right_ear;
	private final ModelPart left_arm;
	private final ModelPart left_hand;
	private final ModelPart right_arm;
	private final ModelPart right_hand;
	public GroguModel(ModelPart root) {

        super(root);
		this.legs = root.getChild("legs");
		this.torso = this.legs.getChild("torso");
		this.neck = this.torso.getChild("neck");
		this.head = this.neck.getChild("head");
		this.left_ear = this.head.getChild("left_ear");
		this.right_ear = this.head.getChild("right_ear");
		this.left_arm = this.torso.getChild("left_arm");
		this.left_hand = this.left_arm.getChild("left_hand");
		this.right_arm = this.torso.getChild("right_arm");
		this.right_hand = this.right_arm.getChild("right_hand");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData legs = modelPartData.addChild("legs", ModelPartBuilder.create().uv(0, 0).cuboid(-2.5F, -2.75F, -2.15F, 5.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 23.75F, 0.15F, 0.0F, 0.0F, 0.0F));

		ModelPartData torso = legs.addChild("torso", ModelPartBuilder.create().uv(0, 13).cuboid(-2.25F, -2.5F, -1.6F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.25F, -3.25F, 0.0F, 0.0F, 0.0F, 0.0F));

		ModelPartData neck = torso.addChild("neck", ModelPartBuilder.create().uv(0, 7).cuboid(-2.75F, 0.0F, -2.15F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F));

		ModelPartData head = neck.addChild("head", ModelPartBuilder.create().uv(14, 13).cuboid(-2.25F, -1.5F, -1.65F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		ModelPartData left_ear = head.addChild("left_ear", ModelPartBuilder.create(), ModelTransform.of(1.75F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = left_ear.addChild("cube_r1", ModelPartBuilder.create().uv(18, 4).cuboid(0.0F, 0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(11, 14).cuboid(0.0F, 1.5F, 0.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, -0.2F, 0.0F, 0.0F, 0.2182F));

		ModelPartData right_ear = head.addChild("right_ear", ModelPartBuilder.create(), ModelTransform.of(-2.25F, -1.5F, 0.0F,0.0F, 0.0F, 0.0F));

		ModelPartData cube_r2 = right_ear.addChild("cube_r2", ModelPartBuilder.create().uv(18, 5).cuboid(-4.0F, 0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(11, 13).cuboid(-3.0F, 1.5F, 0.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, -0.2F, 0.0F, 0.0F, -0.2182F));

		ModelPartData left_arm = torso.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.of(1.5F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F));

		ModelPartData cube_r3 = left_arm.addChild("cube_r3", ModelPartBuilder.create().uv(14, 7).cuboid(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData left_hand = left_arm.addChild("left_hand", ModelPartBuilder.create(), ModelTransform.of(0.984F, 2.0161F, -0.0107F, 0.0F, 0.0F, 0.0F));

		ModelPartData cube_r4 = left_hand.addChild("cube_r4", ModelPartBuilder.create().uv(0, 2).cuboid(0.0303F, -0.5303F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0337F, 0.0446F, -0.4893F, 0.0F, 0.0F, 0.7854F));

		ModelPartData right_arm = torso.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.of(-2.0F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F));

		ModelPartData cube_r5 = right_arm.addChild("cube_r5", ModelPartBuilder.create().uv(14, 0).cuboid(-2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData right_hand = right_arm.addChild("right_hand", ModelPartBuilder.create(), ModelTransform.of(-1.0358F, 2.0373F, -0.0255F, 0.0F, 0.0F, 0.0F));

		ModelPartData cube_r6 = right_hand.addChild("cube_r6", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0303F, -0.5303F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0181F, 0.0234F, -0.4745F, 0.0F, 0.0F, -0.7854F));
		return TexturedModelData.of(modelData, 32, 32);
	}

	@Override
	public void setAngles(EntityRenderState state)
	{
		super.setAngles(state);
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        //this.setHeadAngles(netHeadYaw, headPitch);
	}

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

        this.head.yaw = headYaw * (float) (Math.PI / 180.0);
        this.head.pitch = headPitch * (float) (Math.PI / 180.0);
    }


    public ModelPart getPart() {
        return torso;
    }

}