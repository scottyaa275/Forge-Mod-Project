package newWorlds;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockGrassNew extends BlockGrass {

	//Sets the block below it
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            if (worldIn.getLightFromNeighbors(pos.up()) < 4 && worldIn.getBlockState(pos.up()).getBlock().getLightOpacity(worldIn, pos.up()) > 2)
            {
                worldIn.setBlockState(pos, NewWorlds.betterDirt.getDefaultState());
            }
            else
            {
                if (worldIn.getLightFromNeighbors(pos.up()) >= 9)
                {
                    for (int i = 0; i < 4; ++i)
                    {
                        BlockPos blockpos1 = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);
                        Block block = worldIn.getBlockState(blockpos1.up()).getBlock();
                        IBlockState iblockstate1 = worldIn.getBlockState(blockpos1);

                        if (iblockstate1.getBlock() == Blocks.dirt && iblockstate1.getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.DIRT && worldIn.getLightFromNeighbors(blockpos1.up()) >= 4 && block.getLightOpacity(worldIn, blockpos1.up()) <= 2)
                        {
                            worldIn.setBlockState(blockpos1, Blocks.grass.getDefaultState());
                        }
                    }
                }
            }
        }
    }
	
	/**
     * Get the Item that this Block should drop when harvested.
     *  
     * @param fortune the level of the Fortune enchantment on the player's tool
     */
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return NewWorlds.betterDirt.getItemDropped(NewWorlds.betterDirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT), rand, fortune);
    }
}
