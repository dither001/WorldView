/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package main.ecs.rule;

/**
 * 
 * 
 * 
 */
// line 27 "../../../ecs_rule.ump"
public class SpellContext
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SpellContext Attributes
  private IWorld world;
  private IEntity caster;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SpellContext(IWorld aWorld, IEntity aCaster)
  {
    world = aWorld;
    caster = aCaster;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setWorld(IWorld aWorld)
  {
    boolean wasSet = false;
    world = aWorld;
    wasSet = true;
    return wasSet;
  }

  public boolean setCaster(IEntity aCaster)
  {
    boolean wasSet = false;
    caster = aCaster;
    wasSet = true;
    return wasSet;
  }

  public IWorld getWorld()
  {
    return world;
  }

  public IEntity getCaster()
  {
    return caster;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "world" + "=" + (getWorld() != null ? !getWorld().equals(this)  ? getWorld().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "caster" + "=" + (getCaster() != null ? !getCaster().equals(this)  ? getCaster().toString().replaceAll("  ","    ") : "this" : "null");
  }
}