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
	
	public abstract boolean move(int movePoints);
	public abstract boolean attack(Pawn other);
	
	public STATE getCurrentState(){
		return currentState;
	}
	public String getName(){
		return name;
	}
	public int getMovePoints() {
		return movePoints;
	}
	public void setMovePoints(int movePoints) {
		this.movePoints = movePoints;
	}
	public int getAttackDice() {
		return attackDice;
	}
	public void setAttackDice(int attackDice) {
		this.attackDice = attackDice;
	}
	public int getDefendDice() {
		return defendDice;
	}
	public void setDefendDice(int defendDice) {
		this.defendDice = defendDice;
	}
	public int getBodyPoints() {
		return bodyPoints;
	}
	public void setBodyPoints(int bodyPoints) {
		this.bodyPoints = bodyPoints;
	}
	public int getMindPoints() {
		return mindPoints;
	}
	public void setMindPoints(int mindPoints) {
		this.mindPoints = mindPoints;
	}
	public void setCurrentState(STATE currentState) {
		this.currentState = currentState;
	}
	public void setName(String name) {
		this.name = name;
	}
}
