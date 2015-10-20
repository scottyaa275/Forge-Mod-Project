package mythicalAccessories;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
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
	//Edit mcmod.info instead
    public static final String VERSION = "1.0.2";
    
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
    
    /**The Armor material for any demon armor pieces*/
    public static ArmorMaterial demonArmor = EnumHelper.addArmorMaterial("demonArmor", "mythicalAccessories:demonic", 25, new int[]{1,2,2,1}, 5);
    /**The Armor material for any angel armor pieces*/
    public static ArmorMaterial angelArmor = EnumHelper.addArmorMaterial("angelArmor", "mythicalAccessories:angelic", 25, new int[]{1,2,2,1}, 5);
    
    /**The armor material for misc armor pieces*/
    public static ArmorMaterial utilArmor = EnumHelper.addArmorMaterial("utilities", "mythicalAccessories:util", 5, new int[]{1,0,0,0}, 8);
    
    //Initialize everything
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	demonWings = new ItemWings(demonArmor, 0, 1).setUnlocalizedName("demon_wings");
    	GameRegistry.registerItem(demonWings, "demon_wings");

    	angelWings = new ItemWings(angelArmor, 0, 1).setUnlocalizedName("angel_wings");
    	GameRegistry.registerItem(angelWings, "angel_wings");
    	
    	flightGoggles = new ItemGoggles(utilArmor, 0, 0).setUnlocalizedName("flight_goggles");
    	GameRegistry.registerItem(flightGoggles, "flight_goggles");
    	ModelBakery.addVariantName(flightGoggles, "flight_goggles");
    	//itemRenderRegister(flightGoggles, 0, "flight_goggles");
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
