/**
 * @(#) SimpleDisplay.class $version 2016. 11. 20
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.observer;

/**
 * SimpleDisplay 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class SimpleDisplay implements Observer {
	private Subject subject;
	private String title;
	private String contents;

	public SimpleDisplay(Subject subject) {
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void update(Subject subject) {
		if (subject instanceof News) {
			News news = (News) subject;
			this.title = news.getTitle();
			this.contents = news.getContents();

			display();
		}
	}

	public void display() {
		System.out.println("[title] : " + title);
	}
}