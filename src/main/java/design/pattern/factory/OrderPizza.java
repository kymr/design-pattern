/**
 * @(#) OrderPizza.class $version 2016. 12. 04
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.factory;

/**
 * OrderPizza 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class OrderPizza {
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

		System.out.println(nyPizzaStore.orderPizza("cheese"));
		System.out.println(chicagoPizzaStore.orderPizza("pepperoni"));

	}
}