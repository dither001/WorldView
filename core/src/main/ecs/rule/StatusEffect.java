/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package main.ecs.rule;
import api.ecs.rule.*;

// line 11 "../../../ecs_rule.ump"
public class StatusEffect implements IStatusEffect
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String BENEFICIAL = "beneficial";
  public static final String HARMFUL = "harmful";
  public static final String NEUTRAL = "neutral";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StatusEffect Attributes
  private boolean isInstantaneous;
  private boolean isDuration;
  private boolean isBeneficial;
  private boolean isHarmful;
  private String id;
  private String displayName;
  private String description;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StatusEffect(boolean aIsInstantaneous, boolean aIsDuration, boolean aIsBeneficial, boolean aIsHarmful, String aId, String aDisplayName, String aDescription)
  {
    isInstantaneous = aIsInstantaneous;
    isDuration = aIsDuration;
    isBeneficial = aIsBeneficial;
    isHarmful = aIsHarmful;
    id = aId;
    displayName = aDisplayName;
    description = aDescription;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsInstantaneous(boolean aIsInstantaneous)
  {
    boolean wasSet = false;
    isInstantaneous = aIsInstantaneous;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsDuration(boolean aIsDuration)
  {
    boolean wasSet = false;
    isDuration = aIsDuration;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsBeneficial(boolean aIsBeneficial)
  {
    boolean wasSet = false;
    isBeneficial = aIsBeneficial;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsHarmful(boolean aIsHarmful)
  {
    boolean wasSet = false;
    isHarmful = aIsHarmful;
    wasSet = true;
    return wasSet;
  }

  public boolean setId(String aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public boolean setDisplayName(String aDisplayName)
  {
    boolean wasSet = false;
    displayName = aDisplayName;
    wasSet = true;
    return wasSet;
  }

  public boolean setDescription(String aDescription)
  {
    boolean wasSet = false;
    description = aDescription;
    wasSet = true;
    return wasSet;
  }

  public boolean getIsInstantaneous()
  {
    return isInstantaneous;
  }

  public boolean getIsDuration()
  {
    return isDuration;
  }

  public boolean getIsBeneficial()
  {
    return isBeneficial;
  }

  public boolean getIsHarmful()
  {
    return isHarmful;
  }

  public String getId()
  {
    return id;
  }

  public String getDisplayName()
  {
    return displayName;
  }

  public String getDescription()
  {
    return description;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "isInstantaneous" + ":" + getIsInstantaneous()+ "," +
            "isDuration" + ":" + getIsDuration()+ "," +
            "isBeneficial" + ":" + getIsBeneficial()+ "," +
            "isHarmful" + ":" + getIsHarmful()+ "," +
            "id" + ":" + getId()+ "," +
            "displayName" + ":" + getDisplayName()+ "," +
            "description" + ":" + getDescription()+ "]";
  }
}