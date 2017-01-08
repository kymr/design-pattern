/**
 * @(#) Waitress.class $version 2017. 01. 08
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.composite;

import java.util.Iterator;
import java.util.List;

/**
 * Waitress 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void print() {
		allMenus.print();
	}

	public void printVegetarianMenu() {
		Iterator iterator = allMenus.createIterator();
		System.out.println("\nVegetarian Menu");

		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();

			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {}
		}
	}
}