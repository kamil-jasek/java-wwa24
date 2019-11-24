package com.shop.test;

import com.shop.domain.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Tests for customers.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-23
 */
final class CustomerTest {

    void testCreateCustomer() {
        VatNumber number = new VatNumber("PL0399300392");
        Customer customer1 = new Company("ADIDAS", number);
        assert customer1.getName().equals("ADIDAS") : "Invalid company name";
        assert customer1.getTaxId().equals("PL0399300392") : "Invalid tax id";

        Customer customer2 = new Person("Jan", "Kowalski");
        assert customer2.getName().equals("Jan Kowalski") : "Invalid person name";
        assert customer2.getTaxId() == null : "Tax id not null";

        assert customer1 instanceof Company : "customer1 is not Company";
        assert customer2 instanceof Person : "customer2 is not Person";

        Person person = (Person) customer2;
        assert person.getFirstName().equals("Jan") : "Firstname is not Jan";
    }

    void testPolimorphizm() {
        Customer[] customers = new Customer[] {
                new Person("Jan", "Kowalski"),
                new Company("ADIDAS", new VatNumber("PL0399300392"))
        };
        List<String> taxIds = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getTaxId() != null) {
                taxIds.add(customer.getTaxId());
            }
        }
        assert taxIds.equals(Arrays.asList("PL0399300392")) :
                "Invalid list of tax ids";
    }

    void testCustomerAddressCreation() {
        Customer customer = new Company("ADIDAS", new VatNumber("PL0399300392"));
        Address address = new Address(
                "Jana Kowalskiego 4",
                "Warszawa",
                "01-329",
                "PL");
        customer.addAddress(address);
        customer.addAddress(address);

        assert customer.getAddresses().size() == 1 : "Invalid address list";
        assert customer.getAddresses().get(0)
                .equals(new Address(
                        "Jana Kowalskiego 4",
                        "Warszawa",
                        "01-329",
                        "PL"
                )) : "Invalid address in the list";
    }
}
