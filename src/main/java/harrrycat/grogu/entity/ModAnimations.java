package harrrycat.grogu.entity;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class ModAnimations {
    public static final Animation animation.grogu.walk = Animation.Builder.create(2.9167F).looping()
		.addBoneAnimation("legs", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.6991F, -12.215F, 8.6244F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-3.7474F, -24.6732F, 10.9742F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.0833F, AnimationHelper.createRotationalVector(0.0F, -20.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.7083F, AnimationHelper.createRotationalVector(-6.4293F, 2.8392F, -4.5797F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.3333F, AnimationHelper.createRotationalVector(-1.3112F, 10.3962F, 2.908F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.9167F, AnimationHelper.createRotationalVector(-2.6991F, -12.215F, 8.6244F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.4583F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.0833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.7083F, AnimationHelper.createRotationalVector(-4.9953F, 0.2178F, -2.5095F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.3333F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 5.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("neck", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.4583F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.0833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.7083F, AnimationHelper.createRotationalVector(-2.4905F, 0.2178F, 2.4953F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.3333F, AnimationHelper.createRotationalVector(-2.4976F, -0.109F, -4.9976F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.4583F, AnimationHelper.createRotationalVector(0.4369F, 4.9809F, 2.519F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.0833F, AnimationHelper.createRotationalVector(7.5F, 0.0F, -2.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.7083F, AnimationHelper.createRotationalVector(-2.3201F, -12.3914F, -4.1575F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.3333F, AnimationHelper.createRotationalVector(0.1799F, -12.3914F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_ear", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.4583F, AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.0833F, AnimationHelper.createRotationalVector(0.9845F, -7.4355F, -7.564F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.7083F, AnimationHelper.createRotationalVector(0.9997F, -12.4347F, -7.6518F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.3333F, AnimationHelper.createRotationalVector(-0.0727F, -6.5485F, 1.2013F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_ear", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.4583F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 7.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.0833F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 7.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.7083F, AnimationHelper.createRotationalVector(1.6322F, 7.3212F, 20.1044F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.3333F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 7.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.4583F, AnimationHelper.createRotationalVector(15.0F, 0.0F, -15.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.0833F, AnimationHelper.createRotationalVector(2.9622F, -0.5221F, -3.0213F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.7083F, AnimationHelper.createRotationalVector(-10.9595F, -2.829F, -13.5076F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.3333F, AnimationHelper.createRotationalVector(-18.5936F, -2.3726F, -14.8693F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-12.3964F, 1.6189F, 7.3242F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.0833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.7083F, AnimationHelper.createRotationalVector(23.307F, -9.3073F, 20.5764F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.3333F, AnimationHelper.createRotationalVector(-2.9596F, -6.5225F, 13.1723F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .build();

    public static final Animation animation.grogu.run = Animation.Builder.create(1.875F).looping()
		.addBoneAnimation("legs", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.6991F, -12.215F, 8.6244F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.375F, AnimationHelper.createRotationalVector(-1.2474F, -24.6732F, 10.9742F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.9096F, -19.9802F, -2.6602F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.125F, AnimationHelper.createRotationalVector(-6.4293F, 2.8392F, -4.5797F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.5F, AnimationHelper.createRotationalVector(-1.3112F, 10.3962F, 2.908F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.875F, AnimationHelper.createRotationalVector(-2.6991F, -12.215F, 8.6244F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.375F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 5.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.125F, AnimationHelper.createRotationalVector(-4.9953F, 0.2178F, -2.5095F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.5F, AnimationHelper.createRotationalVector(7.4811F, -0.4352F, 9.9811F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("neck", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.375F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.125F, AnimationHelper.createRotationalVector(-2.4905F, 0.2178F, 2.4953F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.5F, AnimationHelper.createRotationalVector(-2.4976F, -0.109F, -4.9976F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.375F, AnimationHelper.createRotationalVector(0.4369F, 4.9809F, 2.519F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, -2.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.125F, AnimationHelper.createRotationalVector(-2.3201F, -12.3914F, -4.1575F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.1799F, -12.3914F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_ear", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.375F, AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.9845F, -7.4355F, -7.564F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.125F, AnimationHelper.createRotationalVector(0.9997F, -12.4347F, -7.6518F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.5F, AnimationHelper.createRotationalVector(-0.0727F, -6.5485F, 1.2013F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_ear", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.375F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 7.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 7.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.125F, AnimationHelper.createRotationalVector(1.6322F, 7.3212F, 20.1044F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 7.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.375F, AnimationHelper.createRotationalVector(15.0F, 0.0F, -15.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.75F, AnimationHelper.createRotationalVector(2.9622F, -0.5221F, -3.0213F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.125F, AnimationHelper.createRotationalVector(-10.9595F, -2.829F, -13.5076F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.5F, AnimationHelper.createRotationalVector(-18.5936F, -2.3726F, -14.8693F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.375F, AnimationHelper.createRotationalVector(-12.3964F, 1.6189F, 7.3242F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.125F, AnimationHelper.createRotationalVector(23.307F, -9.3073F, 20.5764F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.5F, AnimationHelper.createRotationalVector(-2.9596F, -6.5225F, 13.1723F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .build();

    public static final Animation animation.grogu.sit = Animation.Builder.create(3.5F)
            .addBoneAnimation("legs", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.7083F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.7917F, AnimationHelper.createRotationalVector(-61.68F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.5F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("legs", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.7083F, AnimationHelper.createRotationalVector(40.98F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.7917F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.5F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("torso", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.0F, -0.3981F, 0.9047F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, -0.4F, 0.9F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("neck", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.7083F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.5F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("neck", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.0F, 0.4881F, -0.1082F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, 0.49F, -0.11F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.7083F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.7917F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.5F, AnimationHelper.createRotationalVector(0.01F, 0.01F, 0.22F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_ear", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.5417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.9583F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 10.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.375F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.5833F, AnimationHelper.createRotationalVector(-0.4369F, -4.9809F, 4.4899F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_ear", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_ear", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.5417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.0417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -7.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.4583F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.5833F, AnimationHelper.createRotationalVector(-0.2187F, 4.9952F, -2.1127F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_ear", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.375F, AnimationHelper.createRotationalVector(-10.0F, 15.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.3333F, AnimationHelper.createRotationalVector(22.3265F, -2.8631F, 9.4349F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.5F, AnimationHelper.createRotationalVector(12.33F, -2.86F, 9.43F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.0F, 0.4881F, -0.1082F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, 0.49F, -0.11F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.375F, AnimationHelper.createRotationalVector(-12.6044F, -7.3212F, 1.6322F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.3333F, AnimationHelper.createRotationalVector(14.9455F, 1.2926F, -12.3304F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.5F, AnimationHelper.createRotationalVector(7.4455F, 1.2926F, -12.3304F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.0F, 0.4881F, -0.1082F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, 0.49F, -0.11F), Transformation.Interpolations.CUBIC)
            ))
            .build();

    public static final Animation animation.grogu.sit.loop = Animation.Builder.create(12.0F).looping()
		.addBoneAnimation("legs", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("legs", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.2917F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.4583F, AnimationHelper.createRotationalVector(42.5272F, 1.8429F, 1.6896F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.7917F, AnimationHelper.createRotationalVector(42.5042F, -0.2875F, -0.2634F), Transformation.Interpolations.CUBIC),
            new Keyframe(8.0F, AnimationHelper.createRotationalVector(42.5387F, -2.1947F, -2.0126F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("torso", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.4F, 0.9F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.0F, -0.4F, 0.9F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("neck", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.2917F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.4583F, AnimationHelper.createRotationalVector(5.019F, 4.9809F, 0.4369F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.7917F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(8.0F, AnimationHelper.createRotationalVector(12.9123F, -5.2859F, -0.9348F), Transformation.Interpolations.CUBIC),
            new Keyframe(10.5F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("neck", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.49F, -0.11F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.0F, 0.49F, -0.11F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.01F, 0.01F, 0.22F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.2917F, AnimationHelper.createRotationalVector(0.01F, 0.01F, 0.22F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.2917F, AnimationHelper.createRotationalVector(-2.5188F, 10.0052F, 0.0006F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.7917F, AnimationHelper.createRotationalVector(0.01F, 0.01F, 0.22F), Transformation.Interpolations.CUBIC),
            new Keyframe(7.7917F, AnimationHelper.createRotationalVector(5.181F, -5.3304F, 0.2042F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createRotationalVector(0.01F, 0.01F, 0.22F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_ear", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(4.5833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(6.7917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(8.375F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(10.0417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(10.5833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(10.6667F, AnimationHelper.createRotationalVector(0.8804F, 9.9616F, 4.4517F), Transformation.Interpolations.LINEAR),
            new Keyframe(10.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(11.375F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_ear", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_ear", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -5.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.7917F, AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(4.375F, AnimationHelper.createRotationalVector(0.0F, 10.0F, -5.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.5417F, AnimationHelper.createRotationalVector(0.0F, 10.0F, -5.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.625F, AnimationHelper.createRotationalVector(0.0F, -9.3073F, -2.572F), Transformation.Interpolations.LINEAR),
            new Keyframe(5.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(6.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -5.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(8.25F, AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(9.8333F, AnimationHelper.createRotationalVector(0.0F, 10.0F, -5.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_ear", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.33F, -2.86F, 9.43F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.5833F, AnimationHelper.createRotationalVector(12.33F, -2.86F, 9.43F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.9167F, AnimationHelper.createRotationalVector(12.7106F, 14.2301F, 13.2284F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.7917F, AnimationHelper.createRotationalVector(12.4184F, -4.8374F, 8.9943F), Transformation.Interpolations.CUBIC),
            new Keyframe(8.0F, AnimationHelper.createRotationalVector(25.3735F, -12.3996F, 5.6005F), Transformation.Interpolations.CUBIC),
            new Keyframe(10.5F, AnimationHelper.createRotationalVector(7.4085F, -6.4902F, 7.957F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createRotationalVector(12.33F, -2.86F, 9.43F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.49F, -0.11F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.0F, 0.49F, -0.11F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.4455F, 1.2926F, -12.3304F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.5F, AnimationHelper.createRotationalVector(7.4455F, 1.2926F, -12.3304F), Transformation.Interpolations.CUBIC),
            new Keyframe(3.9167F, AnimationHelper.createRotationalVector(17.7674F, 10.8264F, -9.2922F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.7917F, AnimationHelper.createRotationalVector(6.536F, -7.6649F, -11.6341F), Transformation.Interpolations.CUBIC),
            new Keyframe(8.0F, AnimationHelper.createRotationalVector(-20.9193F, -24.9636F, -4.9766F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createRotationalVector(7.4455F, 1.2926F, -12.3304F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.49F, -0.11F), Transformation.Interpolations.CUBIC),
            new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.0F, 0.49F, -0.11F), Transformation.Interpolations.CUBIC)
            ))
            .build();

    public static final Animation animation.grogu.sip = Animation.Builder.create(9.0F).looping()
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.3333F, AnimationHelper.createRotationalVector(-4.9555F, 0.0879F, -0.0116F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.75F, AnimationHelper.createRotationalVector(-4.9555F, 0.0879F, -0.0116F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.5F, AnimationHelper.createRotationalVector(0.0F, -1.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(6.5417F, AnimationHelper.createRotationalVector(-2.5095F, -4.9952F, 0.2187F), Transformation.Interpolations.CUBIC),
            new Keyframe(7.625F, AnimationHelper.createRotationalVector(-4.9595F, 5.0024F, -0.3248F), Transformation.Interpolations.CUBIC),
            new Keyframe(9.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_ear", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.75F, AnimationHelper.createRotationalVector(-0.0081F, -2.4763F, -0.5256F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(6.5F, AnimationHelper.createRotationalVector(0.4341F, -0.2279F, 4.9751F), Transformation.Interpolations.CUBIC),
            new Keyframe(9.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_ear", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0341F, 2.2599F, 3.0156F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(6.5F, AnimationHelper.createRotationalVector(-0.4522F, 0.1894F, -4.9767F), Transformation.Interpolations.CUBIC),
            new Keyframe(9.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-90.0F, 40.0F, -90.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.25F, AnimationHelper.createRotationalVector(-90.0F, 35.0F, -90.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.8333F, AnimationHelper.createRotationalVector(-90.0F, 35.0F, -90.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(4.1667F, AnimationHelper.createRotationalVector(-90.0F, 40.0F, -90.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.5F, AnimationHelper.createRotationalVector(-90.0F, 37.5F, -90.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(7.0F, AnimationHelper.createRotationalVector(-90.0F, 42.5F, -90.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(8.0F, AnimationHelper.createRotationalVector(-90.0F, 40.0F, -90.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_hand", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-20.941F, 40.7895F, 2.1388F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.25F, AnimationHelper.createRotationalVector(-20.941F, 40.7895F, -27.8612F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.8333F, AnimationHelper.createRotationalVector(-20.941F, 40.7895F, -27.8612F), Transformation.Interpolations.CUBIC),
            new Keyframe(4.1667F, AnimationHelper.createRotationalVector(-20.941F, 40.7895F, 2.1388F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.5F, AnimationHelper.createRotationalVector(-20.941F, 40.7895F, 2.1388F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-90.0F, -35.0F, 90.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.25F, AnimationHelper.createRotationalVector(-90.0F, -30.0F, 90.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.8333F, AnimationHelper.createRotationalVector(-90.0F, -30.0F, 90.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(4.1667F, AnimationHelper.createRotationalVector(-90.0F, -40.0F, 90.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.5F, AnimationHelper.createRotationalVector(-90.0F, -35.0F, 90.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(7.0F, AnimationHelper.createRotationalVector(-90.0F, -37.5F, 90.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(8.0F, AnimationHelper.createRotationalVector(-90.0F, -35.0F, 90.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_hand", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-20.941F, -40.7895F, -2.1388F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.25F, AnimationHelper.createRotationalVector(-20.941F, -40.7895F, 27.8612F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.8333F, AnimationHelper.createRotationalVector(-20.941F, -40.7895F, 27.8612F), Transformation.Interpolations.CUBIC),
            new Keyframe(4.1667F, AnimationHelper.createRotationalVector(-20.941F, -40.7895F, -2.1388F), Transformation.Interpolations.CUBIC),
            new Keyframe(5.5F, AnimationHelper.createRotationalVector(-20.941F, -40.7895F, -2.1388F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("bone", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 52.5F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("bone", new Transformation(Transformation.Targets.TRANSLATE,
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.2481F, -3.9317F, 8.25F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.25F, AnimationHelper.createTranslationalVector(1.7321F, -3.3555F, 8.25F), Transformation.Interpolations.LINEAR)
            ))
            .build();
}
}
