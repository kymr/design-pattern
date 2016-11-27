/**
 * @(#) Order.class $version 2016. 11. 28
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.decorator.functional;

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
		Beverage newOrderedBeverage = DecoratingBeverage.from(new Espresso())
				.decorate(beverage -> new Mocha(beverage))
				.decorate(beverage -> new Whip(beverage));

		print(newOrderedBeverage);
	}
}