package com.jordsta.stuff.blocks;

import com.jordsta.stuff.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class smelter extends Block implements ITileEntityProvider{
	
	public static String name = "smelter";
	private String privateName = "smelter";
	
	private IIcon[] icons = new IIcon[6];
	
	public smelter()
	{
		super(Material.rock);
		setBlockName("smelter");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(2.0f);
		setResistance(3.0f);
		setHarvestLevel("pickaxe", 1);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntitySmelter();
	}
	
	@Override
	public boolean hasTileEntity(int metadata){
		return true;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		for (int i = 0; i <icons.length; i++){
		icons[i] = iconRegister.registerIcon(Reference.MODID + ":" + name + i);
	}
	}
	
	@Override
	public IIcon getIcon(int side, int meta){
		return icons[side];
	}

}
