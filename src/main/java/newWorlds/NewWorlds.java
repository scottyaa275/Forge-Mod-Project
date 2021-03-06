package newWorlds;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
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
	//1.0.010
	
	/**A better version of the normal leaves block*/
	public static Block betterLeaves;
	/**A better version of the normal log block*/
	public static Block betterLog;
	
	/**A better version of the normal grass block*/
	public static Block betterGrass;
	/**A better version of the normal dirt block*/
	public static Block betterDirt;
	
	public static Block TEST;
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		betterGrass = new Block(Material.grass).setHardness(1.0f).setUnlocalizedName("better_grass");
		GameRegistry.registerBlock(betterGrass, "better_grass");
		blockRenderRegister(betterGrass, 0, "better_grass");
		
		betterDirt = new Block(Material.ground).setHardness(1.0f).setUnlocalizedName("better_dirt");
		GameRegistry.registerBlock(betterDirt, "better_dirt");
		blockRenderRegister(betterDirt, 0, "better_dirt");
		
		betterLog = new BlockLogNew().setHardness(1.0f).setUnlocalizedName("better_log");
		GameRegistry.registerBlock(betterLog, "better_log");
		blockRenderRegister(betterLog, 0, "better_log");
		
		betterLeaves = new BlockLeavesNew().setHardness(0.2f).setUnlocalizedName("better_leaves");
		GameRegistry.registerBlock(betterLeaves, "better_leaves");
		blockRenderRegister(betterLeaves, 0, "better_leaves");
		
		TEST = new Block(Material.sand).setUnlocalizedName("TEST_TILE");
		GameRegistry.registerBlock(TEST, "TEST");
		
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
