/**
 * @(#) ChicagoPizzaStore.class $version 2016. 12. 03
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.factory;

/**
 * ChicagoPizzaStore 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class ChicagoPizzaStore extends PizzaStore {
	@Override
	protected Pizza createPizza(String type) {
		PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("Chicago-Cheese-Pizza");
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza(pizzaIngredientFactory);
			pizza.setName("Chicago-Pepperoni-Pizza");
		}

		return pizza;
	}
}