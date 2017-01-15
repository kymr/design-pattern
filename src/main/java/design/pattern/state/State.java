/**
 * @(#) State.class $version 2017. 01. 15
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.state;

/**
 * State 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public interface State {
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
}
