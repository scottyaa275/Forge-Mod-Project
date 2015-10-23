package newWorlds;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = NewWorlds.MODID, version = NewWorlds.VERSION, name = NewWorlds.NAME)
public class NewWorlds {

	//The World A New
	//That is the name btw :3
	//I really hope we can make another mod file i DO NOT  want to go through that again ;~;

	
	public static final String NAME = "The World A New";
	public static final String MODID = "newWorlds";
	public static final String VERSION = "1.8";
	
	public static Block leaves;
	public static Block log;
	
	public static Block betterGrass;
	
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		betterGrass = new BlockBetterGrass().setHardness(1.0f).setUnlocalizedName("better_grass");
		GameRegistry.registerBlock(betterGrass, "better_grass");
		
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
