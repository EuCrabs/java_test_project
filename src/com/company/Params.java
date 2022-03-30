package com.company;

public class Params {
    // here is a whole list of variables
    // byte stores whole numbers from -128 to 127 (1 byte)
    byte byte_min = -128;
    byte byte_max = 127;

    // short stores whole numbers from -32,768 to 32,767 (2 bytes)
    short short_min = -32768;
    short short_max = 32767;

    // int stores whole numbers from -2,147,483,648 to 2,147,483,647 (4 bytes)
    int int_min = -2147483648;
    int int_max = 2147483647;

    // long stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (8 bytes)
    long long_min = -9223372036854775808L;
    long long_max = 9223372036854775807L;

    // float stores fractional numbers, sufficient for storing 6 to 7 decimal digits (4 bytes)
    float float_num = -100000000.1234534985734875638f;

    // double stores fractional numbers, sufficient for storing 15 decimal digits (8 bytes)

    // boolean stores true or false values (1 bit)
    boolean b_true = true;
    boolean b_false = false;

    // Char stores a single character/letter or ASCII values
    char char_a = 'A';
    char char_b = 66;

    // String is a non-primitive data type
    String str = "Hello World!";

    //Java Type Casting
    //Widening
    int intToDouble = 9;
    double w_casting = intToDouble;

    //Narrowing
    double doubleToInt = 9.09;
    int n_casting = (int) doubleToInt;
}
