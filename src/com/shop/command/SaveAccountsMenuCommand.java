package com.shop.command;

import com.shop.domain.Account;
import com.shop.util.io.IO;

import java.io.*;
import java.util.List;
import java.util.Objects;

/**
 * Save accounts to file.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-12-01
 */
public final class SaveAccountsMenuCommand
        implements MenuCommand<List<Account>> {

    private final IO io;

    public SaveAccountsMenuCommand(IO io) {
        Objects.requireNonNull(io);
        this.io = io;
    }

    @Override
    public void execute(List<Account> accounts) {
        try (ObjectOutputStream stream =
                     new ObjectOutputStream(new FileOutputStream("data.txt"))) {
            stream.writeObject(accounts);
            io.out().text("Successfully data saved.");
        } catch (IOException ex) {
            io.out().text("Failed to save file: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Save data to file";
    }
}
