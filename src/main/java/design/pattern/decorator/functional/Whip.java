/**
 * @(#) Whip.class $version 2016. 11. 28
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.decorator.functional;

/**
 * Whip 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Whip extends CondimentDecorator {
	protected Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", whip";
	}

	@Override
	public double cost() {
		return 0.3 + beverage.cost();
	}
}