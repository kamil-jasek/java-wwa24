package com.shop.domain;

import java.util.Objects;

/**
 * Represents Company Vat Number
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-23
 */
public final class VatNumber {

    private final String value;

    public VatNumber(String value) {
        Objects.requireNonNull(value);
        if (!value.matches("[A-Z]{2}\\d{10}")) {
            throw new IllegalArgumentException("Invalid vat number");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VatNumber vatNumber = (VatNumber) o;
        return value.equals(vatNumber.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
