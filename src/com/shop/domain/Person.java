package com.shop.domain;

import java.util.Objects;

public class Person extends Customer {

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
        Objects.requireNonNull(firstName);
        Objects.requireNonNull(lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
