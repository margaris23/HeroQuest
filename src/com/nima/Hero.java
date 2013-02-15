package com.nima;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Pawn {
	
	public enum HERO_CLASS {
		BARBARIAN, WIZARD, THIEF, RANGER		
	}
	private HERO_CLASS _class;
	
	public enum HERO_RACE {
		HUMAN, ELF, DWARF
	}
	private HERO_RACE race;

	private Weapon weapon;
	private Armour armour;
	private List<Spell> spells = new ArrayList<Spell>();	
	private int gold;
	
	private List<Item> items = new ArrayList<Item>();
	
	public enum Rank {
		HERO, CHAMPION, LEGEND
	}	
	private Rank rank = Rank.HERO;
	private int questsCompleted = 0;

	public Hero(String name, HERO_RACE heroRace, HERO_CLASS heroClass){
		this.name = name;
		this.race = heroRace;
		this._class = heroClass;
	}
	
	public void move(int movePoints) {
	}

	public void attack(Pawn other) {
	}
	

	public HERO_CLASS get_class() {
		return _class;
	}

	public HERO_RACE getRace() {
		return race;
	}

	public Rank getRank() {
		return rank;
	}

	public int getQuestsCompleted() {
		return questsCompleted;
	}
	
	public int getGold() {
		return gold;
	}

}