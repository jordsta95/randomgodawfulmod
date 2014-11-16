package com.jordsta.stuff.items;

import com.jordsta.stuff.Reference;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class testItem extends Item 
{
	public testItem(){
		setUnlocalizedName("testItem");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMisc);
	}
}
