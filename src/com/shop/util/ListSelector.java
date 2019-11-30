package com.shop.util;

import com.shop.util.io.IO;

import java.util.List;

import static com.shop.util.Precondition.requireNonNulls;

/**
 * Select element from list.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-30
 */
public final class ListSelector {

    private final IO io;
    private final ListPrinter printer;

    public ListSelector(IO io) {
        requireNonNulls(io);
        this.io = io;
        this.printer = new ListPrinter(io.out());
    }

    public int select(List<?> objects) {
        io.out().text("Please select one of:");
        printer.print(objects);
        while (true) {
            int selected = io.in().integer();
            if (selected > 0 && selected <= objects.size()) {
                return selected;
            }
            io.out().text("Selected value is wrong. Please select again:");
        }
    }
}
