/**
 * @(#) PepperoniPizza.class $version 2016. 12. 04
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.factory;

/**
 * PepperoniPizza 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = pizzaIngredientFactory.createDough();
		cheese = pizzaIngredientFactory.createCheese();
	}
}