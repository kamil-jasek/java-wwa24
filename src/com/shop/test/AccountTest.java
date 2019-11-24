package com.shop.test;

import com.shop.domain.*;

/**
 * Account tests.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-24
 */
final class AccountTest {

    void testCreateAccount() {
        Customer customer = new Company("ADIDAS", new VatNumber("PL1234567890"));
        Account account = new Account(customer);
        assert account.getOrders().isEmpty() : "Invalid orders list";

        DiscountPolicy discountPolicy = new FixedDiscountPolicy(0.4F);
        account.addOrder(new Order(discountPolicy));
        assert account.getOrders().size() == 1 : "Invalid orders list";

        assert account.getCustomer() != null : "Invalid customer";
    }
}
