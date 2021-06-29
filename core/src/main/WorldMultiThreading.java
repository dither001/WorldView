/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package main;

import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;
import java.util.concurrent.ForkJoinWorkerThread;
import java.util.concurrent.Phaser;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// line 3 "main.ump"
public class WorldMultiThreading {

	// ------------------------
	// STATIC VARIABLES
	// ------------------------

	/**
	 * log4j version 2 requires jars (log4j-api-2.0.1.jar) and
	 * (log4j-core-2.0.1.jar)
	 */
	public static final Logger logger = LogManager.getLogger(WorldMultiThreading.class);

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------
	static IConfigMultiThreading config = (IConfigMultiThreading) new Object(); // FIXME - replace with actual config

	static Phaser p;
	static ExecutorService ex;
	static IServer mcs;
	static AtomicBoolean isTicking = new AtomicBoolean();
	static AtomicInteger threadID = new AtomicInteger();

	static Map<String, Set<Thread>> mcThreadTracker = new ConcurrentHashMap<String, Set<Thread>>();

	// Statistics
	static AtomicInteger currentWorlds = new AtomicInteger();
	static AtomicInteger currentEnts = new AtomicInteger();
	static AtomicInteger currentTEs = new AtomicInteger();
	static AtomicInteger currentEnvs = new AtomicInteger();

	static Set<String> currentTasks = ConcurrentHashMap.newKeySet();

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public WorldMultiThreading() {
		setupThreadpool(4);
	}

	// ------------------------
	// INTERFACE
	// ------------------------
	public static void setupThreadpool(int parallelism) {
		threadID = new AtomicInteger();
		final ClassLoader cl = (ClassLoader) new Object(); // FIXME = MCMT.class.getClassLoader();
		ForkJoinWorkerThreadFactory fjpf = p -> {
			ForkJoinWorkerThread fjwt = ForkJoinPool.defaultForkJoinWorkerThreadFactory.newThread(p);
			fjwt.setName("MCMT-Pool-Thread-" + threadID.getAndIncrement());
			regThread("MCMT", fjwt);
			fjwt.setContextClassLoader(cl);
			return fjwt;
		};
		ex = new ForkJoinPool(parallelism, fjpf, null, false);
	}

	public static void regThread(String poolName, Thread thread) {
		mcThreadTracker.computeIfAbsent(poolName, s -> ConcurrentHashMap.newKeySet()).add(thread);
	}

	public static boolean isThreadPooled(String poolName, Thread t) {
		return mcThreadTracker.containsKey(poolName) && mcThreadTracker.get(poolName).contains(t);
	}

	public static boolean serverExecutionThreadPatch(IServer ms) {
		return isThreadPooled("MCMT", Thread.currentThread());
	}

	public static void preTick(IServer server) {
		if (p != null) {
			logger.warn("Multiple servers?");
			return;
		} else {
			isTicking.set(true);
			p = new Phaser();
			p.register();
			mcs = server;
//			StatsCommand.setServer(mcs); // FIXME
		}
	}

	public static void callTick(IServerWorld serverworld, BooleanSupplier hasTimeLeft, IServer server) {
		if (config.isMultithreadingDisabled() || config.worldMultiThreadingDisabled()) {
			try {
				serverworld.tick(hasTimeLeft);
			} catch (Exception e) {
				throw e;
			} finally {
//				net.minecraftforge.fml.hooks.BasicEventHooks.onPostWorldTick(serverworld); // FIXME
			}
			return;
		}
		if (mcs != server) {
			logger.warn("Multiple servers?");
			config.disableMultithreading();
			serverworld.tick(hasTimeLeft);
//			net.minecraftforge.fml.hooks.BasicEventHooks.onPostWorldTick(serverworld); // FIXME
			return;
		} else {
			String taskName = "WorldTick: " + serverworld.toString() + "@" + serverworld.hashCode();
			if (config.multiThreadingLoggingDisabled()) {
				currentTasks.add(taskName);
			}

			p.register();
			ex.execute(() -> {
				try {
					currentWorlds.incrementAndGet();
					serverworld.tick(hasTimeLeft);
					if (config.disableWorldPostTick()) {
						p.register();
						ex.execute(() -> {
							try {
								// ForkJoinPool.managedBlock(
								// new RunnableManagedBlocker(() -> {

								// FIXME
//								synchronized (net.minecraftforge.fml.hooks.BasicEventHooks.class) { net.minecraftforge.fml.hooks.BasicEventHooks.onPostWorldTick(serverworld); }
								// END FIXME

								// }));
								// } catch (InterruptedException e) {
								// e.printStackTrace();
							} finally {
								p.arriveAndDeregister();
							}
						});
					} else {
//						net.minecraftforge.fml.hooks.BasicEventHooks.onPostWorldTick(serverworld); // FIXME
					}
				} finally {
					p.arriveAndDeregister();
					currentWorlds.decrementAndGet();
					if (config.multiThreadingLoggingDisabled()) {
						currentTasks.remove(taskName);
					}

				}
			});
		}

	}

	public static void callEntityTick(IEntity entityIn, IServerWorld serverworld) {
		if (config.isMultithreadingDisabled() || config.entityMultiThreadingDisabled()) {
			entityIn.tick();
			return;
		}
		String taskName = "EntityTick: " + entityIn.toString() + "@" + entityIn.hashCode();
		if (config.multiThreadingLoggingDisabled())
			currentTasks.add(taskName);
		p.register();
		ex.execute(() -> {
			try {
				currentEnts.incrementAndGet();
				entityIn.tick();
			} finally {
				currentEnts.decrementAndGet();
				p.arriveAndDeregister();
				if (config.multiThreadingLoggingDisabled()) {
					currentTasks.remove(taskName);
				}
			}
		});
	}

//
	public static void callTickEnvironment(IServerWorld world, IChunk chunk, int k, IServerChunkProvider scp) {
		if (config.isMultithreadingDisabled() || config.environmentMultiThreadingDisabled()) {
			world.tickEnvironment(chunk, k);
			return;
		}
		String taskName = "EnvTick: " + chunk.toString() + "@" + chunk.hashCode();
		if (config.multiThreadingLoggingDisabled()) {
			currentTasks.add(taskName);
		}
		p.register();
		ex.execute(() -> {
			try {
				currentEnvs.incrementAndGet();
				world.tickEnvironment(chunk, k);
			} finally {
				currentEnvs.decrementAndGet();
				p.arriveAndDeregister();
				if (config.multiThreadingLoggingDisabled()) {
					currentTasks.remove(taskName);
				}
			}
		});
	}

	public static boolean filterTE(ITickableTileEntity tte) {
		boolean isLocking = false;
		if (config.getTileEntityBlackList().contains(tte.getClass())) {
			isLocking = true;
		}
		// Apparently a string starts with check is faster than Class.getPackage; who
		// knew (I didn't)
		if (!isLocking && config.chunkLockUnknownEntities()
				&& !tte.getClass().getName().startsWith("net.minecraft.tileentity.")) {
			isLocking = true;
		}
		if (isLocking && config.getTileEntityWhiteList().contains(tte.getClass())) {
			isLocking = false;
		}
//		if (tte instanceof PistonTileEntity) {
//			isLocking = true; ?? FIXME
//		}
		return isLocking;
	}

	public static void callTileEntityTick(ITickableTileEntity tte, IWorld world) {
		if (config.isMultithreadingDisabled() || config.tileEntityMultiThreadingDisabled()
				|| !(world instanceof IServerWorld)) {
			tte.tick();
			return;
		}
		String taskName = "TETick: " + tte.toString() + "@" + tte.hashCode();
		if (config.multiThreadingLoggingDisabled())
			currentTasks.add(taskName);
		p.register();
		ex.execute(() -> {
			try {
				final boolean doLock = filterTE(tte);
				if (doLock) {
					// ForkJoinPool.managedBlock(new RunnableManagedBlocker(() -> {
					IBlockPosition bp = ((ITileEntity) tte).getPosition();
					long[] locks = IChunkLock.lock(bp, 1);
					try {
						currentTEs.incrementAndGet();
						tte.tick();
					} finally {
						IChunkLock.unlock(locks);
					}
					// }));
				} else {
					currentTEs.incrementAndGet();
					tte.tick();
				}

			} catch (Exception e) {
				System.err.println("Exception ticking TE at " + ((ITileEntity) tte).getPosition());
				e.printStackTrace();

			} finally {
				currentTEs.decrementAndGet();
				p.arriveAndDeregister();
				if (config.multiThreadingLoggingDisabled()) {
					currentTasks.remove(taskName);
				}

			}
		});
	}

	public static void sendQueuedBlockEvents(Deque<IBlockEventData> d, IServerWorld sw) {
		Iterator<IBlockEventData> bed = d.iterator();
		while (bed.hasNext()) {
			IBlockEventData blockeventdata = bed.next();
			if (sw.fireBlockEvent(blockeventdata)) {
				/* 1.16.1 code; AKA the only thing that changed */
//				sw.getServer().getPlayerList().sendToAllNearExcept((IPlayerEntity)null, (double)blockeventdata.getPosition().getX(), (double)blockeventdata.getPosition().getY(), (double)blockeventdata.getPosition().getZ(), 64.0D, sw.func_234923_W_(), new SBlockActionPacket(blockeventdata.getPosition(), blockeventdata.getBlock(), blockeventdata.getEventID(), blockeventdata.getEventParameter()));
				/* */
				/*
				 * 1.15.2 code; AKA the only thing that changed
				 * sw.getServer().getPlayerList().sendToAllNearExcept((PlayerEntity)null,
				 * (double)blockeventdata.getPosition().getX(),
				 * (double)blockeventdata.getPosition().getY(),
				 * (double)blockeventdata.getPosition().getZ(), 64.0D,
				 * sw.getDimension().getType(), new
				 * SBlockActionPacket(blockeventdata.getPosition(), blockeventdata.getBlock(),
				 * blockeventdata.getEventID(), blockeventdata.getEventParameter())); /*
				 */
			}
			if (!isTicking.get()) {
				logger.fatal("Block updates outside of tick");
			}
			bed.remove();
		}
	}

	public static void postTick(IServer server) {
		if (mcs != server) {
			logger.warn("Multiple servers?");
			return;
		} else {
			p.arriveAndAwaitAdvance();
			isTicking.set(false);
			p = null;
		}
	}

}