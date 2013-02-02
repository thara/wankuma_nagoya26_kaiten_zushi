package com.wankuma.nagoya26.kaiten_zushi;

/**
 * @author t_hara
 */
public class DishService {

	public DishType lookupType(String id) {
		if (id.startsWith("L")) return DishType.LOW;
		if (id.startsWith("M")) return DishType.MIDDIUM;
		if (id.startsWith("H")) return DishType.HIGH;
		throw new IllegalArgumentException("type unmatch");
	}
}
