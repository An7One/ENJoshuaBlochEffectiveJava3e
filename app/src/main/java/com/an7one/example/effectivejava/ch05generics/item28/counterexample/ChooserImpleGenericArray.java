package com.an7one.example.effectivejava.ch05generics.item28.counterexample;

import com.an7one.example.effectivejava.util.Constant;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@SuppressWarnings(Constant.WARNING.UNUSED)
public class ChooserImpleGenericArray<T> {
    private final T[] choiceArray;

    public ChooserImpleGenericArray(Collection<T> choices){
        // compile error: Object[] cannot be converted to T[]
        // this.choiceArray = choices.toArray();

        /*
         * warning: unchecked cast
         *
         * runtime exception: ClassCastException
         *
         * [recap]: element type information is erased from generics at runtime
         */
        this.choiceArray = (T[])choices.toArray();
    }

//    public Object choose() {
//        Random rnd = ThreadLocalRandom.current();
//        return choiceArray[rnd.nextInt(choiceArray.length)];
//    }
}
