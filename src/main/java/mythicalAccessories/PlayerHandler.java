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
		if (event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entityLiving;
			if(player.getCurrentArmor(2) != null)
			{
				if(player.getCurrentArmor(2).getItem() == MythicalAccessories.angelWings)
				{
					player.capabilities.allowFlying = true;
				}
			}
			else
			{
				player.capabilities.allowFlying = false;
			}
		}
	}

}
