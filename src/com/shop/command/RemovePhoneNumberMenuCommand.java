package com.shop.command;

import com.shop.domain.Account;
import com.shop.util.ListSelector;
import com.shop.util.Precondition;
import com.shop.util.io.IO;

/**
 * Remove phone number.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-12-01
 */
public final class RemovePhoneNumberMenuCommand
        implements MenuCommand<Account> {

    private final IO io;
    private final ListSelector listSelector;

    public RemovePhoneNumberMenuCommand(IO io, ListSelector listSelector) {
        Precondition.requireNonNulls(io, listSelector);
        this.io = io;
        this.listSelector = listSelector;
    }

    @Override
    public void execute(Account account) {
        if (account.getCustomer().getPhoneNumbers().isEmpty()) {
            io.out().text("Phone numbers is empty. Add something...");
            return;
        }
        int selected = listSelector
                .select(account.getCustomer().getPhoneNumbers());
        String removedNumber = account.getCustomer()
                .removePhoneNumber(selected - 1);
        io.out().text("Successfully removed number: " + removedNumber);
    }

    @Override
    public String toString() {
        return "Remove phone number";
    }
}
