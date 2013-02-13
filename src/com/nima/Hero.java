package com.nima;

public class Hero {
	public enum HERO_CLASS {
		BARBARIAN, WIZARD, THIEF, RANGER		
	}
	private HERO_CLASS _class;
	
	public enum HERO_RACE {
		HUMAN, ELF, DWARF
	}
	private HERO_RACE race;
	
	private Object attackDice;
	private Object defendDice;
	private Object bodyPoints;
	private Object mindPoints;
	private Weapon weapon;
	private Armour armour;
	private Spell[] spells;	
	private Object gold;
	private Object items;
	
	public enum Rank {
		HERO, CHAMPION, LEGEND
	}	
	private Rank rank;
	private int questsCompleted;
}