package com.company;

public class Calculator {
    static double multiply(double a, double b) {
        double c = a * b;
        if (c % 2 == 0) {
            c = 5;
        }
        return c;
    }
}