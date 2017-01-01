/**
 * @(#) Demo.class $version 2017. 01. 01
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.templatemethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Demo 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public class Demo {
	public static void main(String[] args) {
		Arrays.asList(new Tea(), new Coffee())
				.forEach((CaffeineBeverage beverage) -> {
					System.out.println("This is " + beverage.getClass().getSimpleName());
					beverage.prepareRecipe();
				});

		System.out.println("\n\nDuck Sort Example");

		Duck[] ducks = {
			new Duck("Daffy", 8),
			new Duck("Dewey", 2),
			new Duck("Howard", 7),
			new Duck("Louie", 2),
			new Duck("Donald", 10),
			new Duck("Huey", 2)
		};

		System.out.println("Before:");
		Stream.of(ducks).forEach(System.out::println);

		System.out.println("After");
		Arrays.sort(ducks, (Duck o1, Duck o2) -> o1.weight - o2.weight);
		Stream.of(ducks).forEach(System.out::println);
	}
}