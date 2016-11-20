/**
 * @(#) Subject.class $version 2016. 11. 20
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.observer.java8;

import design.pattern.observer.Observer;

import java.util.function.Function;

/**
 * Subject 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public interface Subject {
	void addFunction(Function<Subject, Void> funtion);		// or Consumer<Subject>
	void deleteFunction(Function<Subject, Void> funtion);	// or Consumer<Subject>
	void notifyObservers();
}
