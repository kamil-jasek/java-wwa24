package com.shop.domain;

import com.shop.util.Precondition;

import static com.shop.util.Precondition.checkArgument;

/**
 * Fixed discount policy.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-23
 */
public final class FixedDiscountPolicy implements DiscountPolicy {

    private final float discount;

    public FixedDiscountPolicy(float discount) {
        checkArgument(discount >= 0 && discount <= 1, "Invalid discount: " + discount);
        this.discount = discount;
    }

    @Override
    public float getDiscount(String code) {
        return discount;
    }
}
