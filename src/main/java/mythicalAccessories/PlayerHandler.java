package mythicalAccessories;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.GuiScreenEvent.MouseInputEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class PlayerHandler {

	//I HAVE FIGURED OUT EVENT HANDLERS
	//POWWWAAARRRRR
	//I HAVE POWER!!!!!!!!
	//NOW ANY MOD CAN BE MADE >:D

	@SubscribeEvent(priority=EventPriority.HIGH, receiveCanceled=true)
	public void onEvent(LivingJumpEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entity;
			
		}
	}
	
	@SubscribeEvent(priority=EventPriority.HIGH, receiveCanceled=true)
	public void onEvent(PlayerTickEvent event)
	{
		if (event.player instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.player;
			if(player.getCurrentArmor(2) != null)
			{
				if(player.getCurrentArmor(2).getItem() == MythicalAccessories.angelWings || player.getCurrentArmor(2).getItem() == MythicalAccessories.demonWings || player.getCurrentArmor(2).getItem() == MythicalAccessories.dragonWings)
				{
					player.capabilities.allowFlying = true;
					player.getCurrentArmor(2).damageItem(1, player);
				}
			}
			else
			{
				player.capabilities.allowFlying = false;
				player.capabilities.isFlying = false;
			}
		}
	}

}
