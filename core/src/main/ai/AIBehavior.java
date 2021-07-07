/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package main.ai;
import java.util.function.*;

// line 25 "../../ai.ump"
public class AIBehavior
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AIBehavior Attributes
  private Predicate calm;
  private Predicate provoke;
  private Predicate startle;
  private IEvent trigger;

  //AIBehavior State Machines
  public enum Activity { Waiting, Moving, Resting, Working, Playing }
  private Activity activity;
  public enum Emotion { Bored, Afraid, Alert, Angry }
  private Emotion emotion;
  public enum Agency { Idle, MoveTo, PerformAction }
  private Agency agency;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AIBehavior(Predicate aCalm, Predicate aProvoke, Predicate aStartle, IEvent aTrigger)
  {
    calm = aCalm;
    provoke = aProvoke;
    startle = aStartle;
    trigger = aTrigger;
    setActivity(Activity.Waiting);
    setEmotion(Emotion.Bored);
    setAgency(Agency.Idle);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCalm(Predicate aCalm)
  {
    boolean wasSet = false;
    calm = aCalm;
    wasSet = true;
    return wasSet;
  }

  public boolean setProvoke(Predicate aProvoke)
  {
    boolean wasSet = false;
    provoke = aProvoke;
    wasSet = true;
    return wasSet;
  }

  public boolean setStartle(Predicate aStartle)
  {
    boolean wasSet = false;
    startle = aStartle;
    wasSet = true;
    return wasSet;
  }

  public boolean setTrigger(IEvent aTrigger)
  {
    boolean wasSet = false;
    trigger = aTrigger;
    wasSet = true;
    // line 34 "../../ai.ump"
    testEmotion();
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public Predicate getCalm()
  {
    return calm;
  }

  public Predicate getProvoke()
  {
    return provoke;
  }

  public Predicate getStartle()
  {
    return startle;
  }

  public IEvent getTrigger()
  {
    return trigger;
  }

  public String getActivityFullName()
  {
    String answer = activity.toString();
    return answer;
  }

  public String getEmotionFullName()
  {
    String answer = emotion.toString();
    return answer;
  }

  public String getAgencyFullName()
  {
    String answer = agency.toString();
    return answer;
  }

  public Activity getActivity()
  {
    return activity;
  }

  public Emotion getEmotion()
  {
    return emotion;
  }

  public Agency getAgency()
  {
    return agency;
  }

  public boolean testEmotion()
  {
    boolean wasEventProcessed = false;
    
    Emotion aEmotion = emotion;
    switch (aEmotion)
    {
      case Bored:
        if (getProvoke().test(getTrigger())||getStartle().test(getTrigger()))
        {
          setEmotion(Emotion.Alert);
          wasEventProcessed = true;
          break;
        }
        break;
      case Afraid:
        if (getProvoke().test(getTrigger()))
        {
          setEmotion(Emotion.Alert);
          wasEventProcessed = true;
          break;
        }
        break;
      case Alert:
        if (getProvoke().test(getTrigger()))
        {
          setEmotion(Emotion.Angry);
          wasEventProcessed = true;
          break;
        }
        if (getStartle().test(getTrigger()))
        {
          setEmotion(Emotion.Afraid);
          wasEventProcessed = true;
          break;
        }
        break;
      case Angry:
        if (getStartle().test(getTrigger()))
        {
          setEmotion(Emotion.Alert);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean setActivity(Activity aActivity)
  {
    activity = aActivity;
    return true;
  }

  private void setEmotion(Emotion aEmotion)
  {
    emotion = aEmotion;
  }

  public boolean setAgency(Agency aAgency)
  {
    agency = aAgency;
    return true;
  }

  public void delete()
  {}

  // line 36 "../../ai.ump"
  public void testEmotion(){
    
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "calm" + "=" + (getCalm() != null ? !getCalm().equals(this)  ? getCalm().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "provoke" + "=" + (getProvoke() != null ? !getProvoke().equals(this)  ? getProvoke().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "startle" + "=" + (getStartle() != null ? !getStartle().equals(this)  ? getStartle().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "trigger" + "=" + (getTrigger() != null ? !getTrigger().equals(this)  ? getTrigger().toString().replaceAll("  ","    ") : "this" : "null");
  }
}