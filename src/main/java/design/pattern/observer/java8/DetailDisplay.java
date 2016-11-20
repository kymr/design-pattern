/**
 * @(#) DetailDisplay.class $version 2016. 11. 20
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.observer.java8;

import java.util.function.Function;

/**
 * DetailDisplay 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class DetailDisplay {
	private Subject subject;

	public DetailDisplay(Subject subject) {
		this.subject = subject;
		subject.addFunction(this.update);
	}

	Function<Subject, Void> update = (subject) -> {
		if (subject instanceof News) {
			News news = (News) subject;
			System.out.println("[title] : " + news.getTitle() + ", [contents] : " + news.getContents());
		}

		return null;
	};
}