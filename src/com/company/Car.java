package com.company;

public class Car {
    // Variables
    String model;
    String type;

    // constructor
    Car (String model, String type) {
        this.model = model;
        this.type = type;
    }

    String sound() {
        return "Вр.... Вррррр...";
    }
}
