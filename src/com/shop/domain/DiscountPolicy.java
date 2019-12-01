package com.shop.domain;

import java.io.Serializable;

/**
 * Represents discount policy.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-23
 */
public interface DiscountPolicy extends Serializable {

    /**
     * @param code Discount code
     * @return values between 0 and 1
     */
    float getDiscount(String code);
}
