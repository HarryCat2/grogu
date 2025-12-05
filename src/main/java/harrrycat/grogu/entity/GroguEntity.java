package harrrycat.grogu.entity;
import harrrycat.grogu.Grogu;
import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;


public class GroguEntity extends MobEntity
{
	PlayerEntity holder;
	boolean isHeld = false;
	public int hunger;
    //public Vec3d NewPos = ;
	public static int MAX_HUNGER = 10000;
	public GroguEntity(EntityType<GroguEntity> type, World world) {
		super(type, world);
		hunger=MAX_HUNGER;
	}

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));

    }

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    private void updateAnimations() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            //this.idleAnimationTimeout.start(this.age);
        } else {
            this.idleAnimationTimeout--;
        }
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_WOLF_STEP, 0.15F, 0.5F);
    }

    /*@Override
    protected SoundEvent getAmbientSound() {
        // Logic on ambient sound: if/else statements
        return
    }*/

	@Override
	public ActionResult interactAt(PlayerEntity player, Vec3d hitPos, Hand hand)
	{

		if(player.getMainHandStack().isIn(Grogu.CAN_LGM_EAT)){
			ItemStack stack = player.getMainHandStack();
			stack.decrement(1);
			hunger = Math.min(stack.getComponents().contains(DataComponentTypes.FOOD) ?
			                  (int)((stack.getComponents().get(DataComponentTypes.FOOD).nutrition() +
			                         stack.getComponents().get(DataComponentTypes.FOOD).saturation())*MAX_HUNGER / 24)
			                                                                          : hunger + MAX_HUNGER / 4, MAX_HUNGER);
		}else if(!isHeld)  {
			isHeld=true;
			holder = player;

			this.startRiding(holder);
		}
		return super.interactAt(player, hitPos, hand);
	}

	@Override
	public void tick()
	{
		if(isHeld){
			if(holder.isDead() || holder.isSneaking()){
				this.stopRiding();
                //NewPos = holder.getEntityPos();
				holder = null;
				isHeld=false;
                //this.setPos(NewPos);

			}
		}


		hunger --;
		super.tick();

        if(this.getEntityWorld().isClient()) {
            updateAnimations();
        }
	}
}
