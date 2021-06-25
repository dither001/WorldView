package world.chunk;

import world.block.IBlock;
import world.block.IBlockPosition;

public interface IChunk {

	//
	static int CHUNK_LENGTH = 16;
	static int CHUNK_AREA = CHUNK_LENGTH * CHUNK_LENGTH;
	static int CHUNK_HEIGHT = 256;
	static int CHUNK_VOLUME = CHUNK_AREA * CHUNK_HEIGHT;

	
	IBlock getBlock(IBlockPosition pos);

	IBlock setBlock(IBlockPosition pos, IBlock block);

	IChunkPosition getChunkPosition();
}
