package com.shop.test;

import com.shop.domain.Person;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PersonTest {

    public void testCreatePerson() {
        Person person1 = new Person("Kamil", "Jasek");
        assert person1 != null : "Person1 is null!";

        Person person2 = new Person("Jan", "Kowalski", false);
        assert person2 != null : "Person2 is null!";
    }

    public void toStringUtil() {

    }

    public void testPersonPhoneNumbers() {
        Person person1 = new Person("Kamil", "Jasek");
        person1.addPhoneNumber("+4894920230939");
        person1.addPhoneNumber("+4492029493922");
        assert person1.getPhoneNumbers()
                .equals(Arrays.asList("+4894920230939", "+4492029493922")) : "Wrong phone numbers";

        String removed = person1.removePhoneNumber(1);
        assert removed.equals("+4492029493922") : "Wrong phone number removed";
        assert person1.removePhoneNumber(10) == null : "Phone number exists";
    }

    public void testPersonActive() {
        Person person1 = new Person("Kamil", "Jasek");
        person1.toggleActive();
        assert !person1.isActive() : "Person1 is active";
    }

    public void testPersonFullName() {
        Person person1 = new Person("Kamil", "Jasek");
        assert person1.getFullName().equals("Kamil Jasek") : "Not Kamil Jasek";
    }

    public void testPersonEqualsHashcodeContract() {
        Person person1 = new Person("Kamil", "Jasek");
        Person person2 = new Person("Jan", "Kowalski", false);
        Person person3 = new Person("Jan", "Nowak");
        Person person4 = new Person("Jan", "Nowak");
        assert person3.equals(person4) && person3.hashCode() == person4.hashCode()
                : "Invalid equals hashcode contract";

//        System.out.println(person3.hashCode());

        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);

        assert personSet.contains(person2) : "Person set not contains person2";
        person2.toggleActive();
        assert personSet.contains(person2) : "Person set not contains person2";

//        System.out.println(person1);
    }
}
