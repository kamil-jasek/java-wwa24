package com.shop.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private final String firstName;
    private final String lastName;
    private List<String> phoneNumbers;
    private boolean active;

    // CONSTRUCTORS
    public Person(String firstName, String lastName) {
        Objects.requireNonNull(firstName);
        Objects.requireNonNull(lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumbers = new ArrayList<>();
        this.active = true;
    }

    public Person(String firstName, String lastName, boolean active) {
        this(firstName, lastName);
        this.active = active;
    }

    // MUTATORS/SETTERS
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

    // GETTERS
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public List<String> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return active == person.active &&
                firstName.equals(person.firstName) &&
                lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", active=" + active +
                '}';
    }
}
