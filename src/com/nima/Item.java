package com.nima;

import java.util.List;
import java.util.Map;

public abstract class Item {
	public enum CAN {
		USED_BY, NOT_USED_BY
	}
	private Map<CAN, List<Hero.HERO_CLASS>> abilities;
	private int price;
	private String name;
}
