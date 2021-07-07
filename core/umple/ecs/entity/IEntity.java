/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/
package ecs.entity;
/**
 * 
 * 
 * 
 */
// line 10 "../../ecs_entity.ump"
public interface IEntity extends IComponentGroup
{
  
  // CONSTANT MEMBERS  

 public static final IEntity NULL = NullEntity.getInstance();
  // ABSTRACT METHODS 

 public UUID getId();
 public boolean isActive();
 public boolean isPersistent();
}