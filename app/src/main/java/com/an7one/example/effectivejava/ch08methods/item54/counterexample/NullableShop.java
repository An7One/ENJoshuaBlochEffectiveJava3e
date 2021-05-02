package com.an7one.example.effectivejava.ch08methods.item54.counterexample;

import com.an7one.example.effectivejava.ch08methods.item54.model.Cheese;
import com.an7one.example.effectivejava.util.Constant;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings(Constant.WARNING.UNUSED)
public class NullableShop {
    private final List<Cheese> cheeseInStock;

    public NullableShop(List<Cheese> cheeseInStock) {
        this.cheeseInStock = cheeseInStock;
    }

    public List<Cheese> getCheese() {
        // Do NOT do this
        // to return `null` to indicate an empty collection
        return cheeseInStock.isEmpty() ? null : new ArrayList<>(cheeseInStock);
    }
}
