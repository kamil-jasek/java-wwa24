package com.shop;

import com.shop.command.*;
import com.shop.domain.Account;
import com.shop.util.ListSelector;
import com.shop.util.io.IO;
import com.shop.util.io.PrintOutputControl;
import com.shop.util.io.ScannerInputControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Application startup
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-30
 */
final class Application {

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        IO io = new IO(new ScannerInputControl(System.in), new PrintOutputControl());
        io.out().text("SHOP MANAGEMENT APPLICATION");

        ListSelector listSelector = new ListSelector(io);

        List<MenuCommand<List<Account>>> commands = Arrays.asList(
                new CreateAccountMenuCommand(io, listSelector),
                new ListAccountsMenuCommand(io),
                new ExitMenuCommand<>()
        );

        CommandSelector<List<Account>> selector =
                new CommandSelector<>(commands, listSelector);
        selector.select(accounts);
    }
}
