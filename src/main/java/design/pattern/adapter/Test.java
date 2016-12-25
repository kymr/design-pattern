/**
 * @(#) Test.class $version 2016. 12. 26
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.adapter;

/**
 * Test 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Test {
	public static void main(String[] args) {
		WildTurkey wildTurkey = new WildTurkey();
		Duck tuckeyAdapter = new TurkeyAdapter(wildTurkey);

		tuckeyAdapter.quack();
		tuckeyAdapter.fly();
	}
}