package com.shop.domain;

import com.shop.util.Precondition;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import static com.shop.util.Precondition.checkArgument;
import static com.shop.util.Precondition.requireNonNulls;

/**
 * Represent order item.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-24
 */
public final class Item implements Serializable {

    private final String name;
    private final BigDecimal price;
    private final int quantity;

    public Item(String name, BigDecimal price, int quantity) {
        requireNonNulls(name, price);
        checkArgument(price.compareTo(BigDecimal.ZERO) > 0, "Wrong price");
        checkArgument(quantity > 0, "Wrong quantity");
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
