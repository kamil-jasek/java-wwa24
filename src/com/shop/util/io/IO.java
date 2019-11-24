package com.shop.util.io;

import java.util.Objects;

/**
 * Input/Output system.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-24
 */
public final class IO {
    private final InputControl in;
    private final OutputControl out;

    public IO(InputControl in, OutputControl out) {
        Objects.requireNonNull(in);
        Objects.requireNonNull(out);
        this.in = in;
        this.out = out;
    }

    public InputControl in() {
        return in;
    }

    public OutputControl out() {
        return out;
    }
}
