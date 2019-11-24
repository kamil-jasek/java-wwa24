package com.shop.test;

import com.shop.domain.DiscountPolicy;
import com.shop.domain.FixedDiscountPolicy;
import com.shop.domain.Item;
import com.shop.domain.Order;

import java.math.BigDecimal;

/**
 * Order tests
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-24
 */
final class OrderTest {

    void testOrderWithFixedDiscountPolicy() {
        DiscountPolicy discountPolicy = new FixedDiscountPolicy(0.2F);
        Order order = new Order(discountPolicy);
        assert order.getTotal().compareTo(BigDecimal.ZERO) == 0 : "Invalid total";

        order.addItem(new Item("Komputer", BigDecimal.valueOf(3200), 15));
        assert order.getTotal()
                .equals(new BigDecimal("48000.00")) : "Invalid total";
        assert order.getTotal()
                .compareTo(BigDecimal.valueOf(48000)) == 0 : "Invalid total";

        order.applyDiscount(null);
        assert order.getTotal()
                .compareTo(new BigDecimal("38400")) == 0 : "Invalid total";
    }

    void testOrderWithCouponDiscountPolicy() {

    }
}
