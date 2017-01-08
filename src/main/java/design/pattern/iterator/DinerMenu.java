/**
 * @(#) DinerMenu.class $version 2017. 01. 08
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.iterator;

import java.util.Iterator;

/**
 * DinerMenu 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Vegetarian BLT",
				"Vegetarian BLT", true, 2.99);
		addItem("BLT",
				"BLT", false, 2.99);
		addItem("Today's soup",
				"Soup with potato salad", false, 3.29);
		addItem("Hotdog",
				"Hotdog with cheese", false, 3.29);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

		if (MAX_ITEMS <= numberOfItems) {
			System.out.println("Sorry, menu is full. It cannot add new item");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems += 1;
		}
	}

	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}