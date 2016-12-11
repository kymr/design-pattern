/**
 * @(#) ClassicalSingleton.class $version 2016. 12. 12
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.singleton;

/**
 * ClassicalSingleton 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class ClassicalSingleton {
	private static ClassicalSingleton classicalSingleton;

	private ClassicalSingleton() {
	}

	public static synchronized ClassicalSingleton getInstance() {
		if (classicalSingleton == null) {
			classicalSingleton = new ClassicalSingleton();
		}
		return classicalSingleton;
	}
}