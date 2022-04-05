package com.company;

import java.util.Arrays;

public class OneEight {
    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    static void classArrays() {
        String first = Arrays.toString(strings);
        String second = Arrays.toString(ints);

        System.out.println(first);
        System.out.println(second);
    }
}
