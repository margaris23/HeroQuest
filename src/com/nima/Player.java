package com.nima;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Player {
	private String name;
	private List<Hero> heroesOwned = new ArrayList<Hero>();
	private int gold;
	
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
	
	public Player(Properties props){
		this.name = props.getProperty("name");
		this.gold = Integer.valueOf(props.getProperty("gold"));
		int heroes = Integer.valueOf(props.getProperty("heroes"));
		while(heroes > 0){			
			this.heroesOwned.add(new Hero("hero." + String.valueOf(heroes--) + ".", props));
		}
	}
	
	public void addHero(Hero hero){
		if(hero == null) return;
		heroesOwned.add(hero);
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
	
	public int wealth(){
		return gold;
	}
	
	public void earnGold(int earnings){
		if(earnings < 0) return;
		this.gold += earnings;
	}
	
	public void loseGold(int loss){
		if(loss < 0) return;
		this.gold -= loss;
	}
}