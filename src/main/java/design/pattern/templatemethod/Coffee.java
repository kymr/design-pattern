/**
 * @(#) Coffee.class $version 2017. 01. 01
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.templatemethod;

/**
 * Coffee
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Coffee extends CaffeineBeverage {
	@Override
	void brew() {
		System.out.println("brewing coffee with filter");
	}

	@Override
	void addCondiments() {
		System.out.println("adding sugar");
	}
}