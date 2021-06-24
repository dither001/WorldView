package model.block;

import model.IWorld;
import model.entity.IEntityLiving;
import model.inventory.IInventoryTab;
import model.item.IItemStack;

public class Block implements IBlock {

	@Override
	public boolean setBlockUnbreakable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String setBlockName(String blockName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setBlockTextureName(String textureName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IInventoryTab setCreativeTab(IInventoryTab tab) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setTickRandomly(boolean bool) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateTick(IWorld world, int x, int y, int z, Object rand) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onBlockAdded(IWorld world, int x, int y, int z) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onBlockPlacedBy(IWorld world, int i, int j, int k, IEntityLiving entityLiving, IItemStack itemStack) {
		// TODO Auto-generated method stub

	}

}
