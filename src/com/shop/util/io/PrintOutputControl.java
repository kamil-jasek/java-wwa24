package com.shop.util.io;

/**
 * Prints given text to console.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-24
 */
public final class PrintOutputControl implements OutputControl {

    @Override
    public void text(String text) {
        System.out.println(text);
    }
}
