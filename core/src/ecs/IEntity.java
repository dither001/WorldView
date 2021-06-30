package ecs;

public interface IEntity extends IMutableComponentGroup {

	public static final IEntity NULL = NullEntity.getInstance();

	/**
	 * Copies this entity, creating a new entity with identical components. Note:
	 * You will need to be careful when copying entities, particularly around
	 * ownership - this method does nothing to prevent you ending up with multiple
	 * entities owning the same entities.
	 *
	 * @return A copy of this entity.
	 */
	public abstract IEntity copy();

	/**
	 * @return Does this entity exist - that is, is not deleted.
	 */
	public abstract boolean exists();

	/**
	 * @return Whether this entity is currently loaded (not stored)
	 */
	public abstract boolean isActive();

	/**
	 * Removes all components and destroys it
	 */
	public abstract void destroy();

	/**
	 * Transmits an event to this entity
	 *
	 * @param event
	 */
	public abstract IEvent send(IEvent event);

	/**
	 * @return The identifier of this entity. Should be avoided where possible and
	 *         the IEntity used instead to allow it to be invalidated if the entity
	 *         is destroyed.
	 */
	public abstract long getId();

	/**
	 * @return Whether this entity should be saved
	 */
	public abstract boolean isPersistent();

	/**
	 * @return Whether this entity should remain active even when the part of the
	 *         world/owner of the entity is not relevant
	 */
	public abstract boolean isAlwaysRelevant();

	/**
	 * @return The owning entity of this entity
	 */
	public abstract IEntity getOwner();

	/**
	 * Sets the scope of the entity
	 *
	 * @param scope the new scope for the entity
	 */
	public void setScope(IEntityScope scope);

	/**
	 * Sets the scope of this entity to sector-scope, and sets the
	 * {@link SectorSimulationComponent#unloadedMaxDelta} and
	 * {@link SectorSimulationComponent#loadedMaxDelta} to the same given value.
	 *
	 * @param maxDelta the maximum delta for the sector-scope entity (loaded and
	 *                 unloaded)
	 */
	public void setSectorScope(long maxDelta);

	/**
	 * Sets the scope of this entity to sector-scope, and sets the
	 * {@link SectorSimulationComponent#unloadedMaxDelta} and
	 * {@link SectorSimulationComponent#loadedMaxDelta} to the given values.
	 *
	 * @param unloadedMaxDelta the maximum unloaded delta for the sector-scope
	 *                         entity
	 * @param loadedMaxDelta   the maximum loaded delta for the sector-scope entity
	 */
	public void setSectorScope(long unloadedMaxDelta, long loadedMaxDelta);

	/**
	 * @return the scope of the entity
	 */
	public IEntityScope getScope();

	/**
	 * Sets the entity that owns this entity.
	 *
	 * @param owner
	 */
	public abstract void setOwner(IEntity owner);

	/**
	 * Invalidates this IEntity
	 */
	public void invalidate();
}
