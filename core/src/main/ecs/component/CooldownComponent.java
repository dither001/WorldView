/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package main.ecs.component;
import api.ecs.component.*;

// line 41 "../../../ecs_component.ump"
public class CooldownComponent implements IComponent
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CooldownComponent Attributes
  private int start;
  private int end;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CooldownComponent(int aStart, int aEnd)
  {
    start = aStart;
    end = aEnd;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public int getStart()
  {
    return start;
  }

  public int getEnd()
  {
    return end;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "start" + ":" + getStart()+ "," +
            "end" + ":" + getEnd()+ "]";
  }
}