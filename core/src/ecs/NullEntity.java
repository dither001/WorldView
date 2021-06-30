package ecs;

import java.util.List;

public class NullEntity implements IEntity {

	@Override
	public IComponent addComponent(IComponent component) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeComponent(IComponent componentClass) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveComponent(IComponent component) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasComponent(String componentName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasAnyComponents(List<String> filterComponents) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasAllComponents(List<String> filterComponents) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IComponent getComponent(String componentClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<IComponent> iterateComponents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEntity copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public IEvent send(IEvent event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isPersistent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAlwaysRelevant() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IEntity getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setScope(IEntityScope scope) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSectorScope(long maxDelta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSectorScope(long unloadedMaxDelta, long loadedMaxDelta) {
		// TODO Auto-generated method stub

	}

	@Override
	public IEntityScope getScope() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOwner(IEntity owner) {
		// TODO Auto-generated method stub

	}

	@Override
	public void invalidate() {
		// TODO Auto-generated method stub

	}

	public static IEntity getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
