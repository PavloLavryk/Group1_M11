package org.example.Task5;


import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("1", "3", "5");
        Stream<String> second = Stream.of("2", "4", "6", "7", "8");
        StreamZipper<String> zipper = new StreamZipper<>(first, second);
        zipper.zip().forEach(System.out::println);
    }
}