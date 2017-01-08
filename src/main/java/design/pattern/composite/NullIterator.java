/**
 * @(#) NullIterator.class $version 2017. 01. 09
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.composite;

import java.util.Iterator;

/**
 * NullIterator 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class NullIterator implements Iterator<MenuComponent> {
	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		return null;
	}
}