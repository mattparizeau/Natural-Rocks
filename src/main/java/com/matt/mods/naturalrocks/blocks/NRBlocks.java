package com.matt.mods.naturalrocks.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

import com.matt.mods.naturalrocks.NaturalRocks;

public class NRBlocks {
	
	public static List<CustomBlock> blocks;
	
	public static CustomBlock marble;
	public static CustomBlock marbleBricks;
	
	public static final void initBlocks(FMLInitializationEvent event)
	{
		blocks = new ArrayList<CustomBlock>();
		
		marble = (CustomBlock)new CustomBlock("marble", Material.rock).setHardness(1.5f).setResistance(10.0f).setStepSound(Block.soundTypePiston);
		marbleBricks = (CustomBlock)new CustomBlock("marbleBricks", Material.rock).setHardness(1.5f).setResistance(10.0f).setStepSound(Block.soundTypePiston);
		
		if (event.getSide() == Side.CLIENT)
		{
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
			
			for (CustomBlock block : blocks)
			{
				renderItem.getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(NaturalRocks.prefix + block.getName(), "inventory"));
			}
		}
	}
	
}
