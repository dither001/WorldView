/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/
package ecs.entity;
// line 7 "../../ecs_event.ump"
public interface IEventSubscriber
{
  
  // ABSTRACT METHODS 

 public Consumer<IEvent> getConsumerEvent();
 public IEventSubscriber setConsumerEvent();
}