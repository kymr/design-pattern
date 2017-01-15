/**
 * @(#) PersonBeanImpl.class $version 2017. 01. 15
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.proxy;

/**
 * PersonBeanImpl 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class PersonBeanImpl implements PersonBean {
	String name;
	String gender;
	String interests;
	int rating;
	int ratingCount = 0;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getGender() {
		return gender;
	}

	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String getInterests() {
		return interests;
	}

	@Override
	public void setInterests(String interests) {
		this.interests = interests;
	}

	@Override
	public int getHotOrNotRating() {
		return (ratingCount == 0) ? 0 : rating / ratingCount;
	}

	@Override
	public void setHotOrNotRating(int rating) {
		this.rating += rating;
		ratingCount++;
	}

}