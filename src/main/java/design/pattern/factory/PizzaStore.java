/**
 * @(#) PizzaStore.class $version 2016. 12. 03
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.factory;

/**
 * PizzaStore 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	protected abstract Pizza createPizza(String type);
}