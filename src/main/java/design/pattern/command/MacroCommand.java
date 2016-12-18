/**
 * @(#) MacroCommand.class $version 2016. 12. 18
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.command;

import java.util.Arrays;

/**
 * MacroCommand 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class MacroCommand implements Command {
	Command[] commands;

	public MacroCommand(Command[] coomands) {
		this.commands = coomands;
	}

	@Override
	public void execute() {
		Arrays.stream(commands).forEach(Command::execute);
	}

	public static void main(String[] args) {
		Light light = new Light();

		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);

		Command[] commands = {lightOnCommand, lightOffCommand};
		MacroCommand macroCommand = new MacroCommand(commands);

		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		simpleRemoteControl.setCommand(macroCommand);

		simpleRemoteControl.buttonWasPressed();
	}
}