package com.matt.mods.naturalrocks.tabs;

import com.matt.mods.naturalrocks.blocks.NRBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NaturalRocksTab extends CreativeTabs {

	public NaturalRocksTab() {
		super("naturalrocks");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(NRBlocks.marble);
	}
	
}
