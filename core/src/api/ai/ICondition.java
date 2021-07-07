/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/
package api.ai;
import java.util.function.Predicate;
@FunctionalInterface
// line 13 "../../ai.ump"
public interface ICondition
{
  
  <T> Predicate<T> getTest() ;

  default <T> boolean isMet (T value) 
  {
    return getTest().test(value);
  }

}