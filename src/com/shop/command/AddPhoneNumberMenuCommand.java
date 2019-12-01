package com.shop.command;

import com.shop.domain.Account;
import com.shop.util.io.IO;

import java.util.Objects;

/**
 * Add phone number
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-12-01
 */
public final class AddPhoneNumberMenuCommand
        implements MenuCommand<Account> {

    private final IO io;

    public AddPhoneNumberMenuCommand(IO io) {
        Objects.requireNonNull(io);
        this.io = io;
    }

    @Override
    public void execute(Account account) {
        io.out().text("Provide phone number:");
        String number = io.in().text();
        account.getCustomer().addPhoneNumber(number);
        io.out().text("Phone number added: " + number);
    }

    @Override
    public String toString() {
        return "Add phone number";
    }
}
