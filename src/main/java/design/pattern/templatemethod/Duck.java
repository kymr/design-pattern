/**
 * @(#) Duck.class $version 2017. 01. 01
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.templatemethod;

/**
 * Duck 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Duck {
	String name;
	int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Duck{" +
				"name='" + name + '\'' +
				", weight=" + weight +
				'}';
	}
}