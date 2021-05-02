package com.an7one.example.effectivejava.ch04classesandinterfaces.item18.bycomposition;

import java.util.*;

/**
 * The disadvantages of wrapper classes are few.
 * One caveat is that wrapper classes are not suited for use in callback frameworks,
 * wherein objects pass self-reference to other objects for subsequent invocations(callbacks).
 * <p>
 * Because a wrapped object does NOT know of its wrapper,
 * it passes a reference to itself(this),
 * and callbacks elude the wrapper.
 * This is known as SELF problem.
 *
 * @param <E>
 */
class InstrumentedHashSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    InstrumentedHashSet(Set<E> set) {
        super(set);
    }

    @Override
    public boolean add(E e) {
        ++addCount;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        addCount += collection.size();
        return super.addAll(collection);
    }

    public int getAddCount() {
        return addCount;
    }
}
