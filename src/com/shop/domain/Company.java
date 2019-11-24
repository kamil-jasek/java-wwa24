package com.shop.domain;

import java.util.Objects;

/**
 * ... comment class...
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-17
 */
public final class Company extends Customer {

    private final VatNumber vatNumber;

    public Company(String name, VatNumber vatNumber) {
        super(name);
        Objects.requireNonNull(vatNumber);
        this.vatNumber = vatNumber;
    }

    public Company(String name, VatNumber vatNumber, boolean active) {
        super(name, active);
        Objects.requireNonNull(vatNumber);
        this.vatNumber = vatNumber;
    }

    @Override
    public String getTaxId() {
        return vatNumber.getValue();
    }
}
