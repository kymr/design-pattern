/**
 * @(#) RemoteControl.class $version 2016. 12. 18
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.command.java8;

import design.pattern.command.Light;

import java.util.HashMap;
import java.util.function.Function;

/**
 * RemoteControl 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class RemoteControl {
	private HashMap<Integer, Command> commands = new HashMap<>();

	public void register(int slot, Command command) {
		commands.put(slot, command);
	}

	public void buttonPressed(int slot) {
		if (commands.containsKey(slot) == false) {
			System.out.println("This button is not registed yet.");
		}

		commands.get(slot).execute();
	}

	public static void main(String[] args) {
		Light light = new Light();

		RemoteControl remoteControl = new RemoteControl();
		remoteControl.register(1, () -> light.on());
		remoteControl.register(2, () -> light.off());
		remoteControl.register(3, () -> {
			light.on();
			light.off();
		});

		remoteControl.buttonPressed(1);
		remoteControl.buttonPressed(2);
		remoteControl.buttonPressed(3);
	}
}