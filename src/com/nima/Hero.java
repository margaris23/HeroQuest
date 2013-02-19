package com.nima;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Hero extends Pawn {
	
	public enum HERO_CLASS {
		BARBARIAN, WIZARD, THIEF, RANGER;
		public static HERO_CLASS fromChar(char c){
			switch(c){
			case 'B':
				return BARBARIAN;
			case 'W':
				return WIZARD;
			case 'T':
				return THIEF;
			case 'R':
				return RANGER;
			default:
					return BARBARIAN;
			}
		}
	}
	private HERO_CLASS _class;
	
	public enum HERO_RACE {
		HUMAN, ELF, DWARF;
		public static HERO_RACE fromChar(char c){
			switch(c){
			case 'H':
				return HUMAN;
			case 'E':
				return ELF;
			case 'D':
				return DWARF;
			default:
					return HUMAN;
			}
		}
	}
	private HERO_RACE race;

	private Weapon weapon;
	private List<Armour> armour = new ArrayList<Armour>();
	private List<Spell> spells = new ArrayList<Spell>();
	private List<Item> items = new ArrayList<Item>();
	
	public enum RANK {
		HERO, CHAMPION, LEGEND;
		public static RANK fromChar(char c){
			switch(c){
			case 'H':
				return HERO;
			case 'C':
				return CHAMPION;
			case 'L':
				return LEGEND;
			default:
				return HERO;
			}
		}
	}	
	private RANK rank = RANK.HERO;
	private int questsCompleted = 0;

	public Hero(String key, Properties props){
		this.name = props.getProperty(key + "name");
		this.race = HERO_RACE.fromChar(props.getProperty(key + "race").charAt(0));
		this._class = HERO_CLASS.fromChar(props.getProperty(key + "name").charAt(0));
		
		setAttributes(key, props);
	}
	
	public Hero(String name, HERO_RACE heroRace, HERO_CLASS heroClass){
		this.name = name;
		this.race = heroRace;
		this._class = heroClass;
	}
	
	public void setAttributes(String key, Properties props){
		this.bodyPoints = Integer.valueOf(props.getProperty(key + "base_body"));
		this.mindPoints = Integer.valueOf(props.getProperty(key + "base_mind"));
		this.attackDice = Integer.valueOf(props.getProperty(key + "base_attack"));
		this.defendDice = Integer.valueOf(props.getProperty(key + "base_defend"));
		this.moveDice = Integer.valueOf(props.getProperty(key + "base_move"));
	}
	
	public boolean move(int movePoints) {
		return false;
	}

	public boolean attack(Pawn other) {
		return false;
	}	

	public HERO_CLASS get_class() {
		return _class;
	}

	public HERO_RACE getRace() {
		return race;
	}

	public RANK getRank() {
		return rank;
	}

	public int getQuestsCompleted() {
		return questsCompleted;
	}
	
}