/**
 * @(#) NewsDemo.class $version 2016. 11. 20
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.observer;

/**
 * NewsDemo 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class NewsDemo {
	public static void main(String[] args) {
		News news = new News();

		Subscriber subscriber1 = new Subscriber("batman", news);
		news.setNews("Earthquake!!", "Today, Earthquake happens!!");

		Subscriber subscriber2 = new Subscriber("superman", news);
		news.setNews("Flood!!", "Today, Flood happens!!");

		news.deleteObserver(subscriber1);
		news.setNews("Warm", "It is warm today.");
	}
}