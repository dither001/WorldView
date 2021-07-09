package main.ai;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import api.ai.IAction;
import api.ai.IGoal;

public class ActionPlanner {

	static int MAX_ACTIONS = 64;
	static int MAX_ATOMS = 64;

	List<IAction> list = new ArrayList<IAction>();

	int numberOfActions() {
		return -1;
	}

	List<IAction> plan(IActor actor, Set<IAction> availableActions, IWorldState worldState, Set<IGoal> goals) {

		// FIXME (needed?) reset actions for fresh start
		availableActions.parallelStream().forEach(IAction::reset);

		// check what actions can run using their testConditions
		Set<IAction> usableActions = Sets.newHashSet();
		usableActions.stream().filter(IAction::testConditions).forEach(usableActions::add);

		List<Node> leaves = Lists.newArrayList();

		return null;
	}

	private class Node {
		public Node parent;
		public float runningCost;
		public IWorldState state;
		public IAction action;

		public Node(Node parent, float runningCost, IWorldState state, IAction action) {
			this.parent = parent;
			this.runningCost = runningCost;
			this.state = state;
			this.action = action;
		}
	}
}
