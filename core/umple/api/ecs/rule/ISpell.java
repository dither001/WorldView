/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/
package api.ecs.rule;
// line 3 "../../../ecs_rule.ump"
public interface ISpell
{
  
  // CONSTANT MEMBERS  

 public static final ISpell NULL = NullSpell.getInstance();
  // ABSTRACT METHODS 

 public boolean beforeCast(Function<Boolean,ISpellContext> beforeCast);
 public boolean cast(Function<Boolean,ISpellContext> cast);
 public boolean continuous(Function<Boolean,ISpellContext> continuous);
 public boolean afterCast(Function<Boolean,ISpellContext> afterCast);
}