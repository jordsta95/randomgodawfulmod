package com.jordsta.stuff.blocks;

import com.jordsta.stuff.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class testBlock extends Block
{
	public testBlock()
	{
		super(Material.rock);
		setBlockName("testBlock");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(2.0f);
		setResistance(3.0f);
		setHarvestLevel("pickaxe", 1);
	}
}
