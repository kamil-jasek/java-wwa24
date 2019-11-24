package com.shop.test;

import com.shop.util.io.InputControl;
import com.shop.util.io.ScannerInputControl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigDecimal;

/**
 * Input/Output system tests
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-24
 */
final class IOTest {

    void testScannerInputControl() {
        String userInput =
                "test\n" +
                "123\n" +
                "23,00\n" +
                "true";
        InputControl control = new ScannerInputControl(
                new ByteArrayInputStream(userInput.getBytes()));

        assert control.text().equals("test") : "Invalid text";
        assert control.integer() == 123 : "Invalid number";
        assert control.decimal().compareTo(new BigDecimal("23.00")) == 0
                : "Invalid decimal";
        assert control.bool() : "Invalid boolean";
    }
}
