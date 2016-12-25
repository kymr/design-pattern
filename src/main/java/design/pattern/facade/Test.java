/**
 * @(#) Test.class $version 2016. 12. 26
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.facade;

/**
 * Test 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Test {
	public static void main(String[] args) {
		EncodeTask encodeTask = new EncodeTask();
		encodeTask.setId("id1");
		encodeTask.setSourcePath("source");
		encodeTask.setDestPath("dest");
		encodeTask.setOption("option json string");

		TranscodeEngineConnector transcodeEngineConnector = new TranscodeEngineConnector();
		EncodingOptionParser encodingOptionParser = new EncodingOptionParser();
		FileTransfer fileTransfer = new FileTransfer();
		TranscodeFacade transcodeFacade = new TranscodeFacade(encodingOptionParser, transcodeEngineConnector, fileTransfer);

		transcodeFacade.encode(encodeTask);
	}
}