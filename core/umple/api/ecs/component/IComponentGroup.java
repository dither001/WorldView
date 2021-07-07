/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/
package api.ecs.component;
// line 13 "../../../ecs_component.ump"
public interface IComponentGroup extends IComponent
{
    default IComponent getComponent (IComponent aComponent) 
  {
    return getComponent(indexOfComponent(aComponent));
  }

  // ABSTRACT METHODS 

 public boolean addComponent(IComponent aComponent);
 public boolean removeComponent(IComponent aComponent);
 public IComponent getComponent(int index);
 public IComponent[] getComponents();
 public int numberOfComponents();
 public boolean hasComponents();
 public int indexOfComponent(IComponent aComponent);
}