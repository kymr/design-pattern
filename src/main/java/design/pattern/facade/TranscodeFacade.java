/**
 * @(#) TranscodeFacade.class $version 2016. 12. 26
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.facade;

/**
 * TranscodeFacade 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class TranscodeFacade {
	EncodingOptionParser encodingOptionParser;
	TranscodeEngineConnector transcodeEngineConnector;
	FileTransfer fileTransfer;

	public TranscodeFacade(EncodingOptionParser encodingOptionParser, TranscodeEngineConnector transcodeEngineConnector, FileTransfer fileTransfer) {
		this.encodingOptionParser = encodingOptionParser;
		this.transcodeEngineConnector = transcodeEngineConnector;
		this.fileTransfer = fileTransfer;
	}

	public void encode(EncodeTask task) {
		EncodingOption encodingOption = encodingOptionParser.parse(task.getOption());
		transcodeEngineConnector.connect();
		transcodeEngineConnector.validate(task.getSourcePath());
		transcodeEngineConnector.optimizeOption(encodingOption);
		String outputPath = transcodeEngineConnector.encode();
		fileTransfer.copy(outputPath, task.getDestPath());
	}
}