package com.shop.domain.printer;

import com.shop.domain.Account;
import com.shop.domain.Customer;
import com.shop.domain.Person;
import com.shop.util.TablePrinter;

import java.util.List;

/**
 * Print accounts into table format
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-30
 */
public final class AccountTablePrinter extends TablePrinter<Account> {

    public AccountTablePrinter(int[] columnsWidth) {
        super(columnsWidth, 4);
    }

    @Override
    protected void buildHeader(StringBuilder builder) {
        builder.append(field("Name", columnsWidth[0])).append("|")
                .append(field("Tax ID", columnsWidth[1])).append("|")
                .append(field("Phone Numbers", columnsWidth[2])).append("|")
                .append(field("Active", columnsWidth[3])).append("|")
                .append('\n')
                .append(repeat("-", tableWidth()))
                .append('\n');
    }

    @Override
    protected void buildRows(List<Account> list, StringBuilder builder) {
        for (Account account : list) {
            Customer customer = account.getCustomer();
            builder.append(field(customer.getName(), columnsWidth[0])).append("|")
                    .append(field(customer.getTaxId(), columnsWidth[1])).append("|")
                    .append(field(buildPhoneNumber(customer), columnsWidth[2])).append("|")
                    .append(field(String.valueOf(customer.isActive()), columnsWidth[3])).append("|")
                    .append('\n');
        }
    }

    private String buildPhoneNumber(Customer customer) {
        String phoneNumber = "";
        if (!customer.getPhoneNumbers().isEmpty()) {
            phoneNumber = customer.getPhoneNumbers().get(0);
            phoneNumber += "(" + (customer.getPhoneNumbers().size() - 1) + ")";
        }
        return phoneNumber;
    }
}
