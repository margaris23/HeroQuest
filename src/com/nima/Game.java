package com.nima;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private Player[] players;	//order matters
	private GameBoard board;
	private List<Monster> monsters = new ArrayList<Monster>();	
	private int currentTurn = 0;

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
