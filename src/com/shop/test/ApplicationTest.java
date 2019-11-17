package com.shop.test;

public class ApplicationTest {

    public static void main(String[] args) {
        System.out.println("Running application tests...");
        TestRunner runner = new TestRunner(new PersonTest());
        runner.runTests();
    }
}
