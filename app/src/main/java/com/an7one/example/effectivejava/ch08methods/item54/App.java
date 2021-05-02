package com.an7one.example.effectivejava.ch08methods.item54;

import com.an7one.example.effectivejava.ch08methods.item54.counterexample.NullableShop;
import com.an7one.example.effectivejava.ch08methods.item54.example.Shop;
import com.an7one.example.effectivejava.ch08methods.item54.model.Cheese;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // fake data source
        List<Cheese> cheesesDataSource = Arrays.asList(Cheese.CHEDDAR, Cheese.STILTON);

        // counter example
        NullableShop nullableShop = new NullableShop(cheesesDataSource);
        List<Cheese> cheese1 = nullableShop.getCheese();

        // this sort of circumlocution is requires in nearly every used of a method that returns `null`
        // in place of an empty collection or array
        if (cheese1 != null && cheese1.contains(Cheese.STILTON))
            System.out.println();

        // good examples
        Shop shop = new Shop(cheesesDataSource);
        List<Cheese> cheeseList = shop.getCheeses();
        Cheese[] cheeseArray = shop.getCheesesArrayOptimized();
    }
}
