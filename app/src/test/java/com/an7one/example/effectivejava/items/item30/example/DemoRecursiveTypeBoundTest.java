package com.an7one.example.effectivejava.items.item30.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

class DemoRecursiveTypeBoundTest {

    @Test
    void sampleInput_AsList_ShouldReturnExpected() {
        List<Long> input = Arrays.asList(1L, 2L, 3L);
        long expected = 3L;

        Assertions.assertEquals(expected, DemoRecursiveTypeBound.max(input));
    }

    @Test
    void sampleInput_AsSet_ShouldReturnExpected() {
        Set<Long> input = Set.of(1L, 2L, 3L);
        long expected = 3L;

        Assertions.assertEquals(expected, DemoRecursiveTypeBound.max(input));
    }
}