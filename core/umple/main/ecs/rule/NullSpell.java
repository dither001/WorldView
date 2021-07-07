/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package main.ecs.rule;
import api.ecs.rule.*;

// line 32 "../../../ecs_rule.ump"
public class NullSpell implements ISpell
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static NullSpell theInstance = null;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  private NullSpell()
  {}

  public static NullSpell getInstance()
  {
    if(theInstance == null)
    {
      theInstance = new NullSpell();
    }
    return theInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  @Override
  public boolean beforeCast(Function<Boolean,ISpellContext> beforeCast){
          return false;
  }

  @Override
  public boolean cast(Function<Boolean,ISpellContext> cast){
          return false;
  }

  @Override
  public boolean continuous(Function<Boolean,ISpellContext> continuous){
          return false;
  }

  @Override
  public boolean afterCast(Function<Boolean,ISpellContext> afterCast){
          return false;
  }

}