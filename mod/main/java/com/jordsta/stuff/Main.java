package com.jordsta.stuff;

import com.jordsta.stuff.blocks.smelter;
import com.jordsta.stuff.blocks.testBlock;
import com.jordsta.stuff.items.testItem;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class Main
{
	//Proxies
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	//Blocks
    public static Block testBlock;
    public static Block smelter;
  
    //Items
    public static Item testItem;
    
    @EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
    	//New Block
    	testBlock = new testBlock();
    	smelter = new smelter();
    	
    	
    	//New Items
    	testItem = new testItem();
    	
    	
    	
    	//Register Blocks
    	RegisterHelper.registerBlock(testBlock);
    	RegisterHelper.registerBlock(smelter);
    	
    	//Register Items
    	RegisterHelper.registerItem(testItem);
    	
    	
    	
    	//Recipes
    	GameRegistry.addRecipe(new ItemStack(testBlock), new Object[]{
    		"I I","ITI","I I",'I',Items.iron_ingot,'T',testItem
    	});
    
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	proxy.registerTileEntities();
    }
}
