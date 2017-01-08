/**
 * @(#) MenuTest.class $version 2017. 01. 08
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.iterator;

import java.util.Arrays;
import java.util.List;

/**
 * MenuTest 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class MenuTest {
	public static void main(String[] args) {
		List<Menu> menus = Arrays.asList(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
		Waitress waitress = new Waitress(menus);

		waitress.printMenu();
	}
}