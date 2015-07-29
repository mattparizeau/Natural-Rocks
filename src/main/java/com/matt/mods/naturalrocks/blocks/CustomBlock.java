package com.matt.mods.naturalrocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.matt.mods.naturalrocks.tabs.NRTabs;

public class CustomBlock extends Block {
	
	protected String name;
	
	public CustomBlock(String name, Material material)
	{
		super(material);
		this.name = name;
		this.setUnlocalizedName(/*NaturalRocks.modid + "_" + */name);
		this.setCreativeTab(NRTabs.naturalRocksTab);
		GameRegistry.registerBlock(this, name);
		NRBlocks.blocks.add(this);
	}
	
	public String getName()
	{
		return this.name;
	}
	
}
