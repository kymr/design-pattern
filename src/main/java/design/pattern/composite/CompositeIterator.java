/**
 * @(#) CompositeIterator.class $version 2017. 01. 09
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * CompositeIterator
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterator> stack = new Stack();

	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	@Override
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();

			if (component instanceof Menu) {
				stack.push(((Menu) component).createIterator());
			}
			return component;
		} else {
			return null;
		}
	}
}