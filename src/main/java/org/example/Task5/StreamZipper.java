package org.example.Task5;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

class StreamZipper<T> {
    private final Stream<T> first;
    private final Stream<T> second;

    public StreamZipper(Stream<T> first, Stream<T> second) {
        this.first = first;
        this.second = second;
    }

    public Stream<T> zip() {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Iterable<T> iterable = () -> new Iterator<T>() {
            boolean turn = false;

            @Override
            public boolean hasNext() {
                if (turn) {
                    return secondIterator.hasNext();
                } else {
                    return firstIterator.hasNext();
                }
            }

            @Override
            public T next() {
                if (turn) {
                    turn = false;
                    return secondIterator.next();
                } else {
                    turn = true;
                    return firstIterator.next();
                }
            }
        };

        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
