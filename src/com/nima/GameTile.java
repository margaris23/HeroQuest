package com.nima;

public class GameTile {
	public enum Type {
		UNUSED, EMPTY, BLOCKED, FURNITURE, TRAP, MONSTER, EXIT, ENTRY;
		public static Type fromChar(char c){
			switch(c){
			case 'u':
				return UNUSED;				
			case 'b':
				return BLOCKED;
			case 'e':
				return EMPTY;
			case 't':
				return TRAP;
			case 'f':
				return FURNITURE;
			case 'm':
				return MONSTER;
			case 'x':
				return EXIT;
			case 'n':
				return ENTRY;
			default:
				return EMPTY;		
			}
		}
	}
	
	public GameTile(char c){
		this.type = Type.fromChar(c);
	}

	private Type type;
	private Object roomId;
	
	public Type getType(){
		return type;
	}
}