package mythicalAccessories;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerHandler {

	//I HAVE FIGURED OUT EVENT HANDLERS
	//POWWWAAARRRRR
	//I HAVE POWER!!!!!!!!
	//NOW ANY MOD CAN BE MADE >:D
	
	@SubscribeEvent(priority=EventPriority.HIGHEST, receiveCanceled=true)
	public void onEvent(LivingJumpEvent event)
	{
		// DEBUG
		if (event.entity instanceof EntityPlayer)
		{
			if(event.entityLiving.getHeldItem().getItem() == MythicalAccessories.angelHands)
			{
				event.entityLiving.addVelocity(0.0d, 0.5d, 0.0d);
			}
		}
	}

}
