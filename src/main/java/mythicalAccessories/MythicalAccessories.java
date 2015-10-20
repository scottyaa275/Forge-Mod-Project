package mythicalAccessories;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
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
    
    //Initialize everything
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	demonWings = new ItemWings(null, 0, 1);
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
