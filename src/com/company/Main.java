package com.company;

public class Main {

    public static void main(String[] args) {
	// here is a whole list of variables
        // byte stores whole numbers from -128 to 127 (1 byte)
        byte byte_min = -128;
        byte byte_max = 127;
        System.out.println("Min value for byte = " + byte_min);
        System.out.println("Max value for byte = " + byte_max);
        System.out.println();

        // short stores whole numbers from -32,768 to 32,767 (2 bytes)
        short short_min = -32768;
        short short_max = 32767;
        System.out.println("Min value for short = " + short_min);
        System.out.println("Max value for short = " + short_max);
        System.out.println();

        // int stores whole numbers from -2,147,483,648 to 2,147,483,647 (4 bytes)
        int int_min = -2147483648;
        int int_max = 2147483647;
        System.out.println("Min value for int = " + int_min);
        System.out.println("Max value for int = " + int_max);
        System.out.println();

        // long stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (8 bytes)
        long long_min = -9223372036854775808L;
        long long_max = 9223372036854775807L;
        System.out.println("Min value for long = " + long_min);
        System.out.println("Max value for long = " + long_max);
        System.out.println();

        // float stores fractional numbers, sufficient for storing 6 to 7 decimal digits (4 bytes)
        float float_num = -100000000.1234534985734875638f;
        System.out.println("Example value for float = " + float_num);
        System.out.println();

        // double stores fractional numbers, sufficient for storing 15 decimal digits (8 bytes)
        double double_num = 12345.12d;
        System.out.println("Example value for double = " + double_num);
        System.out.println();

        // boolean stores true or false values (1 bit)
        boolean b_true = true;
        boolean b_false = false;
        System.out.println("Boolean is true = " + b_true);
        System.out.println("Boolean is false = " + b_false);
        System.out.println();

        // Char stores a single character/letter or ASCII values
        char char_a = 'A';
        char char_b = 66;
        System.out.println("Char 1 = " + char_a);
        System.out.println("Char 2 = " + char_b);
        System.out.println();

        // String is a non-primitive data type
        String str = "Hello World!";
        System.out.println(str);
    }
}
