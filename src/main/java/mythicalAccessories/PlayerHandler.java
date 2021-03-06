package mythicalAccessories;

import java.util.Random;

import mythicalAccessories.item.ItemWings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemDye;
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

	//Handles all Player Events

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

				if(player.motionY < 0.0f && !player.isSneaking() && !player.capabilities.isFlying)
				{
					player.motionY = -0.20f;
				}

				if(player.capabilities.isFlying && !player.capabilities.isCreativeMode)
				{
					player.getCurrentArmor(2).damageItem(1, player);
					if(player.getCurrentArmor(2).getItemDamage() <= 0)
					{
						player.setCurrentItemOrArmor(3, null);
					}
				}
			}
		}
		else if(!player.capabilities.isCreativeMode)
		{
			//player.capabilities.allowFlying = false;
			//player.capabilities.isFlying = false;
		}

		
	}

}
