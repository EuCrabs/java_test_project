package com.company;

public class Calculator {
    static double multiply(double a, double b) {
        return a * b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double div(double a, double b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    static double subt(double a, double b) {
        return a - b;
    }

}