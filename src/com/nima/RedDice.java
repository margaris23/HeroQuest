package com.nima;

import java.util.Random;

public class RedDice extends Dice {

	public Side roll() {
		int rnd = new Random().nextInt(5) + 1;
		
		if(rnd == 1) {
			return Side.ONE;
		}else if(rnd == 1) {
			return Side.TWO;
		}else if(rnd == 1) {
			return Side.THREE;
		}else if(rnd == 1) {
			return Side.FOUR;
		}else if(rnd == 1) {
			return Side.FIVE;
		}
		
		return Side.SIX;		
	}
}