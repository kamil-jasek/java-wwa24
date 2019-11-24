package com.shop.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.shop.util.Precondition.requireNonNulls;

/**
 * Represents customer account.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-24
 */
public final class Account {

    private final Customer customer;
    private final List<Order> orders;

    public Account(Customer customer) {
        requireNonNulls(customer);
        this.customer = customer;
        this.orders = new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public void addOrder(Order order) {
        if (order != null) {
            orders.add(order);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return customer.equals(account.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer);
    }
}
