package com.an7one.example.effectivejava.items.item18.bycomposition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

public class InstrumentedHashSetTest {

    @Test
    void TestSampleInput_ShouldReturnExpected() {
        var seed = new HashSet<String>();

        var input = Arrays.asList("Snap", "Crackle", "Pop");
        final int SIZE_INPUT = input.size();

        var instrumentedHashSet = new InstrumentedHashSet<>(seed);
        instrumentedHashSet.addAll(input);

        final int SIZE_SET = instrumentedHashSet.size();
        final int COUNT = instrumentedHashSet.getAddCount();

        assertEquals(SIZE_INPUT, SIZE_SET);
        assertEquals(SIZE_INPUT, COUNT);
    }
}
