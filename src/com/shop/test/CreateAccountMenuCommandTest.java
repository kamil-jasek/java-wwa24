package com.shop.test;

import com.shop.command.CreateAccountMenuCommand;
import com.shop.command.MenuCommand;
import com.shop.domain.Account;
import com.shop.util.ListSelector;
import com.shop.util.io.IO;
import com.shop.util.io.PrintOutputControl;
import com.shop.util.io.ScannerInputControl;

import java.util.ArrayList;
import java.util.List;

/**
 * Tests for creating account via menu command.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-30
 */
final class CreateAccountMenuCommandTest {

    void testCreateCompany() {
        IO io = new IO(
                new ScannerInputControl(System.in),
                new PrintOutputControl());
        ListSelector listSelector = new ListSelector(io);
        MenuCommand<List<Account>> command =
                new CreateAccountMenuCommand(io, listSelector);

        List<Account> accounts = new ArrayList<>();
        command.execute(accounts);
        assert accounts.size() == 1 : "Invalid accounts size";
    }
}
