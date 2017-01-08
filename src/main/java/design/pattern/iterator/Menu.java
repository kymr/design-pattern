/**
 * @(#) Menu.class $version 2017. 01. 08
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.iterator;

import java.util.Iterator;

/**
 * Menu 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public interface Menu {
	public Iterator<MenuItem> createIterator();
}
