package com.an7one.example.effectivejava.items.item28.counterexample;

import com.an7one.example.effectivejava.util.Constant;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@SuppressWarnings(Constant.WARNING.UNUSED)
public class ChooserImpleArray {
    private final Object[] choiceArray;

    public ChooserImpleArray(Collection choices) {
        // Runtime error, incompatible types: Object[] cannot be converted to T[]
        this.choiceArray = choices.toArray();
    }

    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }
}
