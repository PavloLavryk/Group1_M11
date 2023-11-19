package org.example.Task2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public List<String> SortCars(List<Car> cars) {
        List<String> carNames = cars.stream()
                .map(car -> car.getName().toUpperCase())
                .collect(Collectors.toList());
        Collections.sort(carNames, Collections.reverseOrder());
        carNames.forEach(System.out::println);
        return carNames;
    }
}
