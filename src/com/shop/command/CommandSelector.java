package com.shop.command;

import com.shop.util.ListSelector;
import com.shop.util.Precondition;

import java.util.List;

import static com.shop.util.Precondition.checkArgument;
import static com.shop.util.Precondition.requireNonNulls;
import static java.util.Objects.requireNonNull;

/**
 * Command selector
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-30
 */
public final class CommandSelector<T> {

    private final List<MenuCommand<T>> commands;
    private final ListSelector listSelector;

    public CommandSelector(List<MenuCommand<T>> commands,
                           ListSelector listSelector) {
        requireNonNulls(commands, listSelector);
        checkArgument(!commands.isEmpty(), "empty commands");
        this.commands = commands;
        this.listSelector = listSelector;
    }

    public void select(T context) {
        while (true) {
            int selected = listSelector.select(commands);
            MenuCommand<T> command = commands.get(selected - 1);
            command.execute(context);
            if (command.isExit()) {
                return;
            }
        }
    }
}
