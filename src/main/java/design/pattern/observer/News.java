/**
 * @(#) News.class $version 2016. 11. 20
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * News 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class News implements Subject {
	private List<Observer> observers;
	private String title;
	private String contents;

	public News() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(observer -> observer.update(this));
	}

	public void setNews(String title, String contents) {
		System.out.println("\n\nNews arrived!!");
		this.title = title;
		this.contents = contents;
		notifyObservers();
	}

	public String getTitle() {
		return title;
	}

	public String getContents() {
		return contents;
	}
}