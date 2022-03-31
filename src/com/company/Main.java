package com.company;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Vesta", "SW");
        String voice = lada.sound();

//        System.out.println("You chose " + lada.model + " " + lada.type + " and it sounds like: " + voice);

        double res = Calculator.add(2,4);
        double res2 = Calculator.div(5,345);
        double res3 = Calculator.subt(1,101);

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}
