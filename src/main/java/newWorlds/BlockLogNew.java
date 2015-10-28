package newWorlds;

import java.util.Iterator;
import java.util.List;

import com.google.common.base.Predicate;

import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLogNew extends BlockLog {

	public static final PropertyEnum VARIANT = PropertyEnum.create("variant", BlockPlanks.EnumType.class, new Predicate()
	{
		public boolean apply(BlockPlanks.EnumType type)
		{
			return type.getMetadata() < 4;
		}
		public boolean apply(Object p_apply_1_)
		{
			return this.apply((BlockPlanks.EnumType)p_apply_1_);
		}
	});

	public BlockLogNew()
	{
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, BlockPlanks.EnumType.OAK).withProperty(LOG_AXIS, BlockLogNew.EnumAxis.Y));
	}

	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	 */
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
	{
		list.add(new ItemStack(itemIn, 1, BlockPlanks.EnumType.OAK.getMetadata()));
		list.add(new ItemStack(itemIn, 1, BlockPlanks.EnumType.SPRUCE.getMetadata()));
		list.add(new ItemStack(itemIn, 1, BlockPlanks.EnumType.BIRCH.getMetadata()));
		list.add(new ItemStack(itemIn, 1, BlockPlanks.EnumType.JUNGLE.getMetadata()));
	}

	/**
	 * Convert the given metadata into a BlockState for this Block
	 */
	public IBlockState getStateFromMeta(int meta)
	{
		IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, BlockPlanks.EnumType.byMetadata((meta & 3) % 4));

		switch (meta & 12)
		{
		case 0:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLogNew.EnumAxis.Y);
			break;
		case 4:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLogNew.EnumAxis.X);
			break;
		case 8:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLogNew.EnumAxis.Z);
			break;
		default:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLogNew.EnumAxis.NONE);
		}

		return iblockstate;
	}

	/**
	 * Convert the BlockState into the correct metadata value
	 */
	public int getMetaFromState(IBlockState state)
	{
		byte b0 = 0;
		int i = b0 | ((BlockPlanks.EnumType)state.getValue(VARIANT)).getMetadata();

		switch (BlockLogNew.SwitchEnumAxis.AXIS_LOOKUP[((BlockLogNew.EnumAxis)state.getValue(LOG_AXIS)).ordinal()])
		{
		case 1:
			i |= 4;
			break;
		case 2:
			i |= 8;
			break;
		case 3:
			i |= 12;
		}

		return i;
	}

	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[] {VARIANT, LOG_AXIS});
	}

	protected ItemStack createStackedBlock(IBlockState state)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, ((BlockPlanks.EnumType)state.getValue(VARIANT)).getMetadata());
	}

	/**
	 * Get the damage value that this Block should drop
	 */
	public int damageDropped(IBlockState state)
	{
		return ((BlockPlanks.EnumType)state.getValue(VARIANT)).getMetadata();
	}

	static final class SwitchEnumAxis
	{
		static final int[] AXIS_LOOKUP = new int[BlockLogNew.EnumAxis.values().length];
		private static final String __OBFID = "CL_00002083";

		static
		{
			try
			{
				AXIS_LOOKUP[BlockLogNew.EnumAxis.X.ordinal()] = 1;
			}
			catch (NoSuchFieldError var3)
			{
				;
			}

			try
			{
				AXIS_LOOKUP[BlockLogNew.EnumAxis.Z.ordinal()] = 2;
			}
			catch (NoSuchFieldError var2)
			{
				;
			}

			try
			{
				AXIS_LOOKUP[BlockLogNew.EnumAxis.NONE.ordinal()] = 3;
			}
			catch (NoSuchFieldError var1)
			{
				;
			}
		}
	}
}
