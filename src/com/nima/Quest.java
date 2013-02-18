package com.nima;

public class Quest {
	private static String text;
	private static String map;
	private static String notes;
	private static String name;
	
	public Quest(String name, String map, String text, String notes){
		this.name = name;
		this.map = map;
		this.text = text;
		this.notes = notes;
	}
	
	public static String getText() {
		return text;
	}

	public static String getMap() {
		return map;
	}

	public static String getNotes() {
		return notes;
	}

	public static String getName() {
		return name;
	}			
}