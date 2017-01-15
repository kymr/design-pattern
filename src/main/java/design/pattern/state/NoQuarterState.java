/**
 * @(#) NoQuarterState.class $version 2017. 01. 15
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.state;

/**
 * NoQuarterState 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class NoQuarterState implements State {
	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("quarter is inserted");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("insert qaurter");
	}

	@Override
	public void turnCrank() {
		System.out.println("insert qaurter");
	}

	@Override
	public void dispense() {
		System.out.println("insert qaurter");
	}
}