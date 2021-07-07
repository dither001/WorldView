/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package util;
import java.util.Optional;

// line 4 "../util.ump"
public class Util
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static Util theInstance = null;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  private Util()
  {}

  public static Util getInstance()
  {
    if(theInstance == null)
    {
      theInstance = new Util();
    }
    return theInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 9 "../util.ump"
  public <T> boolean ensure (T quality) 
  {
    return quality == null ? false
			: quality.getClass().equals(Boolean.class) 
			? ((Boolean) quality).booleanValue()
			: quality.getClass().equals(Optional.class) 
			? ((Optional<?>) quality).isPresent() 
			: true;
  }

  
}