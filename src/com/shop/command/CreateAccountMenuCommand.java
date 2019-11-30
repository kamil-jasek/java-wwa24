package com.shop.command;

import com.shop.domain.*;
import com.shop.util.ListPrinter;
import com.shop.util.ListSelector;
import com.shop.util.io.IO;

import java.util.Arrays;
import java.util.List;

import static com.shop.util.Precondition.requireNonNulls;
import static java.util.Objects.requireNonNull;

/**
 * Command for creating new account
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-30
 */
public final class CreateAccountMenuCommand
        implements MenuCommand<List<Account>> {

    private final IO io;
    private final ListSelector listSelector;

    public CreateAccountMenuCommand(IO io, ListSelector listSelector) {
        requireNonNulls(io, listSelector);
        this.io = io;
        this.listSelector = listSelector;
    }

    @Override
    public void execute(List<Account> accounts) {
        io.out().text("You are creating new account.");
        Customer customer = createCustomer();
        accounts.add(new Account(customer));
        io.out().text("Account created.");
    }

    private Customer createCustomer() {
        io.out().text("Please select customer type: ");
        int selected = listSelector.select(Arrays.asList("Company", "Person"));
        switch (selected) {
            case 1:
                return createCompany();
            case 2:
                return createPerson();
            default:
                throw new IllegalArgumentException("Invalid selection");
        }
    }

    private Customer createCompany() {
        io.out().text("Please provide company name:");
        String name = io.in().text();
        io.out().text("Please provide VAT number:");
        VatNumber vatNumber = new VatNumber(io.in().text());
        return new Company(name, vatNumber);
    }

    private Customer createPerson() {
        io.out().text("Please provide first name:");
        String firstName = io.in().text();
        io.out().text("Please provide last name:");
        String lastName = io.in().text();
        return new Person(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Create account";
    }
}
