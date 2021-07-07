/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/
package api.ai;
// line 4 "../../ai.ump"
public interface IAction
{
  
  // ABSTRACT METHODS 

 public boolean canDo();
 public boolean isDone();
 public float getCost();
 public void reset();
}