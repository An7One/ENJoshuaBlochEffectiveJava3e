package com.an7one.example.effectivejava.items.item18.bycomposition;

import java.util.*;

public class InstrumentedHashSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumentedHashSet(Set<E> set) {
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
