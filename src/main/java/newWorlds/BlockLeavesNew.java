package newWorlds;

import java.util.List;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLeavesNew extends BlockLeaves {

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world,
			BlockPos pos, int fortune) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EnumType getWoodType(int meta) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.CUTOUT_MIPPED;
    }
	
	public boolean isOpaqueCube()
    {
        return false;
    }

}
