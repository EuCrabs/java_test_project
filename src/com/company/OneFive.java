package com.company;

import java.util.Scanner;

public class OneFive {
    static Scanner console = new Scanner(System.in);
    static String[] strings = {"Hello", "Hello", "World", "Java", "Task", "World"};

    static void strings() {
        for (int i = 0; i < strings.length; i++) {
            String temp = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (temp == null) {
                    break;
                }
                if (temp.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
            System.out.println(strings[i]);
        }
    }
}
