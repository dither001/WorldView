/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package main.ecs.component;

// line 47 "../../../ecs_component.ump"
public class LivingEntityComponent
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LivingEntityComponent Attributes
  private boolean isAlive;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public LivingEntityComponent(boolean aIsAlive)
  {
    isAlive = aIsAlive;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsAlive(boolean aIsAlive)
  {
    boolean wasSet = false;
    isAlive = aIsAlive;
    wasSet = true;
    return wasSet;
  }

  public boolean getIsAlive()
  {
    return isAlive;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "isAlive" + ":" + getIsAlive()+ "]";
  }
}