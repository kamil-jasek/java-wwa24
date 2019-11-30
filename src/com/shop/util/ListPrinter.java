package com.shop.util;

import com.shop.util.io.OutputControl;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;


/**
 * ... comment class...
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-30
 */
public final class ListPrinter {

    private final OutputControl outputControl;

    public ListPrinter(OutputControl outputControl) {
        requireNonNull(outputControl);
        this.outputControl = outputControl;
    }

    public void print(List<?> objects) {
        int i = 1;
        for (Object object : objects) {
            outputControl.text(i++ + ".) " + object);
        }
    }
}
