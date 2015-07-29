package com.matt.mods.naturalrocks.crafting;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.matt.mods.naturalrocks.blocks.NRBlocks;

public class NRRecipes {
	
	public static final void initRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(NRBlocks.marbleBricks, 4), new Object[]{
			"XX", "XX", 'X', NRBlocks.marble
		});
	}
	
}
