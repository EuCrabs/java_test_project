package com.company;

public class OneSixSeven {
    public static int[][] MULTIPLICATION_TABLE;
    public static int[][] result = new int[10][];

    static void multiplication() {
        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
                System.out.print(MULTIPLICATION_TABLE[i - 1][j - 1]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void rect() {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
