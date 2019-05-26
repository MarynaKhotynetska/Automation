package com.skillup.automation.Lesson2;

public class Calculator {

    public int divide(int a, int b) {
        int result;
        try {
            result = a / b;

        } catch (ArithmeticException e) {
            throw e;
        }

        return result;
    }
}
