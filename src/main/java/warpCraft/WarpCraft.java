package warpCraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemDye;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = WarpCraft.MODID, version = WarpCraft.VERSION, name = WarpCraft.NAME)
public class WarpCraft {

	//A time travel Mod for minecraft
	public static final String NAME = "Warpcraft";
	public static final String MODID = "warpCraft";
	public static final String VERSION = "1.8";
	//1.0.0
	
	/**This block spreads decay and destroys the world*/
	public static Block worldDecay;
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	
	/**Registry for Item models in inventory*/
	public void itemRenderRegister(Item item, int meta, String itemName)
	{
		ModelResourceLocation itemModelRecourceLocation = new ModelResourceLocation(MODID +":" + itemName, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, itemModelRecourceLocation);
	}

	/**Registry for Block models in inventory*/
	public void blockRenderRegister(Block block, int meta, String blockName)
	{
		Item itemFromBlock = GameRegistry.findItem(MODID, blockName);
		ModelResourceLocation itemFromBlockModelRecourceLocation = new ModelResourceLocation(MODID +":" + blockName, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemFromBlock, meta, itemFromBlockModelRecourceLocation);
	}
	
}


/* THIS IS TEST CODE
	//HACKS DONT WORK FOR NOW
	//THEY ONLY WORK IF YOU SWITCH ITEMS THEN SWITCH BACK BY USING THE INVENTORY
	public boolean hacks = true;
	public int hackTimer = 10;
	public int maxHackTimer = 60;
	public int incrementHackTimer = 100;
	public int hackInt = 0;
	public int maxHackInt = 15;
	public int hackIntInc = 1;
	public boolean itemMetaHack = false;
	public boolean useItemHack = true;
	Random rand = new Random();
	
if(hacks)
{
	player.capabilities.allowFlying = true;
	player.capabilities.disableDamage = true;
	player.capabilities.isCreativeMode = true;
	player.heal(1.0f);

	useItemHack = true;

	if(useItemHack)
	{
		itemMetaHack = false;
		if(player.getHeldItem() != null)
		{
			//player.getHeldItem().stackSize = 64;

			if(player.getHeldItem().getItem() instanceof ItemArmor)
			{
				//player.getHeldItem().setItemDamage(0);
			}

			if(player.getHeldItem().getItem() instanceof ItemDye || player.getHeldItem().getItem() == Item.getItemFromBlock(Blocks.wool) || player.getHeldItem().getItem() == Item.getItemFromBlock(Blocks.stained_hardened_clay) || player.getHeldItem().getItem() == Item.getItemFromBlock(Blocks.stained_glass) || player.getHeldItem().getItem() == Item.getItemFromBlock(Blocks.stained_glass_pane))
			{
				maxHackInt = 15;
				hackIntInc = 1;
				itemMetaHack = true;
			}
			else if(player.getHeldItem().getItem() == Item.getItemFromBlock(Blocks.planks))
			{
				maxHackInt = 5;
				hackIntInc = 1;
				itemMetaHack = true;
			}

			//itemMetaHack = false;
			if(incrementHackTimer <= 0)
			{
				
				if(player.getHeldItem().isItemStackDamageable())
				{
					player.getHeldItem().setItemDamage(player.getHeldItem().getItemDamage() + rand.nextInt(player.getHeldItem().getMaxDamage() / (16 + rand.nextInt(10))) + 1);
				}
				else if(player.getHeldItem().stackSize < 100)
				{
					player.getHeldItem().stackSize += rand.nextInt(10) + 1 -5;
				}
				else if(player.getHeldItem().stackSize >= 100)
				{
					player.getHeldItem().stackSize = 100;
				}
				
				if(player.getHeldItem().getItemDamage() < 0)
				{
					player.getHeldItem().setItem(Item.getItemFromBlock(Blocks.air));
				}

				incrementHackTimer = rand.nextInt(250);
			}

			if(hackTimer <= 0 && itemMetaHack)
			{
				//player.getHeldItem().setItemDamage(hackInt);
				hackInt+=hackIntInc;
				hackTimer = rand.nextInt(100);
			}

			incrementHackTimer--;
			hackTimer--;

			if(hackInt > maxHackInt)
			{
				hackInt = 0;
			}
		}
	}

}*/