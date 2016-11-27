/**
 * @(#) Order.class $version 2016. 11. 28
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.decorator;

import java.util.function.Function;

/**
 * Order 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Order {

	static void print(Beverage beverage) {
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		print(beverage);

		beverage = new Mocha(beverage);
		print(beverage);

		beverage = new Whip(beverage);
		print(beverage);
	}
}