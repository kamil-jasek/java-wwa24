package com.shop.test;

import com.shop.domain.*;

import java.math.BigDecimal;
import java.util.Arrays;

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
        DiscountPolicy discountPolicy = new CouponDiscountPolicy(
                Arrays.asList("ABC", "CDE"), 0.2F
        );
        Order order = new Order(discountPolicy);
        assert order.getTotal().compareTo(BigDecimal.ZERO) == 0 : "Invalid total";

        order.addItem(new Item("Komputer", BigDecimal.valueOf(3200), 15));
        assert order.getTotal().compareTo(BigDecimal.valueOf(48000)) == 0
                : "Invalid total";

        order.applyDiscount("QWE");
        assert order.getTotal().compareTo(BigDecimal.valueOf(48000)) == 0
                : "Invalid total";

        order.applyDiscount("ABC");
        assert order.getTotal().compareTo(new BigDecimal("38400")) == 0
                : "Invalid total";

        order.addItem(new Item("Myszka", BigDecimal.valueOf(20), 15));
        assert order.getTotal().compareTo(new BigDecimal("38640")) == 0
                : "Invalid total";
    }

    void testSendOrder() {
        DiscountPolicy discountPolicy = new FixedDiscountPolicy(0.2F);
        Order order = new Order(discountPolicy);

        order.send();
        assert order.getStatus().equals(OrderStatus.IN_PROGRESS) : "Invalid status";

        order.addItem(new Item("Laptop", BigDecimal.valueOf(3200), 1));
        order.addItem(new Item("Myszka", BigDecimal.valueOf(100), 1));
        order.send();
        assert order.getStatus().equals(OrderStatus.SENT) : "Invalid status";

        order.addItem(new Item("Monitor", BigDecimal.valueOf(1200), 1));
        assert order.getItems().size() == 2 : "Invalid number of items after send";
    }

    void testOrderStatus() {
        OrderStatus[] values = OrderStatus.values();
        assert values[0] == OrderStatus.IN_PROGRESS : "invalid enum";
        assert values[1] == OrderStatus.SENT : "invalid enum";

        assert OrderStatus.IN_PROGRESS.getStatusName()
                .equals("in progress") : "invalid status name";

        assert OrderStatus.IN_PROGRESS.name()
                .equals("IN_PROGRESS") : "invalid enum option name";

        assert OrderStatus.IN_PROGRESS.ordinal() == 0 : "invalid enum position";
    }
}
