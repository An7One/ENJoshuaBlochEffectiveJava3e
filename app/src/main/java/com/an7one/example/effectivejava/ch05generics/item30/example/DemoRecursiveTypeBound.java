package com.an7one.example.effectivejava.ch05generics.item30.example;

import java.util.Collection;
import java.util.Objects;

public class DemoRecursiveTypeBound {
    /**
     * the type bound <code><E extends Comparable<E>></code> reads as
     * "any type E that can be compared to itself",
     * which corresponds more or less precisely to the notion of mutual comparability
     *
     * @param c   the collection during which to find the maximum
     * @param <E> the (generic) type of input
     * @return tha maximum element
     */
    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty())
            // better to return an Optional<E>, item 55
            throw new IllegalArgumentException("Empty collection");

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        }

        return result;
    }
}
