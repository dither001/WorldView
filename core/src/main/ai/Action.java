/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.2.5248.dba0a5744 modeling language!*/

package main.ai;

import java.util.*;
import api.ai.*;
import misc.IEntity;

// line 69 "../../ai.ump"
public class Action implements IAction {

	// ------------------------
	// STATIC VARIABLES
	// ------------------------

	/**
	 * 
	 */
	public static final String ATTACK_MELEE = "";
	public static final String ATTACK_RANGED = "";
	public static final String BEG = "";
	public static final String BREED = "";
	public static final String BREAK_BLOCK = "";
	public static final String BREAK_TILE_ENTITY = "";
	public static final String EAT_BLOCK = "";
	public static final String USE_ITEM = "";
	public static final String USE_TILE_ENTITY = "";
	public static final String WAIT = "";

	/**
	 * movement
	 */
	public static final String APPROACH = "";
	public static final String AVOID = "";
	public static final String PATROL = "";
	public static final String RETURN_HOME = "";
	public static final String SEARCH = "";

	/**
	 * 
	 */
	public static final String CLIMB = "";
	public static final String FOLLOW = "";
	public static final String JUMP = "";
	public static final String LURE = "";
	public static final String SWIM = "";
	public static final String WANDER = "";

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Action Attributes
	private IEntity host;
	private List<ICondition> conditions;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public Action(IEntity aHost) {
		host = aHost;
		conditions = new ArrayList<ICondition>();
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public boolean setHost(IEntity aHost) {
		boolean wasSet = false;
		host = aHost;
		wasSet = true;
		return wasSet;
	}

	/* Code from template attribute_SetMany */
	public boolean addCondition(ICondition aCondition) {
		boolean wasAdded = false;
		wasAdded = conditions.add(aCondition);
		return wasAdded;
	}

	public boolean removeCondition(ICondition aCondition) {
		boolean wasRemoved = false;
		wasRemoved = conditions.remove(aCondition);
		return wasRemoved;
	}

	/**
	 * 
	 * targets
	 */
	public IEntity getHost() {
		return host;
	}

	/* Code from template attribute_GetMany */
	public ICondition getCondition(int index) {
		ICondition aCondition = conditions.get(index);
		return aCondition;
	}

	public ICondition[] getConditions() {
		ICondition[] newConditions = conditions.toArray(new ICondition[conditions.size()]);
		return newConditions;
	}

	public int numberOfConditions() {
		int number = conditions.size();
		return number;
	}

	public boolean hasConditions() {
		boolean has = conditions.size() > 0;
		return has;
	}

	public int indexOfCondition(ICondition aCondition) {
		int index = conditions.indexOf(aCondition);
		return index;
	}

	public void delete() {
	}

	@Override
	public boolean canDo() {
		return false;
	}

	@Override
	public boolean isDone() {
		return false;
	}

	@Override
	public float getCost() {
		return 0;
	}

	@Override
	public void reset() {
		return;
	}

	public String toString() {
		return getClass().getSimpleName();
	}

	@Override
	public boolean testConditions() {
		// TODO Auto-generated method stub
		return false;
	}
}