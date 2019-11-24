package com.shop.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

/**
 * Represents customer.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-17
 */
public abstract class Customer {

    private final String name;
    private final List<String> phoneNumbers;
    private final List<Address> addresses;
    private boolean active;

    public Customer(String name) {
        requireNonNull(name);
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
        this.addresses = new ArrayList<>();
        this.active = true;
    }

    public Customer(String name, boolean active) {
        this(name);
        this.active = active;
    }

    public abstract String getTaxId();

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }

    public List<Address> getAddresses() {
        return new ArrayList<>(addresses);
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

    public void addAddress(Address address) {
        if (address != null && !addresses.contains(address)) {
            addresses.add(address);
        }
    }
}
