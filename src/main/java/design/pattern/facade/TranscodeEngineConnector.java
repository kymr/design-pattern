/**
 * @(#) TranscodeEngineConnector.class $version 2016. 12. 26
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.facade;

/**
 * TranscodeEngineConnector 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class TranscodeEngineConnector {
	public class Engine {
		// this is sample
	}

	Engine engine;

	public TranscodeEngineConnector() {
		this.engine = new Engine();
	}

	public void connect() {
		System.out.println("Connect to Transcoder Engine..");
	}

	public void validate(String path) {
		System.out.println("Validating Source " + path + " ..");
	}

	public void optimizeOption(EncodingOption encodingOption) {
		System.out.println("Optimizing Option..");
	}

	public String encode() {
		System.out.println("Encoding..");
		return "localOutputPath";
	}


}