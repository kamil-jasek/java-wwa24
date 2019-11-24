package com.shop.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents coupon discount policy.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-23
 */
public final class CouponDiscountPolicy implements DiscountPolicy {

    private final List<String> codes;
    private final float discount;

    public CouponDiscountPolicy(List<String> codes, float discount) {
        Objects.requireNonNull(codes);
        if (codes.isEmpty()) {
            throw new IllegalArgumentException("Codes list is empty");
        }
        if (discount < 0 || discount > 1) {
            throw new IllegalArgumentException("Invalid discount value");
        }
        this.codes = new ArrayList<>(codes);
        this.discount = discount;
    }

    @Override
    public float getDiscount(String code) {
        if (codes.contains(code)) {
            codes.remove(code);
            return discount;
        }
        return 0;
    }
}
