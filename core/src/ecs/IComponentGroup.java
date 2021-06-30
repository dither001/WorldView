package ecs;

import java.util.List;

public interface IComponentGroup {

	/**
	 * Check existence of component in container
	 * 
	 * @param component component class to check
	 * @return If this has a component of the given type
	 */
	boolean hasComponent(String componentName);

	/**
	 * Check existence of any of provided components in container
	 * 
	 * @param filterComponents list of Component classes to check
	 * @return If this has at least one component from the list of components
	 */
	boolean hasAnyComponents(List<String> filterComponents);

	/**
	 * Check existence of all provided components in container
	 * 
	 * @param filterComponents list of Component classes to check
	 * @return If this has all components from the list of components
	 */
	boolean hasAllComponents(List<String> filterComponents);

	/**
	 * @param componentClass
	 * @param <T>
	 * @return The requested component, or null if the this doesn't have a component
	 *         of this type
	 */
	IComponent getComponent(String componentClass);

	/**
	 * Iterates over all the components this entity has
	 *
	 * @return
	 */
	Iterable<IComponent> iterateComponents();
}
