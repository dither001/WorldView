package world;

import misc.IChunk;
import misc.IWorld;

public interface IWorldGenerator {

	String getSeed();

	void setSeed(String seed);

	IWorld getWorld();

	IEntityPosition getSpawn();
	
	void createChunk(IChunk chunk, IEntityBuffer buffer);

}