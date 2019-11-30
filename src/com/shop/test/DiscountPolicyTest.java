package com.shop.test;

import com.shop.domain.CouponDiscountPolicy;
import com.shop.domain.DiscountPolicy;
import com.shop.domain.FixedDiscountPolicy;

import java.util.Arrays;
import java.util.List;

/**
 * Discount policies tests
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-23
 */
final class DiscountPolicyTest {

    void testFixedDiscountPolicy() {
        DiscountPolicy policy = new FixedDiscountPolicy(0.2F);
        assert policy.getDiscount(null) == 0.2F : "Invalid discount";

        DiscountPolicy fullDiscountPolicy = new FixedDiscountPolicy(1F);
        assert fullDiscountPolicy.getDiscount(null) == 1F : "Invalid discount";

        DiscountPolicy noDiscountPolicy = new FixedDiscountPolicy(0F);
        assert noDiscountPolicy.getDiscount(null) == 0F : "Invalid discount";
    }

    void testCouponDiscountPolicy() {
        List<String> codes = Arrays.asList("ABC", "CDE");
        DiscountPolicy policy = new CouponDiscountPolicy(codes , 0.2F);
        assert policy.getDiscount("ABC") == 0.2F : "Invalid discount";
        assert policy.getDiscount("ABC") == 0 : "Invalid discount";
        assert policy.getDiscount("CDE") == 0.2F : "Invalid discount";
        assert policy.getDiscount("XSC") == 0 : "Invalid discount";
    }
}
