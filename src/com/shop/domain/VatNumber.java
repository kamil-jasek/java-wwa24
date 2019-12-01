package com.shop.domain;

import com.shop.util.Precondition;

import java.io.Serializable;
import java.util.Objects;

import static com.shop.util.Precondition.checkArgument;
import static java.util.Objects.requireNonNull;

/**
 * Represents Company Vat Number
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-23
 */
public final class VatNumber implements Serializable {

    private final String value;

    public VatNumber(String value) {
        requireNonNull(value);
        checkArgument(value.matches("[A-Z]{2}\\d{10}"), "Invalid vat number");
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
