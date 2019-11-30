package com.shop.command;

import com.shop.domain.Account;
import com.shop.domain.printer.AccountTablePrinter;
import com.shop.util.TablePrinter;
import com.shop.util.io.IO;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

/**
 * List accounts
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-30
 */
public final class ListAccountsMenuCommand
        implements MenuCommand<List<Account>> {

    private final IO io;
    private final TablePrinter<Account> printer;

    public ListAccountsMenuCommand(IO io) {
        requireNonNull(io);
        this.io = io;
        this.printer = new AccountTablePrinter(new int[] {18, 14, 16, 8});
    }

    @Override
    public void execute(List<Account> accounts) {
        io.out().text(printer.print(accounts));
    }

    @Override
    public String toString() {
        return "List accounts";
    }
}
