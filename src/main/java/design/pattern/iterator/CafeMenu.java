/**
 * @(#) CafeMenu.class $version 2017. 01. 08
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * CafeMenu 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class CafeMenu implements Menu {
	Hashtable<String, MenuItem> menuItems = new Hashtable<>();

	public CafeMenu() {
		addItem("Burger & Fries",
				"Burger & potato fries", true, 3.99);
		addItem("Today's soup",
				"Soup with salad", false, 3.69);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}
}