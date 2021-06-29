package model.world;

import model.block.IBlock;

public interface IWorldChangeListener {

	// FIXME
	void onBlockChanged(Vector3i pos, IBlock newBlock, IBlock originalBlock);

	// FIXME
	void onExtraDataChanged(int i, Vector3i pos, int newData, int oldData);
}
