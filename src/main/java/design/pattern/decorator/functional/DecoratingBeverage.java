/**
 * @(#) DecoratingBeverage.class $version 2016. 11. 28
 * <p/>
 * Copyright 2007 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package design.pattern.decorator.functional;

import java.util.function.Function;

/**
 * DecoratingBeverage 
 *
 * @author yongmaroo.kim (yongmaroo.kim@navercorp.com)
 */
public interface DecoratingBeverage extends Beverage {
	static DecoratingBeverage from(Beverage beverage) {
		return new DecoratingBeverage() {
			@Override
			public String getDescription() {
				return beverage.getDescription();
			}

			@Override
			public double cost() {
				return beverage.cost();
			}
		};
	}

	default DecoratingBeverage decorate(Function<? super DecoratingBeverage, ? extends Beverage> decorator) {
		Beverage beverage = decorator.apply(this);
		return from(beverage);
	}

}
