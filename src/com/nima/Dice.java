package com.nima;


public abstract class Dice {
	public enum Side {
		ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6),
		BLACK_SHIELD(7), SKULL(8), ZARGON(9);
		
		private final int num;
		Side(int num){
			this.num = num;
		}
		
		public int number(){
			return num;
		}		
	}

	public abstract Side roll();
}