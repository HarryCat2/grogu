package harrrycat.grogu.entity;
import harrrycat.grogu.Grogu;
import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;
import java.util.UUID;

public class GroguEntity extends PathAwareEntity {
	// -- Data -- //
    PlayerEntity holder;
    private UUID ownerUuid;
    private boolean isSitting = false;
	boolean isHeld = false;

    // -- Hunger -- //
	public int hunger;
	public static int MAX_HUNGER = 10000;

    // -- Inventory -- //
    private final SimpleInventory inventory = new SimpleInventory(6);

	public GroguEntity(EntityType<GroguEntity> type, World world) {
		super(type, world);
		hunger = MAX_HUNGER;
	}

    // -- Goals -- //
    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new LookAtEntityGoal(this, PlayerEntity.class, 1f));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 1D));
    }

    // -- Attributes -- //
    public static DefaultAttributeContainer.Builder createGroguAttributes() {
        return PathAwareEntity.createLivingAttributes()
                .add(EntityAttributes.ARMOR, 15)
                .add(EntityAttributes.MOVEMENT_EFFICIENCY, 0.01f)
                .add(EntityAttributes.MOVEMENT_SPEED, 0.01f);
    }

    // some logic category don't ask me I don't name things //
    public void setOwnerUuid(UUID uuid) { this.ownerUuid = uuid; }
    public UUID getOwnerUuid() { return this.ownerUuid; }

    public void setSitting(boolean sitting) { this.isSitting = sitting; }
    public boolean isSitting() { return this.isSitting; }

    // Inventory
    public SimpleInventory getInventory() {
        return inventory;
    }


    // -- Animation -- //
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    private void updateAnimations() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.age);
        } else {
            this.idleAnimationTimeout--;
        }
    }


    // -- Overrides -- //
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
		}else if(!isHeld || !player.isSneaky()) {
			isHeld=true;
			holder = player;

			this.startRiding(holder);

        } else if (player.getMainHandStack().isEmpty()) {



        }

        return super.interactAt(player, hitPos, hand);
	}

	@Override
	public void tick()
	{
		if(isHeld){
			if(holder.isDead() || holder.isSneaking()){
                this.stopRiding();
                this.updatePosition(holder.getX(), holder.getY(), holder.getZ());
				holder = null;
				isHeld=false;

			}
		}


		hunger --;
		super.tick();

        if(this.getEntityWorld().isClient()) {
            updateAnimations();
        }
	}
    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_WOLF_STEP, 0.15F, 0.5F);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        if (this.isSleeping()) {
            return SoundEvents.ENTITY_FOX_SLEEP;
        }
        return SoundEvents.ENTITY_FOX_AMBIENT;
    }



    /*@Override
    protected SoundEvent getAmbientSound() {
        // Logic on ambient sound: if/else statements
        return
    }*/

}
