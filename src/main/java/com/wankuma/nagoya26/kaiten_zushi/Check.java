package com.wankuma.nagoya26.kaiten_zushi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author t_hara
 */
public class Check {
	
	private final PriceList priceList;
	
	/**
	 * @param priceList
	 */
	public Check(PriceList priceList) {
		super();
		this.priceList = priceList;
	}

	private final List<Dish> dishes = new ArrayList<Dish>();
	
	
	/**
	 * @param dish
	 */
	public void addDish(Dish dish) {
		if (!dishes.contains(dish)) {
			dishes.add(dish);
		}
	}

	/**
	 * @return
	 */
	public BigDecimal getSum() {
		
		BigDecimal sum = BigDecimal.ZERO;
		for (Dish dish : this.dishes) {
			DishType dishType = dish.getType();
			BigDecimal place = priceList.getPrice(dishType);
			sum = sum.add(place);
		}
		
		return sum;
	}

}
