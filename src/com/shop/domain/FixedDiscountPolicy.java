package com.shop.domain;

/**
 * Fixed discount policy.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-23
 */
public final class FixedDiscountPolicy implements DiscountPolicy {

    private final float discount;

    public FixedDiscountPolicy(float discount) {
        if (discount < 0 || discount > 1) {
            throw new IllegalArgumentException("Invalid discount: " + discount);
        }
        this.discount = discount;
    }

    @Override
    public float getDiscount(String code) {
        return discount;
    }
}
