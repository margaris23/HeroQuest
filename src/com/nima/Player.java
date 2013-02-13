package com.nima;

public class Player {
	private String name;
	private Hero hero;
	private Object gold;
	private Object questsCompleted;
	private Object items;

	public enum Action {
		ATTACK, CAST_SPELL, SEARCH_TREASURE, SEARCH_SECRET,
		SEARCH_TRAP, DISARM_TRAP
	}

	private Action currentAction;

	private Object currentMovePoints;
}