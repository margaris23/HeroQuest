package com.nima;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private Player[] players;	//order matters
	private GameBoard board = new GameBoard();
	private Quest quest;
	private List<Monster> monsters = new ArrayList<Monster>();	
	private int currentTurn = 0;

	public void startQuest(String name, String map, String text, String notes) throws Exception{
		this.quest = new Quest(name, map, text, notes);
		this.board.configure(map.toCharArray());
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
