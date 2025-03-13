package harrrycat.grogu.entity;

import harrrycat.grogu.Grogu;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class GroguEntity extends MobEntity
{
	PlayerEntity holder;
	boolean isHeld = false;
	public int hunger;
	public static int MAX_HUNGER = 10000;
	public GroguEntity(EntityType<GroguEntity> type, World world)
	{
		super(type, world);
		hunger=MAX_HUNGER;
	}

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
		}else if(!isHeld){
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
				holder = null;
				isHeld=false;
			}
		}
		hunger --;
		super.tick();
	}
}
