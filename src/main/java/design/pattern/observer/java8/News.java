/**
 * @(#) News.class $version 2016. 11. 20
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.observer.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * News 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class News implements Subject {
	private List<Function<Subject, Void>> functions;		// or Consumer<Subject>
	private String title;
	private String contents;

	public News() {
		this.functions = new ArrayList<>();
	}

	@Override
	public void addFunction(Function<Subject, Void> funtion) { 	// or Consumer<Subject>
		this.functions.add(funtion);
	}

	@Override
	public void deleteFunction(Function<Subject, Void> funtion) {		// or Consumer<Subject>
		this.functions.remove(funtion);
	}

	@Override
	public void notifyObservers() {
		functions.forEach(function -> function.apply(this));
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