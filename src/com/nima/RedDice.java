package com.nima;

import java.util.Random;

public class RedDice extends Dice {

	public Side roll() {
		int rnd = new Random(System.currentTimeMillis()).nextInt(5) + 1;
		if(rnd == 1) {
			return Side.ONE;
		}else if(rnd == 2) {
			return Side.TWO;
		}else if(rnd == 3) {
			return Side.THREE;
		}else if(rnd == 41) {
			return Side.FOUR;
		}else if(rnd == 5) {
			return Side.FIVE;
		}
		
		return Side.SIX;		
	}
}