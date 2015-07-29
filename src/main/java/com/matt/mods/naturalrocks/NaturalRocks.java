package com.matt.mods.naturalrocks;

import com.matt.mods.naturalrocks.blocks.NRBlocks;
import com.matt.mods.naturalrocks.crafting.NRRecipes;
import com.matt.mods.naturalrocks.tabs.NRTabs;
import com.matt.mods.naturalrocks.worldgen.NRWorldGen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NaturalRocks.modid, name = NaturalRocks.name, version = NaturalRocks.version)
public class NaturalRocks {
	public static final String modid = "mattnaturalrocks";
	public static final String name = "Natural Rocks";
	public static final String version = "1.8";
	public static final String prefix = modid + ":";
	
	@Instance(NaturalRocks.modid)
	public static NaturalRocks instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		NRTabs.initTabs();
		NRBlocks.initBlocks(event);
		NRWorldGen.initWorldGen();
		NRRecipes.initRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
