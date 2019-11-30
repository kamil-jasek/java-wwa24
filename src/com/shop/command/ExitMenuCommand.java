package com.shop.command;

/**
 * Exiting menu command.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-30
 */
public final class ExitMenuCommand<T> implements MenuCommand<T> {

    @Override
    public void execute(T context) {
    }

    @Override
    public boolean isExit() {
        return true;
    }

    @Override
    public String toString() {
        return "Exit";
    }
}
