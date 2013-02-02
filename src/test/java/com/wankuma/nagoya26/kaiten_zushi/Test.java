package com.wankuma.nagoya26.kaiten_zushi;

import java.math.BigDecimal;

import com.wankuma.nagoya26.kaiten_zushi.Check;
import com.wankuma.nagoya26.kaiten_zushi.DishFactory;
import com.wankuma.nagoya26.kaiten_zushi.DishService;
import com.wankuma.nagoya26.kaiten_zushi.DishType;
import com.wankuma.nagoya26.kaiten_zushi.PriceList;

/**
 * @author t_hara
 */
public class Test {

	public static void main(String[] args) {
		
		DishService dishService = new DishService();
		
		PriceList priceList = new PriceList();
		priceList.putPrice(DishType.LOW, new BigDecimal("100"));
		priceList.putPrice(DishType.MIDDIUM, new BigDecimal("200"));
		priceList.putPrice(DishType.HIGH, new BigDecimal("300"));
		
		DishFactory dishFactory = new DishFactory(dishService);
		
		// 以下はバーコードリーダで呼ばれる
		
		Check check = new Check(priceList);
		check.addDish(dishFactory.createDish("L000"));
		check.addDish(dishFactory.createDish("L001"));
		check.addDish(dishFactory.createDish("L001"));
		
		BigDecimal sum = check.getSum();
		System.out.println("expect: 200, actual:" + sum);
		
		check.addDish(dishFactory.createDish("L001"));
		check.addDish(dishFactory.createDish("M001"));
		check.addDish(dishFactory.createDish("M002"));
		
		sum = check.getSum();
		System.out.println("expect: 600, actual:" + sum);
	}
}
