package com.shop.domain;

import static com.shop.util.Precondition.requireNonNulls;

public final class Person extends Customer {

    private String firstName;
    private String lastName;

    // CONSTRUCTORS
    public Person(String firstName, String lastName) {
        super(firstName + " " + lastName);
        initFullName(firstName, lastName);
    }

    public Person(String firstName, String lastName, boolean active) {
        super(firstName + " " + lastName, active);
        initFullName(firstName, lastName);
    }

    private void initFullName(String firstName, String lastName) {
        requireNonNulls(firstName, lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getTaxId() {
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
