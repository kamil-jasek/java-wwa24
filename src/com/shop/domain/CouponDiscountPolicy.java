package com.shop.domain;

import com.shop.util.Precondition;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.shop.util.Precondition.checkArgument;
import static java.util.Objects.requireNonNull;

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
        requireNonNull(codes);
        checkArgument(!codes.isEmpty(), "Codes list is empty");
        checkArgument(discount >= 0 && discount <= 1, "Invalid discount value");
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
