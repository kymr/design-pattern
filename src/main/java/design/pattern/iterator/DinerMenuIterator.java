/**
 * @(#) DinerMenuIterator.class $version 2017. 01. 08
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.iterator;

import java.util.Iterator;

/**
 * DinerMenuIterator 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (items.length <= position || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position += 1;
		return menuItem;
	}
}