/**
 * @(#) MenuTest.class $version 2017. 01. 08
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.composite;

import java.util.Arrays;
import java.util.List;

/**
 * MenuTest 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class MenuTest {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "breakfast menu");
		MenuComponent dinerMenu = new Menu("ObjectTown menu", "lunch menu");
		MenuComponent cafeMenu = new Menu("cafe menu", "dinner menu");
		MenuComponent dessertMenu = new Menu("dessert menu", "enjoy dessert!!");

		MenuComponent allMenus = new Menu("all menus", "all menus");

		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		dinerMenu.add(new MenuItem("pasta", "pasta with bread", true, 3.89));
		dinerMenu.add(dessertMenu);

		dessertMenu.add(new MenuItem("apple pie", "apple pie with vanilla icecream", true, 1.59));

		Waitress waitress = new Waitress(allMenus);
		waitress.print();
		waitress.printVegetarianMenu();
	}
}