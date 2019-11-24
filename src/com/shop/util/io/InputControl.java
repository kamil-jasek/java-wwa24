package com.shop.util.io;

import java.math.BigDecimal;

/**
 * Input system
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-24
 */
public interface InputControl {

    String text();
    int integer();
    BigDecimal decimal();
    boolean bool();
}
