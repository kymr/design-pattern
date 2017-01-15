/**
 * @(#) PersonBean.class $version 2017. 01. 15
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.proxy;

/**
 * PersonBean 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public interface PersonBean {
	String getName();
	String getGender();
	String getInterests();
	int getHotOrNotRating();

	void setName(String name);
	void setGender(String gender);
	void setInterests(String interests);
	void setHotOrNotRating(int rating);
}
