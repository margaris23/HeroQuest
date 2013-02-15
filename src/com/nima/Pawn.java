package com.nima;

public abstract class Pawn {
	public enum STATE {
		GOOD, DEAD, CURSED, PETRIFIED
	}
	private STATE currentState;
	
	protected String name;
	protected int movePoints;
	protected int attackDice;
	protected int defendDice;
	protected int bodyPoints;
	protected int mindPoints;
	
	public abstract void move(int movePoints);
	public abstract void attack(Pawn other);
}
