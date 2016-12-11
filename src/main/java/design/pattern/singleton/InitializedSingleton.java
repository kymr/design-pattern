/**
 * @(#) InitializedSingleton.class $version 2016. 12. 12
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.singleton;

/**
 * InitializedSingleton 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class InitializedSingleton {
	private static InitializedSingleton initializedSingleton = new InitializedSingleton();

	private InitializedSingleton() {
	}

	public static synchronized InitializedSingleton getInstance() {
		return initializedSingleton;
	}
}