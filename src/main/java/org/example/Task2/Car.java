package org.example.Task2;

public class Car {
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    public Car(String name) {
        this.name = name;

    }

}
