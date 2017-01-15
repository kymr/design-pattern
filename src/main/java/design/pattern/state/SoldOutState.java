/**
 * @(#) SoldOutState.class $version 2017. 01. 15
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.state;

/**
 * SoldOutState
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class SoldOutState implements State {
	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("cannot insert");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("cannot eject");
	}

	@Override
	public void turnCrank() {
		System.out.println("cannot turn crank");
	}

	@Override
	public void dispense() {
		System.out.println("cannot dispense");
	}
}