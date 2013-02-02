package com.wankuma.nagoya26.kaiten_zushi;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author t_hara
 */
public class PriceList {
	
	private final Map<DishType, BigDecimal> prices = new HashMap<DishType, BigDecimal>();
	
	public void putPrice(DishType dishType, BigDecimal price) {
		this.prices.put(dishType, price);
	}
	
	public BigDecimal getPrice(DishType dishType) {
		return prices.get(dishType);
	}
}
