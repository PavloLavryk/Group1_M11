package org.example.Task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayNumberSort {
    public static void main(String[] args) {
        String [] array = {"1, 2, 0", "4, 5"};
        String result = Arrays.stream(array)
                .flatMap(s-> Arrays.stream(s.split(", ")))
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));
        System.out.println(result);

    }
}
