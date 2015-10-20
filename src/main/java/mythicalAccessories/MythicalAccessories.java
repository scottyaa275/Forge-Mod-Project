package mythicalAccessories;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import com.example.examplemod.ExampleMod;

@Mod(modid = MythicalAccessories.MODID, version = MythicalAccessories.VERSION, name = MythicalAccessories.NAME)
public class MythicalAccessories {

	public static final String NAME = "Kreacher Features";
	public static final String MODID = "MythicalAccessories";
    public static final String VERSION = "1.0.1";
	
    public static Item testItem;
    public static Block testBlock;
    
    //Initialize everything
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        
    }
}
