package com.shop.command;

/**
 * Menu commands interface
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-30
 */
public interface MenuCommand<T> {

    void execute(T context);
}
