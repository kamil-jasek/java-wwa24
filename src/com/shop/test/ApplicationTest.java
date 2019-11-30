package com.shop.test;

final class ApplicationTest {

    public static void main(String[] args) {
        System.out.println("Running application tests...");
        TestRunner runner = new TestRunner(
                new PersonTest(),
                new PersonTablePrinterTest(),
                new CustomerTest(),
                new DiscountPolicyTest(),
                new OrderTest(),
                new AccountTest(),
                new IOTest(),
                new CreateAccountMenuCommandTest());
        runner.runTests();
    }
}
