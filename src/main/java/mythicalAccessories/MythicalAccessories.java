package mythicalAccessories;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = MythicalAccessories.MODID, version = MythicalAccessories.VERSION, name = MythicalAccessories.NAME)
public class MythicalAccessories {

	public static final String NAME = "Kreacher Features";
	public static final String MODID = "mythicalAccessories";
    public static final String VERSION = "1.0.1";
    
    /**A generic Wing Item*/
    public static Item wings;
    /**A generic scarf Item*/
    public static Item scarf;
    
    /**Flight Googles*/
    public static Item flightGoggles;
    
    //Wings allow you to fly, You need flight goggles or your vision will become blurry 
    
    /**Demonic Wings*/
    public static Item demonWings;
    /**Angelic Wings*/
    public static Item angelWings;
    /**Dragon Wings*/
    public static Item dragonWings;
    
    /**The Armor Texture for any demon armor pieces*/
    
    public static ArmorMaterial demonArmor = EnumHelper.addArmorMaterial("demonArmor", "demonic", 25, new int[]{1,2,2,1}, 5);
    /**The Armor Texture for any angel armor pieces*/
    public static ArmorMaterial angelArmor = EnumHelper.addArmorMaterial("angelArmor", "angelic", 25, new int[]{1,2,2,1}, 5);
    
    //Initialize everything
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	demonWings = new ItemWings(demonArmor, 0, 1).setUnlocalizedName("demon_wings");
    	GameRegistry.registerItem(demonWings, "demon_wings");

    	angelWings = new ItemWings(angelArmor, 0, 1).setUnlocalizedName("angel_wings");
    	GameRegistry.registerItem(angelWings, "angel_wings");
    }
    
    //Registry Fields are REQUIRED for block models to work in the inventory
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
