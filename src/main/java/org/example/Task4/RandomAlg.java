package org.example.Task4;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

public class RandomAlg {
    public static void main(String[] args) {


    long a = 25214903917L;
    long c = 11L;
    long m = (long) Math.pow(2, 48);
    long seed = 1L;

        Stream<Long> randomNumberStream = Stream.iterate(seed, x -> (a * x + c) % m);
        randomNumberStream.forEach(System.out::println);

    }
}