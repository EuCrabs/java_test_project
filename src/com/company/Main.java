package com.company;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Vesta", "SW");
        String voice = lada.sound();

        System.out.println("You chose " + lada.model + " " + lada.type + " and it sounds like: " + voice);
    }
}
