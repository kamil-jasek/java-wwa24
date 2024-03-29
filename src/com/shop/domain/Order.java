package com.shop.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents customer order
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-24
 */
public final class Order implements Serializable {

    private final DiscountPolicy discountPolicy;
    private final List<Item> items;
    private float discount;
    private OrderStatus status;

    public Order(DiscountPolicy discountPolicy) {
        Objects.requireNonNull(discountPolicy);
        this.discountPolicy = discountPolicy;
        this.items = new ArrayList<>();
        this.status = OrderStatus.IN_PROGRESS;
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void addItem(Item item) {
        if (item != null && !items.contains(item) &&
                status.equals(OrderStatus.IN_PROGRESS)) {
            items.add(item);
        }
    }

    public void send() {
        if (items.size() > 0) {
            status = OrderStatus.SENT;
        }
    }

    public BigDecimal getTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Item item : items) {
            // price * quantity
            BigDecimal itemPrice = item.getPrice()
                    .multiply(BigDecimal.valueOf(item.getQuantity()));
            total = total.add(itemPrice);
        }
        // total * (1 - discount)
        return total.multiply(BigDecimal.ONE
                .subtract(BigDecimal.valueOf(discount)))
                .setScale(2, RoundingMode.HALF_UP);
    }

    public void applyDiscount(String code) {
        discount = discountPolicy.getDiscount(code);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return discountPolicy.equals(order.discountPolicy) &&
                items.equals(order.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountPolicy, items);
    }
}
