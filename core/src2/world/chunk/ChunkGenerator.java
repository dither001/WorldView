package world.chunk;

public class ChunkGenerator {

	IChunkGrid grid;
	
	void submitQuery(IChunkQuery query) {
		IChunk chunk = query.chunk;
		// Check if its already done
	    if (chunk.genLevel >= query.genLevel) {
	        query.m_isFinished = true;
	        query->m_cond.notify_all();
	        query->chunk.release();
	        if (query->shouldRelease) query->release();
	        return;
	    }
	    
	    
	}
}
