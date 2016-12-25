/**
 * @(#) WildTurkey.class $version 2016. 12. 26
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.adapter;

/**
 * WildTurkey 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class WildTurkey implements Turkey {
	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}
}