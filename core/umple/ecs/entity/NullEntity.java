/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package ecs.entity;

// line 20 "../../ecs_entity.ump"
public class NullEntity implements IEntity
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static NullEntity theInstance = null;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  private NullEntity()
  {}

  public static NullEntity getInstance()
  {
    if(theInstance == null)
    {
      theInstance = new NullEntity();
    }
    return theInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * 
   * 
   * 
   */
  @Override
  public UUID getId(){
          return null;
  }


  /**
   * 
   * 
   * 
   */
  @Override
  public boolean isActive(){
          return false;
  }


  /**
   * 
   * 
   * 
   */
  @Override
  public boolean isPersistent(){
          return false;
  }

  @Override
  public boolean addComponent(IComponent aComponent){
          return false;
  }

  @Override
  public boolean removeComponent(IComponent aComponent){
          return false;
  }

  @Override
  public IComponent getComponent(int index){
          return null;
  }

  @Override
  public IComponent[] getComponents(){
          return null;
  }

  @Override
  public int numberOfComponents(){
          return 0;
  }

  @Override
  public boolean hasComponents(){
          return false;
  }

  @Override
  public int indexOfComponent(IComponent aComponent){
          return 0;
  }

}