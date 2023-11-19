package org.example.Task2;

import java.util.Arrays;
import java.util.List;

public class PrintCar {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Tesla"),
                new Car("BMW"),
                new Car("Audi"),
                new Car("Ford"),
                new Car("Honda")
        );
        List<String> sortedCarNames = new Sort().SortCars(cars);
        System.out.println(sortedCarNames);
    }
}
