package pureMagic;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemMagicSpawn extends Item{

	public ItemMagicSpawn()
	{
		this.setMaxStackSize(1);
	}

	//This is where players getting magical elements will happen

	public int magicType;

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
	{
		//Test code
		//playerIn.motionY+=1.0f;
		if(!worldIn.isRemote)
		{
			//MagicChatHandler.printMagicMessage("You feel the power of magic run through you...");
			MagicChatHandler.printMagicMessage("CURRENTLY ONLY A HP CRYSTAL!");
			playerIn.inventory.consumeInventoryItem(Items.diamond);
			playerIn.inventory.consumeInventoryItem(PureMagic.magicSpawnItem);
			if(!playerIn.inventory.hasItem(Items.diamond))
			{
				playerIn.attackEntityFrom(DamageSource.generic, 5.0f);
				playerIn.getFoodStats().addExhaustion(80);
			}
			else
			{
				playerIn.heal(1.0f);
				playerIn.getFoodStats().setFoodLevel(playerIn.getFoodStats().getFoodLevel() + 1);
				playerIn.getFoodStats().setFoodSaturationLevel(playerIn.getFoodStats().getSaturationLevel() + 1);
			}
			playerIn.fallDistance = 0.0f;
		}
		else
		{
			playerIn.setInPortal();
		}
		
		return itemStackIn;
	}
}
