package com.an7one.example.effectivejava.ch08methods.item54.example;

import com.an7one.example.effectivejava.ch08methods.item54.model.Cheese;
import com.an7one.example.effectivejava.util.Constant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings(Constant.WARNING.UNUSED)
public class Shop {
    private final List<Cheese> cheeseInStock;

    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

    public Shop(List<Cheese> cheeseInStock) {
        this.cheeseInStock = cheeseInStock;
    }

    // the right way to return a possibly empty collection
    public List<Cheese> getCheeses() {
        return new ArrayList<>(cheeseInStock);
    }

    // optimization - to avoid allocating empty collections
    public List<Cheese> getCheesesOptimized() {
        return cheeseInStock.isEmpty() ? Collections.emptyList()
                : new ArrayList<>(cheeseInStock);
    }

    // the right way to return a possibly empty array
    public Cheese[] getCheessesArray() {
        return cheeseInStock.toArray(new Cheese[0]);
    }

    // to pass the same empty array into every `toArray` call
    public Cheese[] getCheesesArrayOptimized() {
        return cheeseInStock.toArray(EMPTY_CHEESE_ARRAY);
    }

    // do NOT do this
    // do NOT preallocate the array passed to `toArray` with the hope of improving performances
    public Cheese[] getCheeseArrayPreallocated() {
        return cheeseInStock.toArray(new Cheese[cheeseInStock.size()]);
    }
}
