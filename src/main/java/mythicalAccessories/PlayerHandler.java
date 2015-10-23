package mythicalAccessories;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.GuiScreenEvent.MouseInputEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PlayerHandler {

	//I HAVE FIGURED OUT EVENT HANDLERS
	//POWWWAAARRRRR
	//I HAVE POWER!!!!!!!!
	//NOW ANY MOD CAN BE MADE >:D

	@SubscribeEvent(priority=EventPriority.HIGH, receiveCanceled=false)
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
		EntityPlayer player = (EntityPlayer) event.player;
		if(player.getCurrentArmor(2) != null)
		{
			if(player.getCurrentArmor(2).getItem() instanceof ItemWings)
			{
				player.capabilities.allowFlying = true;

				if(player.motionY < 0.0f && !player.isSneaking())
				{
					player.motionY = -0.20f;
				}

				if(player.capabilities.isFlying)
				{
					player.getCurrentArmor(2).damageItem(1, player);
					if(player.getCurrentArmor(2).getItemDamage() <= 0)
					{
						player.setCurrentItemOrArmor(3, null);
					}
				}
			}
		}
		else
		{
			player.capabilities.allowFlying = false;
			player.capabilities.isFlying = false;
		}
	}

}
