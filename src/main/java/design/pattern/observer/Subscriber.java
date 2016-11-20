/**
 * @(#) Subscriber.class $version 2016. 11. 20
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.observer;

/**
 * Subscriber 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Subscriber implements Observer {
	private String name;
	private Subject subject;
	private String title;
	private String contents;

	public Subscriber(String name, Subject subject) {
		this.name = name;
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void update(Subject subject) {
		if (subject instanceof News) {
			News news = (News) subject;
			this.title = news.getTitle();
			this.contents = news.getContents();

			read();
		}
	}

	public void read() {
		System.out.println(name + " => [title] : " + title + ", [contents] : " + contents);
	}
}