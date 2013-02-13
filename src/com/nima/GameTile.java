package com.nima;

public class GameTile {
	public enum Type {
		UNUSED, SIMPLE, BLOCKED, FURNITURE
	}

	private Type type;
	private Object roomId;
}