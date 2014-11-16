package com.jordsta.stuff;

import com.jordsta.stuff.blocks.TileEntitySmelter;

import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntitySmelter.class, TileEntitySmelter.name);
	}

}
