/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package util;


// line 2 "playground.ump"
public class Math
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Math()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 5 "playground.ump"
  public double clamp(double val, double min, double max){
    return val = val > max ? max : val < min ? min : val;
  }

  // line 9 "playground.ump"
  public float clamp(float val, float min, float max){
    return val = val > max ? max : val < min ? min : val;
  }

  // line 13 "playground.ump"
  public int clamp(int val, int min, int max){
    return val = val > max ? max : val < min ? min : val;
  }

}