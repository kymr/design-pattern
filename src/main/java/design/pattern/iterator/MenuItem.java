/**
 * @(#) MenuItem.class $version 2017. 01. 08
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.iterator;

/**
 * MenuItem 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class MenuItem {
	String name;
	String description;
	boolean vegetarian;
	double price;

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "MenuItem{" +
				"name='" + name + '\'' +
				", description='" + description + '\'' +
				", vegetarian=" + vegetarian +
				", price=" + price +
				'}';
	}
}