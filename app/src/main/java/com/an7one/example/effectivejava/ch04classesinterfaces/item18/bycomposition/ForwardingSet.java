package com.an7one.example.effectivejava.ch04classesinterfaces.item18.bycomposition;

import java.util.*;

/**
 * Decorator Pattern
 * loosely referred to as "delegate"
 *
 * @param <E>
 */
class ForwardingSet<E> implements Set<E> {
    private final Set<E> set;

    /**
     * flexible constructor injection
     *
     * @param set any collection implementing the Set interface
     */
    public ForwardingSet(Set<E> set) {
        this.set = set;
    }

    public void clear() {
        set.clear();
    }

    public boolean contains(Object obj) {
        return set.contains(obj);
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public int size() {
        return set.size();
    }

    public Iterator<E> iterator() {
        return set.iterator();
    }

    public boolean add(E e) {
        return set.add(e);
    }

    public boolean remove(Object obj) {
        return set.remove(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return set.containsAll(collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return set.addAll(collection);
    }

    public boolean removeAll(Collection<?> collection) {
        return set.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return set.retainAll(collection);
    }

    public Object[] toArray() {
        return set.toArray();
    }

    public <T> T[] toArray(T[] arr) {
        return set.toArray(arr);
    }

    @Override
    public boolean equals(Object obj) {
        return set.equals(obj);
    }

    @Override
    public int hashCode() {
        return set.hashCode();
    }

    @Override
    public String toString() {
        return set.toString();
    }
}
