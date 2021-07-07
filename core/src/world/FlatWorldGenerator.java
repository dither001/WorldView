package world;

import misc.IChunk;
import misc.IWorld;

public class FlatWorldGenerator implements IWorldGenerator {

	String seed;
	IWorld world;
	IWorldBuilder builder;

	@Override
	public String getSeed() {
		return seed;
	}

	@Override
	public void setSeed(String seed) {
		this.seed = seed;
	}

	@Override
	public IWorld getWorld() {
		return world;
	}

	@Override
	public IEntityPosition getSpawn() {
		return spawn;
	}

	IEntityPosition spawn;

	@Override
	public void createChunk(IChunk chunk, IEntityBuffer buffer) {
		// TODO Auto-generated method stub

	}
}
