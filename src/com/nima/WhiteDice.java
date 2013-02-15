package com.nima;

import java.util.Random;

public class WhiteDice extends Dice {

	public Side roll() {
		int rnd = new Random(System.currentTimeMillis()).nextInt(5) + 1;		
		if (rnd <= 2) {
			return Side.BLACK_SHIELD;
		} else if (rnd <= 5) {
			return Side.SKULL;
		} 
		return Side.ZARGON;
	}

}
