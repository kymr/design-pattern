/**
 * @(#) WinnerState.class $version 2017. 01. 15
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.state;

/**
 * WinnerState
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class WinnerState implements State {
	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
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
		System.out.println("Congratulations, you can get one more gumball");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			System.out.println("out of gumballs");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if  (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("out of gumballs");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
}