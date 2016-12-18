/**
 * @(#) LightOffCommand.class $version 2016. 12. 18
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.command;

/**
 * LightOffCommand 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}
}