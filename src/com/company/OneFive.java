package com.company;

import java.util.Scanner;

public class OneFive {
    static Scanner console = new Scanner(System.in);
    static String[] strings = new String[6];

    static void strings() {
        for (int i = 0; i < 6; i++) {
            strings[i] = console.nextLine();
        }

        for (int i = 0; i < 6; i++) {
            String temp = strings[i];
            for (int j = i + 1; j < 6; j++) {
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
