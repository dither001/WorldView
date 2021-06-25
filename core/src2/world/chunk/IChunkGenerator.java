package world.chunk;

public interface IChunkGenerator {

	void submitQuery(IChunkQuery query);
	void finishQuery(IChunkQuery query);
	
}
