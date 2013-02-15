package com.nima;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private List<Hero> heroesOwned = new ArrayList<Hero>();
	
	public enum Action {
		ATTACK, CAST_SPELL, SEARCH_TREASURE, SEARCH_SECRET,
		SEARCH_TRAP, DISARM_TRAP, NONE
	}

	private Action currentAction = Action.NONE;
	private Object currentMovePoints = 0;
	private int rankPoints = 0;
	
	public Player(String name){	
		this.name = name;
	}
	
	public Action getCurrentAction() {
		return currentAction;
	}

	public Object getCurrentMovePoints() {
		return currentMovePoints;
	}

	public int getRankPoints() {
		return rankPoints;
	}
	
	public String getName(){
		return name;
	}
}