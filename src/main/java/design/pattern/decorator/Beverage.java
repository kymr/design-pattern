/**
 * @(#) Beverage.class $version 2016. 11. 28
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.decorator;

/**
 * Beverage 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public abstract class Beverage {
	String description = "none";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}