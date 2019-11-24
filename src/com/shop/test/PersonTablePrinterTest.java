package com.shop.test;

import com.shop.domain.Person;
import com.shop.util.PersonTablePrinter;

import java.util.Arrays;

/**
 * Tests for PersonTablePrinter.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-17
 */
final class PersonTablePrinterTest {

    void testCreatePersonTablePrinter() {
        PersonTablePrinter printer = new PersonTablePrinter(new int[] {10, 16, 8});
        assert printer != null : "Cannot create person table printer";
    }

    void testPrintPersonTable() {
        PersonTablePrinter printer = new PersonTablePrinter(new int[] {10, 16, 8});
        String table = printer.print(Arrays.asList(
                new Person("Kamil", "Jasek"),
                new Person("Jan", "Nowak")
        ));
        String expectedString =
                "Full Name | Phone Numbers  | Active |\n" +
                "-------------------------------------\n" +
                "Kamil J...|                |  true  |\n" +
                "Jan Nowak |                |  true  |\n";
        assert expectedString.equals(table) : "Table format is wrong";
    }
}
