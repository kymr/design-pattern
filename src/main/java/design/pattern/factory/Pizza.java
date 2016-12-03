/**
 * @(#) Pizza.class $version 2016. 12. 03
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.factory;

/**
 * Pizza 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public abstract class Pizza {
	String name;
	Dough dough;
	Cheese cheese;

	abstract void prepare();

	void bake() {
		System.out.println("bake");
	}

	void cut() {
		System.out.println("cut");
	}

	void box() {
		System.out.println("box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza{" +
				"name='" + name + '\'' +
				'}';
	}
}