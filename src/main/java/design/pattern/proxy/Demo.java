/**
 * @(#) Demo.class $version 2017. 01. 15
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.proxy;

import java.lang.reflect.Proxy;

/**
 * Demo 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Demo {
	public static void main(String[] args) {
		PersonBean joe = search("joe");
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("skiing");
		System.out.println("Interest set from owner proxy");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Cannot set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("skiing");
		} catch (Exception e) {
			System.out.println("Cannot set interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

	}

	private static PersonBean getOwnerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(
				personBean.getClass().getClassLoader(),
				personBean.getClass().getInterfaces(),
				new OwnerInvocationHandler(personBean)
		);
	}

	private static PersonBean getNonOwnerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(
				personBean.getClass().getClassLoader(),
				personBean.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(personBean)
		);
	}

	private static PersonBean search(String name) {
		PersonBeanImpl personBean = new PersonBeanImpl();
		personBean.setName(name);
		personBean.setGender("male");
		personBean.setInterests("programming");
		personBean.setHotOrNotRating(10);

		return personBean;
	}



}