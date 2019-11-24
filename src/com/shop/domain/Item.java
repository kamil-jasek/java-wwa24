package com.shop.domain;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Represent order item.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-24
 */
public final class Item {

    private final String name;
    private final BigDecimal price;
    private final int quantity;

    public Item(String name, BigDecimal price, int quantity) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(price);
        if (price.compareTo(BigDecimal.ZERO) < 1) {
            throw new IllegalArgumentException("Wrong price");
        }
        if (quantity < 1) {
            throw new IllegalArgumentException("Wrong quantity");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return quantity == item.quantity &&
                name.equals(item.name) &&
                price.equals(item.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }
}
