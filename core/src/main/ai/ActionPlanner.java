package main.ai;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import api.ai.IAction;
import api.ai.ICondition;
import api.ai.IGoal;
import util.Util;

public class ActionPlanner {

	static int MAX_ACTIONS = 64;
	static int MAX_ATOMS = 64;

	List<IAction> list = new ArrayList<IAction>();

	int numberOfActions() {
		return -1;
	}

	public <K, V> List<IAction> plan(IActor actor, Set<IAction> available, Set<Entry<String, V>> state, Set<IGoal> goals) {
		Util util = Util.getInstance();

		// FIXME (needed?) reset actions for fresh start
		available.stream().forEach(IAction::reset);

		// check what actions can run using their testConditions
		Set<IAction> viable = Sets.newHashSet();
		viable.stream().filter(IAction::testConditions).forEach(viable::add);

		List<Node> leaves = Lists.newArrayList();

		// build graph
		Node start = new Node(null, 0, state, null);
		boolean success = buildGraph(start, leaves, viable, goals);

		if (!success) {
			return null; // failed to find plan
		}

		Node cheapest = null;
		for (Node leaf : leaves) {
			cheapest = util.ensure(cheapest) ? leaf.runningCost < cheapest.runningCost ? leaf : cheapest : leaf;
		}

		List<IAction> queue = Lists.newArrayList();
		Node n = cheapest;
		while (util.ensure(n)) {
			if (util.ensure(n)) {
				queue.add(0, n.action);
			}
			n = n.parent;
		}

		return queue;
	}

	private boolean buildGraph(Node parent, List<Node> leaves, Set<IAction> usable, Set<IGoal> goals) {
		boolean foundOne = false;
		
//		usable.stream().filter(a -> testState(a.getConditions(), state))
		
		
		
		return foundOne;
	}
	
	private boolean testState(ICondition[] conditions, IWorldState state) {
		// TODO
		return false;
	}

	private class Node {
		public Node parent;
		public float runningCost;
		public Set<Entry<K, V>> state;
		public IAction action;

		public Node(Node parent, float runningCost, Set<Entry<K, V>> state, IAction action) {
			this.parent = parent;
			this.runningCost = runningCost;
			this.state = state;
			this.action = action;
		}
	}
}
