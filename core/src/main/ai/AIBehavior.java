/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package main.ai;

import java.util.function.*;

// line 29 "../../ai.ump"
public class AIBehavior {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// AIBehavior Attributes
	private Predicate<IEvent> calm;
	private Predicate<IEvent> provoke;
	private Predicate<IEvent> startle;
	private IEvent trigger;

	// AIBehavior State Machines
	public enum Activity {
		Waiting, Moving, Resting, Working, Playing
	}

	private Activity activity;

	public enum Emotion {
		Bored, Afraid, Alert, Angry
	}

	private Emotion emotion;

	public enum Agency {
		Idle, MoveTo, PerformAction
	}

	private Agency agency;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public AIBehavior(Predicate<IEvent> aCalm, Predicate<IEvent> aProvoke, Predicate<IEvent> aStartle,
			IEvent aTrigger) {
		calm = aCalm;
		provoke = aProvoke;
		startle = aStartle;
		trigger = aTrigger;
		setActivity(Activity.Waiting);
		setEmotion(Emotion.Bored);
		setAgency(Agency.Idle);
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public boolean setCalm(Predicate<IEvent> aCalm) {
		boolean wasSet = false;
		calm = aCalm;
		wasSet = true;
		return wasSet;
	}

	public boolean setProvoke(Predicate<IEvent> aProvoke) {
		boolean wasSet = false;
		provoke = aProvoke;
		wasSet = true;
		return wasSet;
	}

	public boolean setStartle(Predicate<IEvent> aStartle) {
		boolean wasSet = false;
		startle = aStartle;
		wasSet = true;
		return wasSet;
	}

	public boolean setTrigger(IEvent aTrigger) {
		boolean wasSet = false;
		trigger = aTrigger;
		wasSet = true;
		// line 38 "../../ai.ump"
		testEmotion();
		// END OF UMPLE AFTER INJECTION
		return wasSet;
	}

	public Predicate<IEvent> getCalm() {
		return calm;
	}

	public Predicate<IEvent> getProvoke() {
		return provoke;
	}

	public Predicate<IEvent> getStartle() {
		return startle;
	}

	public IEvent getTrigger() {
		return trigger;
	}

	public String getActivityFullName() {
		String answer = activity.toString();
		return answer;
	}

	public String getEmotionFullName() {
		String answer = emotion.toString();
		return answer;
	}

	public String getAgencyFullName() {
		String answer = agency.toString();
		return answer;
	}

	public Activity getActivity() {
		return activity;
	}

	public Emotion getEmotion() {
		return emotion;
	}

	public Agency getAgency() {
		return agency;
	}

	public boolean testEmotion() {
		boolean wasEventProcessed = false;

		Emotion aEmotion = emotion;
		switch (aEmotion) {
		case Bored:
			if (getProvoke().test(getTrigger()) || getStartle().test(getTrigger())) {
				setEmotion(Emotion.Alert);
				wasEventProcessed = true;
				break;
			}
			break;
		case Afraid:
			if (getProvoke().test(getTrigger())) {
				setEmotion(Emotion.Alert);
				wasEventProcessed = true;
				break;
			}
			break;
		case Alert:
			if (getProvoke().test(getTrigger())) {
				setEmotion(Emotion.Angry);
				wasEventProcessed = true;
				break;
			}
			if (getStartle().test(getTrigger())) {
				setEmotion(Emotion.Afraid);
				wasEventProcessed = true;
				break;
			}
			break;
		case Angry:
			if (getStartle().test(getTrigger())) {
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

	public boolean setActivity(Activity aActivity) {
		activity = aActivity;
		return true;
	}

	private void setEmotion(Emotion aEmotion) {
		emotion = aEmotion;
	}

	public boolean setAgency(Agency aAgency) {
		agency = aAgency;
		return true;
	}

	public void delete() {
	}

	@Override
	// line 70 "../../ai.ump"
	public String toString() {
		return getClass().getSimpleName();
	}

}