package pureMagic;

import pureMagic.magicSpell.MagicSpell;
import pureMagic.magicSpell.MagicSpellArrow;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = PureMagic.MODID, version = PureMagic.VERSION, name = PureMagic.NAME)
public class PureMagic {
	
	public static final String NAME = "Pure Magic";
	public static final String MODID = "pureMagic";
	public static final String VERSION = "1.8";

	//The Item that you use to change/choose your magic element
	public static Item magicSpawnItem;
	
	//A Spell Test Item
	public static Item spellTest;
	
	public static MagicSpell arrowSpell;
	public static MagicSpell fireSpell;
	
	//minecraft's model renderer wont be usable in this mod...
	//models will need to be combined (Minecrafts render engine can't currently do that)
	//custom OpenGL code is needed...
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		arrowSpell = new MagicSpellArrow();
		
		magicSpawnItem = new ItemMagicSpawn().setUnlocalizedName("magicChooser");
		GameRegistry.registerItem(magicSpawnItem, "magic_spawn_item");
		itemRenderRegister(magicSpawnItem, 0, "");
		
		spellTest = new ItemMagicSpell(arrowSpell).setUnlocalizedName("testSpell");
		GameRegistry.registerItem(spellTest, "testSpell");
		itemRenderRegister(spellTest, 0, "testSpell");
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
