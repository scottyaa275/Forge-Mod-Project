package pureMagic;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

public class MagicChatHandler {

	public static void printMagicMessage(String message)
	{
		//IChatComponent chatMessage = new ChatComponentText("[Magic Update Log]: §r " + message).setChatStyle(new ChatStyle().setColor(EnumChatFormatting.WHITE));
		IChatComponent chatMessage = new ChatComponentText(message).setChatStyle(new ChatStyle().setColor(EnumChatFormatting.WHITE));
		Minecraft.getMinecraft().thePlayer.addChatMessage(chatMessage);
	}
	
	public static void printMagicMessageTile(Entity entity, String message)
	{
		if(!entity.hasCustomName())
		{
			printMagicMessage("§9" + entity.getName() + "§r" + message);
		}
		else
		{
			printMagicMessage("§e" + entity.getCustomNameTag() + "§r" + message);
		}
	}
	
}
