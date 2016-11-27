/**
 * @(#) Beverage.class $version 2016. 11. 28
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.decorator.functional;

/**
 * Beverage 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public interface Beverage {
	public abstract String getDescription();
	public abstract double cost();
}
