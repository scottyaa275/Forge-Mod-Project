package mythicalAccessories;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemWings extends ItemArmor {

	public ItemWings(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setMaxDamage(15000);
	}

	ModelBiped armorModel = new ModelBiped();

	@Override @SideOnly(Side.CLIENT) 
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) 
	{ 
		if(itemStack != null)
		{ 
			if(itemStack.getItem() instanceof ItemWings)
			{ 
				int type = ((ItemArmor)itemStack.getItem()).armorType; 
				if(type == 1 || type == 3){ armorModel = MythicalAccessories.proxy.getArmorModel(0); 
				}
				else
				{
					armorModel = MythicalAccessories.proxy.getArmorModel(1); 
				} 
			} 
			if(armorModel != null)
			{ 
				armorModel.bipedHead.showModel = armorSlot == 0;
				armorModel.bipedHeadwear.showModel = armorSlot == 0; 
				armorModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2; 
				armorModel.bipedRightArm.showModel = armorSlot == 1;
				armorModel.bipedLeftArm.showModel = armorSlot == 1; 
				armorModel.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3; 
				armorModel.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3; 
				armorModel.isSneak = entityLiving.isSneaking(); 
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild(); 
				armorModel.heldItemRight = entityLiving.getHeldItem() != null ? 1 :0; 
				if(entityLiving instanceof EntityPlayer)
				{ 
					armorModel.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
				} 
				return armorModel; 
			} 
		} 
		return null; 
	} 

}
