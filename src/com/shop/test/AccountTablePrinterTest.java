package com.shop.test;

import com.shop.domain.Account;
import com.shop.domain.Company;
import com.shop.domain.Person;
import com.shop.domain.VatNumber;
import com.shop.domain.printer.AccountTablePrinter;
import com.shop.util.PersonTablePrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Tests for PersonTablePrinter.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-17
 */
final class AccountTablePrinterTest {

    void testCreateAccountTablePrinter() {
        AccountTablePrinter printer = new AccountTablePrinter(new int[] {10, 14, 16, 8});
        assert printer != null : "Cannot create account table printer";
    }

    void testPrintAccountTable() {
        AccountTablePrinter printer = new AccountTablePrinter(new int[] {10, 14, 16, 8});

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(new Person("Kamil", "Jasek")));
        accounts.add(new Account(new Company("ABC", new VatNumber("PL1234567890"))));
        String table = printer.print(accounts);
        String expectedString =
                "   Name   |    Tax ID    | Phone Numbers  | Active |\n" +
                "----------------------------------------------------\n" +
                "Kamil J...|      -       |                |  true  |\n" +
                "   ABC    | PL1234567890 |                |  true  |\n";
        assert expectedString.equals(table) : "Table format is wrong";
    }
}
