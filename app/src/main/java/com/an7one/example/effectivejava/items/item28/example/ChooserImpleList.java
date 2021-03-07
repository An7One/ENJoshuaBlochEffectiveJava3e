package com.an7one.example.effectivejava.items.item28.example;

import com.an7one.example.effectivejava.util.Constant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * a tad more verbose, perhaps a tad slower,
 *  but it is worth it for the peace of mind that you will NOT get <code>ClassCastException</code> at runtime
 *
 * @param <T>
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
public class ChooserImpleList<T> {
    private final List<T> choiceList;

    public ChooserImpleList(Collection<T> choices) {
        this.choiceList = new ArrayList<>(choices);
    }

    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}
