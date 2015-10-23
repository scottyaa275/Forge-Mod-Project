package mythicalAccessories;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy{

	private static final ModelWings wingsChest = new ModelWings(1.0f); 
	private static final ModelWings wingsOther = new ModelWings(0.5f);

	public ModelBiped getArmorModel(int id)
	{ 
		switch (id)
		{ 
		case 0: 
		{
			return wingsChest; 
		}
		case 1: 
		{
			return wingsOther; 
		}
		default:
		{
			break;
		}
		} 
		return wingsChest; 
	}
}

