package com.shop.command;

import com.shop.domain.Account;
import com.shop.util.ListSelector;
import com.shop.util.Precondition;
import com.shop.util.io.IO;

import java.util.Arrays;
import java.util.List;

/**
 * Select account
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-12-01
 */
public final class SelectAccountMenuCommand
        implements MenuCommand<List<Account>> {

    private final IO io;
    private final ListSelector listSelector;

    public SelectAccountMenuCommand(IO io, ListSelector listSelector) {
        Precondition.requireNonNulls(io, listSelector);
        this.io = io;
        this.listSelector = listSelector;
    }

    @Override
    public void execute(List<Account> accounts) {
        if (accounts.isEmpty()) {
            io.out().text("Accounts list is empty. Add something...");
            return;
        }
        int selected = listSelector.select(accounts);
        Account account = accounts.get(selected - 1);
        io.out().text("Account selected: " + account);

        List<MenuCommand<Account>> commands = Arrays.asList(
                new AddPhoneNumberMenuCommand(io),
                new RemovePhoneNumberMenuCommand(io, listSelector),
                new ExitMenuCommand<>()
        );
        new CommandSelector<>(commands, listSelector)
                .select(account);
    }

    @Override
    public String toString() {
        return "Select account";
    }
}
