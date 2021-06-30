package ecs;

public interface IMutableComponentGroup extends IComponentGroup {

	/**
	 * Adds a component. If this already has a component of the same class it is
	 * replaced.
	 *
	 * @param component
	 */
	IComponent addComponent(IComponent component);

	/**
	 * @param componentClass
	 */
	void removeComponent(IComponent componentClass);

	/**
	 * Saves changes made to a component
	 *
	 * @param component
	 */
	void saveComponent(IComponent component);

	default void addOrSaveComponent(IComponent component) {
		if (hasComponent(component.getClass().getSimpleName())) {
			saveComponent(component);
		} else {
			addComponent(component);
		}
	}
}
