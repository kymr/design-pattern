/**
 * @(#) NYPizzaStore.class $version 2016. 12. 03
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.factory;

/**
 * NYPizzaStore 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class NYPizzaStore extends PizzaStore {
	@Override
	protected Pizza createPizza(String type) {
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("NY-Cheese-Pizza");
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza(pizzaIngredientFactory);
			pizza.setName("NY-Pepperoni-Pizza");
		}

		return pizza;
	}
}