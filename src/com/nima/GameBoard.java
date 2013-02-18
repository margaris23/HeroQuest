package com.nima;

public class GameBoard {
	public static final int HMAX = 26;
	public static final int VMAX = 19;
	
	private GameTile[][] tiles = new GameTile[VMAX][HMAX];
	
	public void configure(char[] bitmap) throws Exception{
		if(bitmap.length > VMAX * HMAX){
			throw new Exception();
		}
		int row = 0, col = 0;		
		for (char c : bitmap) {
			this.tiles[row][col++] = new GameTile(c);
			if(col == HMAX){
				col = 0;
				++row;				
			}
		}
	}
	
	public String export(){
		StringBuilder sb = new StringBuilder();
		
		return sb.toString();
	}
	
}