/**
 * @(#) Espresso.class $version 2016. 11. 28
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.decorator.functional;

/**
 * Espresso 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Espresso implements Beverage {
	@Override
	public String getDescription() {
		return "espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}