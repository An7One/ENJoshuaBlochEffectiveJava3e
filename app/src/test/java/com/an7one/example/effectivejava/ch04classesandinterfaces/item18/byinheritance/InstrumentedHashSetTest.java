package com.an7one.example.effectivejava.ch04classesandinterfaces.item18.byinheritance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class InstrumentedHashSetTest {

    @Test
    void Test() {
        var input = Arrays.asList("Snap", "Crackle", "Pop");
        final int SIZE_INPUT = input.size();

        var instrumentedHashSet = new InstrumentedHashSet<String>();
        instrumentedHashSet.addAll(input);
        final int SIZE_SET = instrumentedHashSet.size();
        final int COUNT = instrumentedHashSet.getAddCount();

        assertEquals(SIZE_INPUT, SIZE_SET);
        assertEquals(2 * SIZE_INPUT, COUNT);
    }
}
