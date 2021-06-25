package world.chunk;

public interface IChunkQuery {

	void block();

	boolean isFinished();

	boolean shouldRelease();

	IChunkPosition getChunkPosition();

	int getChunkGenerationStage();

	IChunkGrid getChunkGrid();

	default void release() {
		getChunkGrid().releaseQuery(this);
	}
}
