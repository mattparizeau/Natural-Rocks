package com.matt.mods.naturalrocks.worldgen;

import java.util.Random;

import com.matt.mods.naturalrocks.blocks.NRBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NRWorldGen implements IWorldGenerator {
	
	public static final void initWorldGen()
	{
		GameRegistry.registerWorldGenerator(new NRWorldGen(), 0);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		int x = chunkX * 16;
		int z = chunkZ * 16;
		
		if (world.provider.getDimensionId() == 0)
		{
			this.generateOre(random, world, x, z, 20, 32, 0, 256, NRBlocks.marble);
		}
	}
	
	public void generateOre(Random random, World world, int x, int z, int tries, int amount, int minY, int maxY, Block ore)
	{
		for (int i = 0; i < tries; i++)
		{
			int x1 = random.nextInt(16) + x;
			int y1 = random.nextInt(maxY - minY) + minY;
			int z1 = random.nextInt(16) + z;
			BlockPos pos = new BlockPos(x1, y1, z1);
	        IBlockState state = ore.getDefaultState();
			new WorldGenMinable(state, amount).generate(world, random, pos);
		}
	}
	
}
