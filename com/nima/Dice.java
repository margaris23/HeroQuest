package com.nima;

public abstract class Dice {
	public enum Side {
		BLACK_SHIELD, SKULL, ZARGON
	}

	public abstract Side roll();
}