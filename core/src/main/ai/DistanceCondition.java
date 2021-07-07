/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package main.ai;
import java.util.function.Predicate;

import api.ai.*;

/**
 * 
 * 
 * 
 */
// line 113 "../../ai.ump"
public class DistanceCondition implements ICondition
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------
	float distance;
	Predicate<Float> test = new Predicate<Float>() {
		@Override public boolean test(Float value) {
			return value < distance;
		}
	};

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DistanceCondition()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  @Override
  public <T> Predicate<T> getTest(){
          return test;
  }

}