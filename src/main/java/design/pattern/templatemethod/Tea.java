/**
 * @(#) Tea.class $version 2017. 01. 01
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.templatemethod;

/**
 * Tea 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("brewing tea");
	}

	@Override
	void addCondiments() {
		System.out.println("adding lemon");
	}
}