package com.nima;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Game {
	private Player[] players;	//order matters
	private GameBoard board = new GameBoard();
	private Quest quest;
	private List<Monster> monsters = new ArrayList<Monster>();	
	private int currentTurn = 0;
	private int maxNumberOfHeroes;
	
	public Game(int numberOfPlayers){
		this.players = new Player[numberOfPlayers];
	}
	
	public void startQuest(Properties questProps) throws Exception{		
		this.quest = new Quest(questProps.getProperty("name"), questProps.getProperty("map"),
				questProps.getProperty("text"), questProps.getProperty("notes"));
		this.board.configure(questProps.getProperty("map").toCharArray());
		this.maxNumberOfHeroes = Integer.valueOf(questProps.getProperty("max_heroes"));
	}
	
	public int getMaxNumberOfHeroes(){
		return maxNumberOfHeroes;
	}
	public void begin(){		
	}
	
	public void end(){		
	}
	
	public Pawn whoIsNext(){
		return null;
	}

	public void createPlayers(){
		//commit from android
	}
}
