/**
 * @(#) EncodeTask.class $version 2016. 12. 26
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.facade;

/**
 * EncodeTask 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class EncodeTask {
	private String id;
	private String sourcePath;
	private String destPath;
	private String option;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSourcePath() {
		return sourcePath;
	}

	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}

	public String getDestPath() {
		return destPath;
	}

	public void setDestPath(String destPath) {
		this.destPath = destPath;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}
}