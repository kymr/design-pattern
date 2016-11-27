/**
 * @(#) Mocha.class $version 2016. 11. 28
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.decorator.functional;

/**
 * Mocha 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Mocha extends CondimentDecorator {
	protected Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", mocha";
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}
}