package pureMagic.magicSpell;

import pureMagic.MagicChatHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class MagicSpellArrow extends MagicSpell {

	/**Called Whenever a Spell is used as and Item*/
	public void itemUse(ItemStack stack, World world, EntityPlayer player)
	{
		if (!player.capabilities.isCreativeMode)
		{
			//Code for mana usage
		}

		world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (spellRand.nextFloat() * 0.4F + 0.8F));

		if (!world.isRemote)
		{
			EntityArrow arrowSpawner = new EntityArrow(world, player, 1.0f);
			arrowSpawner.canBePickedUp = 0;
			world.spawnEntityInWorld(arrowSpawner);
			MagicChatHandler.printMagicMessage("§2" +player.getDisplayNameString() + "§r shot an §earrow");
		}

		world.spawnParticle(EnumParticleTypes.FLAME, player.posX + (spellRand.nextDouble() - 0.5d), player.posY + 1 +(spellRand.nextDouble() - 0.5d), player.posZ + (spellRand.nextDouble() - 0.5d), 0, 0, 0, new int[0]);
	}

	/**Called Whenever a Spell is selected and used to hit another entity*/
	public boolean itemHitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
	{
		banishEntity(stack, target, attacker);
		return true;
	}

	/**Called Whenever a Spell is used on an entity*/
	public boolean itemInteractEntity(ItemStack stack, EntityPlayer player, EntityLivingBase target)
	{
		banishEntity(stack, target, player);
		return true;
	}

	public void banishEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
	{
		target.isDead = true;
		if(!target.hasCustomName())
		{
			MagicChatHandler.printMagicMessage(target.getName() + " was banished to the void");
		}
		else
		{
			MagicChatHandler.printMagicMessage(target.getCustomNameTag() + " was banished to the void");
		}
		//Spawns particles 'a' times
		for(int a = 0; a < 15; a++)
		{
			int random = spellRand.nextInt(4);
			switch(random)
			{
			case 0:
			{
				Minecraft.getMinecraft().theWorld.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, target.posX + (spellRand.nextDouble() - 0.5d), target.posY + 1 +(spellRand.nextDouble() - 0.5d), target.posZ + (spellRand.nextDouble() - 0.5d), 0, 0, 0, new int[0]);
			}
			case 1:
			{
				Minecraft.getMinecraft().theWorld.spawnParticle(EnumParticleTypes.PORTAL, target.posX + (spellRand.nextDouble() - 0.5d), target.posY + 1 +(spellRand.nextDouble() - 0.5d), target.posZ + (spellRand.nextDouble() - 0.5d), 0, 0, 0, new int[0]);
			}
			case 2:
			{
				Minecraft.getMinecraft().theWorld.spawnParticle(EnumParticleTypes.FLAME, target.posX + (spellRand.nextDouble() - 0.5d), target.posY + 1 +(spellRand.nextDouble() - 0.5d), target.posZ + (spellRand.nextDouble() - 0.5d), 0, 0, 0, new int[0]);
			}
			case 3:
			{
				Minecraft.getMinecraft().theWorld.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, target.posX + (spellRand.nextDouble() - 0.5d), target.posY + 1 +(spellRand.nextDouble() - 0.5d), target.posZ + (spellRand.nextDouble() - 0.5d), 0, 0, 0, new int[0]);
			}
			default:
			{
				break;
			}
			}

		}
	}


}
