package com.shop.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents customer.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-17
 */
public class Customer {

    private final String name;
    private List<String> phoneNumbers;
    private boolean active;

    public Customer(String name) {
        Objects.requireNonNull(name);
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
        this.active = true;
    }

    public Customer(String name, boolean active) {
        this(name);
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }

    public boolean isActive() {
        return active;
    }

    public void addPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && !phoneNumber.isEmpty() && !phoneNumbers.contains(phoneNumber)) {
            phoneNumbers.add(phoneNumber);
        }
    }

    public String removePhoneNumber(int index) {
        if (index >= 0 && index < phoneNumbers.size()) {
            return phoneNumbers.remove(index);
        }
        return null;
    }

    public void toggleActive() {
        active = !active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return active == customer.active &&
                name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
