/**
 * @(#) ChicagoPizzaIngredientFactory.class $version 2016. 12. 04
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.factory;

/**
 * ChicagoPizzaIngredientFactory 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}
}