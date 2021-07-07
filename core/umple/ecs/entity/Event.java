/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package ecs.entity;
import java.util.*;

// line 12 "../../ecs_event.ump"
public class Event implements IEvent
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Event Attributes
  private List<IEventSubscriber> subscribers;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Event()
  {
    subscribers = new ArrayList<IEventSubscriber>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addSubscriber(IEventSubscriber aSubscriber)
  {
    boolean wasAdded = false;
    wasAdded = subscribers.add(aSubscriber);
    return wasAdded;
  }

  public boolean removeSubscriber(IEventSubscriber aSubscriber)
  {
    boolean wasRemoved = false;
    wasRemoved = subscribers.remove(aSubscriber);
    return wasRemoved;
  }
  /* Code from template attribute_GetMany */
  public IEventSubscriber getSubscriber(int index)
  {
    IEventSubscriber aSubscriber = subscribers.get(index);
    return aSubscriber;
  }

  public IEventSubscriber[] getSubscribers()
  {
    IEventSubscriber[] newSubscribers = subscribers.toArray(new IEventSubscriber[subscribers.size()]);
    return newSubscribers;
  }

  public int numberOfSubscribers()
  {
    int number = subscribers.size();
    return number;
  }

  public boolean hasSubscribers()
  {
    boolean has = subscribers.size() > 0;
    return has;
  }

  public int indexOfSubscriber(IEventSubscriber aSubscriber)
  {
    int index = subscribers.indexOf(aSubscriber);
    return index;
  }

  public void delete()
  {}

  @Override
  public void notifySubscribers(){
          return ;
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}