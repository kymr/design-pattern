/**
 * @(#) SimpleRemoteControl.class $version 2016. 12. 18
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.command;

/**
 * SimpleRemoteControl 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() {

	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}

	public static void main(String[] args) {
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		Light light = new Light();
		simpleRemoteControl.setCommand(new LightOnCommand(light));
		simpleRemoteControl.buttonWasPressed();
	}
}