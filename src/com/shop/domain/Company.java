package com.shop.domain;

import java.util.Objects;

/**
 * ... comment class...
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-17
 */
public class Company extends Customer {

    private final String vatNumber;

    public Company(String name, String vatNumber) {
        super(name);
        Objects.requireNonNull(vatNumber);
        this.vatNumber = vatNumber;
    }

    public Company(String name, String vatNumber, boolean active) {
        super(name, active);
        Objects.requireNonNull(vatNumber);
        this.vatNumber = vatNumber;
    }

    public String getVatNumber() {
        return vatNumber;
    }
}
