package mythicalAccessories;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = MythicalAccessories.MODID, version = MythicalAccessories.VERSION, name = MythicalAccessories.NAME)
public class MythicalAccessories {

	public static final String NAME = "Kreacher Features";
	public static final String MODID = "mythicalAccessories";
	//Edit mcmod.info instead
	public static final String VERSION = "1.8";
	//USE MCMOD.INFO FOR VERSION

	//For scarves use dyes to make it customizable I would suggest max amount of dyes is 4
	//You add dyes in order of colors you want
	//Or A GUI Can be used 
	/**A generic Wing Item*/
	public static Item wings;

	/**A generic scarf Item*/
	public static Item scarf;

	/**Flight Googles*/
	public static Item flightGoggles;

	/** Bow ties (cause they're cool)*/
	public static Item bowTie;

	/**Ties not as cool as bow ties but whatever*/
	public static Item tie;

	/**Ear muffs :D (Thanks dad :3) (Danni)*/
	public static Item earMuffs;

	//Wings allow you to fly, You need flight goggles or your vision will become blurry 
	//Make sure goggles dont look like googles of reaveling in thaumcraft PLEAAAASSSEEE
	//Angelic wings should show skin, then skin/feathers then wings
	//Same applies for dragon wings subistute feathers w/ scales
	//Angels are going to be passive mobs 
	//Demons are hostile so they attack once they see you
	//Dragons are neutral so when YOU attack they attack back
	//Angels come out only on full moons in minecraft
	//Dragons have a rare chance of spawning in the skies
	//Or In Dragon Cave Generated Structures
	//Demons in nether and rare as well all of them rare acutally
	/**Demonic Wings*/
	public static Item demonWings;
	/**Angelic Wings*/
	public static Item angelWings;
	/**Dragon Wings*/
	public static Item dragonWings;

	/**Demon Horns*/
	public static Item demonHorns;
	/**Angel Halo*/
	public static Item angelHalo;
	//Fixed the name for you I:
	/**Dragon Crown */
	public static Item dragonCrown;
	//Angelic hands right click on a mob or player you heal them 5 hearts
	//Angelic hands left click you push them away with a strong wind force
	//Demon rigth click activates a shadowy attack flame thing
	//demon leftclick deals more damage
	//Dragon rightclick shoots fire balls out of hands
	//Dragon leftclick deals more damage and makes you dig faster
	/**Demonic Claws*/
	public static Item demonClaws;
	/**Dragon Claws*/
	public static Item dragonClaws;
	/**Angelic Hands*/
	public static Item angelHands;

	//Gender should affect demon type ex: females looks like succubuses and males look like....Idk male demons???
	//Also dragons should not be as big and ender dragon but smaller
	//Make demons nether angels appear only on full moons at night and dragons in caves with a random chance of spawning
	/**The Armor material for any demon armor pieces*/
	public static ArmorMaterial demonArmor = EnumHelper.addArmorMaterial("demonArmor", "mythicalAccessories:demonic", 25, new int[]{1,2,2,1}, 5);
	/**The Armor material for any angel armor pieces*/
	public static ArmorMaterial angelArmor = EnumHelper.addArmorMaterial("angelArmor", "mythicalAccessories:angelic", 25, new int[]{1,2,2,1}, 5);
	/**The armor material for any DRAGOOON armor piece*/
	public static ArmorMaterial dragonArmor = EnumHelper.addArmorMaterial("dragonArmor", "mythicalAccessories:draconic", 25, new int[] {1,2,2,1},5);
	/**The armor material for misc armor pieces*/
	public static ArmorMaterial utilArmor = EnumHelper.addArmorMaterial("utilities", "mythicalAccessories:util", 5, new int[]{1,0,0,0}, 8);
	//You CANT have halo and horns at same time...same goes with angel and dragon helm and horns/dragon helm
	//Initialize everything
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		registerEventListeners();

		demonWings = new ItemWings(demonArmor, 0, 1).setUnlocalizedName("demon_wings");
		GameRegistry.registerItem(demonWings, "demon_wings");
		itemRenderRegister(demonWings, 0, "demon_wings");

		angelWings = new ItemWings(angelArmor, 0, 1).setUnlocalizedName("angel_wings");
		GameRegistry.registerItem(angelWings, "angel_wings");
		itemRenderRegister(angelWings, 0, "angel_wings");

		angelHalo = new ItemArmor(angelArmor, 0, 0).setUnlocalizedName("angel_halo");
		GameRegistry.registerItem(angelHalo, "angel_halo");
		itemRenderRegister(angelHalo, 0, "angel_halo");

		angelHands = new Item().setUnlocalizedName("angel_hands");
		GameRegistry.registerItem(angelHands, "angel_hands");
		itemRenderRegister(angelHands, 0, "angel_hands");

		flightGoggles = new ItemGoggles(utilArmor, 0, 0).setUnlocalizedName("flight_goggles");
		GameRegistry.registerItem(flightGoggles, "flight_goggles");
		itemRenderRegister(flightGoggles, 0, "flight_goggles");
<<<<<<< HEAD
		
		dragonWings=new ItemWings(dragonArmor, 0, 1).setUnlocalizedName("dragon_wings");
=======

		dragonWings = new ItemWings(dragonArmor, 0, 1).setUnlocalizedName("dragon_wings").setMaxDamage(15000);
>>>>>>> origin/master
		GameRegistry.registerItem(dragonWings,"dragon_wings");
		itemRenderRegister(dragonWings, 0, "dragon_wings");
		
		dragonClaws=new Item().setUnlocalizedName("dragon_claws");
		GameRegistry.registerItem(dragonClaws, "dragon_claws");
		itemRenderRegister(dragonClaws, 0, "dragon_claws");
		
		demonClaws=new Item().setUnlocalizedName("demon_claws");
		GameRegistry.registerItem(demonClaws, "demon_claws");
		itemRenderRegister(demonClaws, 0, "demon_claws");
		
		demonHorns=new ItemArmor(demonArmor, 0, 0).setUnlocalizedName("demon_horns");
		GameRegistry.registerItem(demonHorns, "demon_horns");
		itemRenderRegister(demonHorns, 0, "demon_horns");
		
		dragonCrown=new ItemArmor(dragonArmor, 0, 0).setUnlocalizedName("dragon_crown");
		GameRegistry.registerItem(dragonCrown, "dragon_crown");
		itemRenderRegister(dragonCrown, 0, "dragon_crown");
		
		
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

	//Event Listener Registery

	/**Registers the Player Event Handler*/
	public void registerEventListeners() 
	{
		// DEBUG
		System.out.println("Registering event listeners");

		MinecraftForge.EVENT_BUS.register(new PlayerHandler());
		FMLCommonHandler.instance().bus().register(new PlayerHandler());
	}


}
