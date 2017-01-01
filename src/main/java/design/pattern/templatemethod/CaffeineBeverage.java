/**
 * @(#) CaffeineBeverage.class $version 2017. 01. 01
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.templatemethod;

/**
 * CaffeineBeverage 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public abstract class CaffeineBeverage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	abstract void brew();
	abstract void addCondiments();

	void boilWater() {
		System.out.println("boiling water..");
	}

	void pourInCup() {
		System.out.println("pouring in cup");
	}
}