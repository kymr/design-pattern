/**
 * @(#) DoubleCheckingLockingSingleton.class $version 2016. 12. 12
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.singleton;

/**
 * DoubleCheckingLockingSingleton 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class DoubleCheckingLockingSingleton {
	private volatile static DoubleCheckingLockingSingleton doubleCheckingLockingSingleton;

	private DoubleCheckingLockingSingleton() {
	}

	public static DoubleCheckingLockingSingleton getInstance() {
		if (doubleCheckingLockingSingleton == null) {
			synchronized (DoubleCheckingLockingSingleton.class) {
				if (doubleCheckingLockingSingleton == null) {
					doubleCheckingLockingSingleton = new DoubleCheckingLockingSingleton();
				}
			}
		}

		return doubleCheckingLockingSingleton;
	}
}