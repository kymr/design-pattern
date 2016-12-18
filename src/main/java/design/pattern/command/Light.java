/**
 * @(#) Light.class $version 2016. 12. 18
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.command;

/**
 * Light 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Light {
	public void on() {
		System.out.println("light on");
	}

	public void off() {
		System.out.println("light off");
	}
}