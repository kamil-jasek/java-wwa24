package com.shop.domain;

import java.util.Objects;

/**
 * Represents customer address.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-23
 */
public final class Address {
    private final String street;
    private final String city;
    private final String postCode;
    private final String country;

    public Address(String street, String city, String postCode, String country) {
        Objects.requireNonNull(street);
        Objects.requireNonNull(city);
        Objects.requireNonNull(postCode);
        Objects.requireNonNull(country);
        this.street = street;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return street.equals(address.street) &&
                city.equals(address.city) &&
                postCode.equals(address.postCode) &&
                country.equals(address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, postCode, country);
    }
}
