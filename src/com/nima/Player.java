package com.nima;

public class Player {
	private String name;
	private Hero[] heroesOwned;
	
	public enum Action {
		ATTACK, CAST_SPELL, SEARCH_TREASURE, SEARCH_SECRET,
		SEARCH_TRAP, DISARM_TRAP
	}

	private Action currentAction;
	private Object currentMovePoints;
	private int points;
}