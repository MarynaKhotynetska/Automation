package com.skillup.automation;

public class Car {

    public String name;
    public String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        Car CarBMW = new Car("BMW","Red");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
