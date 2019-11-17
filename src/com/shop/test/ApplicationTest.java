package com.shop.test;

class ApplicationTest {

    public static void main(String[] args) {
        System.out.println("Running application tests...");
        TestRunner runner = new TestRunner(new PersonTest(), new PersonTablePrinterTest());
        runner.runTests();
    }
}
