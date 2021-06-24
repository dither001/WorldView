package model.world;

import model.block.IBlock;

public interface IWorldProvider {

	IEntity getWorldEntity();

	/**
	 * Returns the title of this world.
	 *
	 * @return the title of this world
	 */
	String getTitle();

	/**
	 * Returns the seed of this world.
	 *
	 * @return The seed value
	 */
	long getSeed();

	/**
	 * @return General world info
	 */
//    WorldInfo getWorldInfo();

	/**
	 * Process any propagation, such as light
	 */
	void processPropagation();

	/**
	 * @param listener
	 */
	void registerListener(IWorldChangeListener listener);

	void unregisterListener(IWorldChangeListener listener);

	/**
	 * @param chunkPos
	 * @return A world view centered on the desired chunk, with the surrounding
	 *         chunks present.
	 */
//    ChunkViewCore getLocalView(Vector3i chunkPos);

	/**
	 * @param chunk
	 * @return A world view of the chunks around the desired chunk, uncentered.
	 */
//    ChunkViewCore getWorldViewAround(Vector3i chunk);

	/**
	 * An active block is in a chunk that is available and fully generated.
	 *
	 * @param x
	 * @param y
	 * @param z
	 * @return Whether the given block is active
	 */
	boolean isBlockRelevant(int x, int y, int z);

	/**
	 * An active block is in a chunk that is available and fully generated.
	 * 
	 * @param pos The position
	 * @return Whether the given block is active
	 */
//    boolean isBlockRelevant(Vector3ic pos);

	/**
	 * An active block is in a chunk that is available and fully generated.
	 *
	 * @param pos The position
	 * @return Whether the given block is active
	 */
//    boolean isBlockRelevant(Vector3fc pos);

//    boolean isRegionRelevant(Region3i region);

	/**
	 * Places a block of a specific type at a given position
	 *
	 * @param pos  The world position to change
	 * @param type The type of the block to set
	 * @return The previous block type. Null if the change failed (because the
	 *         necessary chunk was not loaded)
	 */
//    IBlock setBlock(Vector3ic pos, IBlock type);

	/**
	 * Places all given blocks of specific types at their corresponding positions
	 * </p>
	 * Chunks are
	 *
	 * @param blocks A mapping from world position to change to the type of block to
	 *               set
	 * @return A mapping from world position to previous block type. The value of a
	 *         map entry is Null if the change failed (because the necessary chunk
	 *         was not loaded)
	 */
//    default Map<Vector3i, Block> setBlocks(Map<Vector3i, Block> blocks) {
//        Map<Vector3i, Block> resultMap = Maps.newHashMap();
//        for (Map.Entry<Vector3i, Block> entry: blocks.entrySet()) {
//            Block oldBlock = setBlock(entry.getKey(), entry.getValue());
//            resultMap.put(entry.getKey(), oldBlock);
//        }
//        return resultMap;
//    }

	/**
	 * Returns the block at the given position.
	 *
	 * @param x The X-coordinate
	 * @param y The Y-coordinate
	 * @param z The Z-coordinate
	 * @return The type of the block
	 */
	IBlock getBlock(int x, int y, int z);

	/**
	 * Returns the block value at the given position.
	 *
	 * @param pos The position
	 * @return The block value at the given position
	 */
//    IBlock getBlock(Vector3ic pos);

	/**
	 * Returns the light value at the given position.
	 *
	 * @param x The X-coordinate
	 * @param y The Y-coordinate
	 * @param z The Z-coordinate
	 * @return The light value
	 */
	byte getLight(int x, int y, int z);

	/**
	 * Returns the light value at the given position.
	 *
	 * @param pos The position
	 * @return The block value at the given position
	 */
//    byte getLight(Vector3f pos);

	/**
	 * Returns the sunlight value at the given position
	 *
	 * @param x
	 * @param y
	 * @param z
	 * @return The sunlight value
	 */
	byte getSunlight(int x, int y, int z);

	/**
	 * Returns the sunlight value at the given position.
	 *
	 * @param pos The position
	 * @return The block value at the given position
	 */
//    byte getSunlight(Vector3f pos);

	byte getTotalLight(int x, int y, int z);

//    byte getTotalLight(Vector3f pos);

	/**
	 * Gets one of the per-block custom data values at the given position. Returns 0
	 * outside the view.
	 *
	 * @param index The index of the extra data field
	 * @param x
	 * @param y
	 * @param z
	 * @return The (index)th extra-data value at the given position
	 */
	int getExtraData(int index, int x, int y, int z);

	/**
	 * Sets one of the per-block custom data values at the given position, if it is
	 * within the view.
	 *
	 * @param index The index of the extra data field
	 * @param pos
	 * @param value
	 * @return The replaced value
	 */
//    int setExtraData(int index, Vector3i pos, int value);

	/**
	 * Disposes this world provider.
	 */
	void dispose();

	IWorldTime getTime();

	/**
	 * @return an unmodifiable view on the generated relevant regions
	 */
//    Collection<Region3i> getRelevantRegions();
}
