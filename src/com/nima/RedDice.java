package com.nima;

import java.util.Random;

public class RedDice extends Dice {
	
	public Side roll() {
		int rnd = new Random().nextInt(5) + 1;
		System.out.println(rnd);
		if (rnd < 3) {
			return Side.BLACK_SHIELD;
		} else if (rnd < 5) {
			return Side.SKULL;
		} 
		return Side.ZARGON;
	}
}