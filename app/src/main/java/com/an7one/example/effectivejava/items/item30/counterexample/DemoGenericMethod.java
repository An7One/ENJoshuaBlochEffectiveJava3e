package com.an7one.example.effectivejava.items.item30.counterexample;

import com.an7one.example.effectivejava.util.Constant;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;

@SuppressWarnings(Constant.WARNING.UNUSED)
public class DemoGenericMethod {
    public static <E extends Comparable<E>> E max(Collection<E> c) {
        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }
        // to return Optional.ofNullable(result);
        return result;
    }

    public void demo() {
        long i1 = 3;
        Long l1 = i1;

        long i2 = 4;
        Long l2 = i2;

        long i3 = 5;
        Long l3 = i3;

        var nums = Set.of(i1, i2, i3);
        var nums2 = Set.of(l1, l2, l3);
        var res = max(nums);
        var res2 = max(nums2);

        System.out.println(res);
        System.out.println(res2);
    }
}
