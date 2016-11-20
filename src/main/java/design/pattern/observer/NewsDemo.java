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

		SimpleDisplay simpleDisplay = new SimpleDisplay(news);
		news.setNews("Earthquake!!", "Today, Earthquake happens!!");

		DetailDisplay detailDisplay  = new DetailDisplay(news);
		news.setNews("Flood!!", "Today, Flood happens!!");

		news.deleteObserver(simpleDisplay);
		news.setNews("Warm", "It is warm today.");
	}
}