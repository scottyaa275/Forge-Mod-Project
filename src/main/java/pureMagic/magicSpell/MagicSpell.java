package pureMagic.magicSpell;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class MagicSpell {
	
	public Random spellRand = new Random();

	/**Called Whenever a Spell is used as and Item*/
	public void itemUse(ItemStack stack, World world, EntityPlayer player)
	{
		
	}
	
	/**Called Whenever a Spell is selected and used to hit another entity*/
	public boolean itemHitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
	{
		return false;
	}
	
	/**Called Whenever a Spell is used on an entity*/
	public boolean itemInteractEntity(ItemStack stack, EntityPlayer player, EntityLivingBase target)
	{
		return false;
	}
	
	/**Called whenever a Spell is dropped in item form*/
	public boolean itemDrop(ItemStack item, EntityPlayer player)
	{
		return true;
	}

	/**Called Whenever a Spell is used in a magic contraption*/
	public void blockUse(BlockPos pos, World world)
	{
		
	}
	
	/**Called Whenever a Spell is used as an entity*/
	public void entityUse(World world, Entity entity)
	{
		
	}
}
