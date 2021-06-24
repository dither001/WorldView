package model.inventory;

import model.entity.IEntityPlayer;
import model.item.IItemStack;

public interface IInventory {
	int getSizeInventory();

	IItemStack getStackInSlot(int slot);

	IItemStack decrStackSize(int a, int b);

	IItemStack getStackInSlotOnClosing(int a);

	void setInventorySlotContents(int slot, IItemStack stack);
	
	String getInventoryName();
	boolean hasCustomInventoryName();
	int getInventoryStackLimit();
	void markDirty();
	boolean isUseableByPlayer(IEntityPlayer player);
	void openInventory();
	void closeInventory();
	boolean isItemValidForSlot(int slot, IItemStack stack);
	
}
