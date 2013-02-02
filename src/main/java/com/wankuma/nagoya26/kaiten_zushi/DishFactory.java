package com.wankuma.nagoya26.kaiten_zushi;

/**
 * @author t_hara
 */
public class DishFactory {

	private DishService dishService;

	/**
	 * @param dishService
	 */
	public DishFactory(DishService dishService) {
		super();
		this.dishService = dishService;
	}
	
	public Dish createDish(String id) {
		DishType type = dishService.lookupType(id);
		return new Dish(id, type);
	}
}
