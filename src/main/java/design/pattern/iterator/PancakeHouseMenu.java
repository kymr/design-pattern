/**
 * @(#) PancakeHouseMenu.class $version 2017. 01. 08
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * PancakeHouseMenu 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<>();

		addItem("K&B Pancake set",
				"scrambled egg & toast pancake", true, 2.99);
		addItem("Blueberry Pancake",
				"Blueberry Pancake", true, 3.49);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		menuItems.add(
				new MenuItem(name, description, vegetarian, price)
		);
	}

	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
}