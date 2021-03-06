/**
 * @(#) CondimentDecorator.class $version 2016. 11. 28
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.decorator.functional;

/**
 * CondimentDecorator 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public abstract class CondimentDecorator implements Beverage {
	Beverage beverage;

	protected CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
}