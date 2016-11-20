/**
 * @(#) Subject.class $version 2016. 11. 20
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.observer;

/**
 * Subject 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public interface Subject {
	void addObserver(Observer observer);
	void deleteObserver(Observer observer);
	void notifyObservers();
}
