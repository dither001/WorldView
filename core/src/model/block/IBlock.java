package model.block;

import item.IItemStack;
import model.IWorld;
import model.entity.IEntityLiving;
import model.inventory.IInventoryTab;

public interface IBlock {

	boolean setBlockUnbreakable();
	String setBlockName(String blockName);
	String setBlockTextureName(String textureName);
	IInventoryTab setCreativeTab(IInventoryTab tab);
	boolean setTickRandomly(boolean bool);

	void updateTick(IWorld world, int x, int y, int z, Object rand);	
	void onBlockAdded(IWorld world, int x, int y, int z);
	void onBlockPlacedBy(IWorld world, int i, int j, int k, IEntityLiving entityLiving, IItemStack itemStack);
}
