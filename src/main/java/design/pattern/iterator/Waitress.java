/**
 * @(#) Waitress.class $version 2017. 01. 08
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Waitress 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Waitress {
	List<Menu> menus;

	public Waitress(List<Menu> menus) {
		this.menus = menus;
	}

	public void printMenu() {
		System.out.println("Menus : ");

		menus.forEach(menu -> {
			System.out.println("===");
			printMenu(menu.createIterator());
		});
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}