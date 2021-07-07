package misc;

import java.util.function.BooleanSupplier;

public interface IServerWorld {

	void tick(BooleanSupplier hasTimeLeft);

	void tickEnvironment(IChunk chunk, int k);

	IServer getServer();

	boolean fireBlockEvent(IBlockEventData blockeventdata);

}
