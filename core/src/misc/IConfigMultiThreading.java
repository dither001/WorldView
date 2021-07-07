package misc;

import java.util.Set;

public interface IConfigMultiThreading {

	// FIXME - may ultimately be unnecessary
	boolean isMultithreadingDisabled ();

	boolean worldMultiThreadingDisabled();

	void disableMultithreading();

	boolean multiThreadingLoggingDisabled();

	boolean disableWorldPostTick();

	boolean entityMultiThreadingDisabled();

	boolean environmentMultiThreadingDisabled();

	boolean tileEntityMultiThreadingDisabled();

	Set<Class<?>> getTileEntityBlackList();
	Set<Class<?>> getTileEntityWhiteList();

	boolean chunkLockUnknownEntities();
}
