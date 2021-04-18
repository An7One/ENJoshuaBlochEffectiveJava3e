package com.an7one.example.effectivejava.ch08methods.item52.counterexample;

import com.an7one.example.effectivejava.util.Constant;

import java.math.BigInteger;
import java.util.*;

@SuppressWarnings(Constant.WARNING.UNUSED)
public class CollectionClassifier {
    public static String classify(Set<?> s) {
        return "Set";
    }

    public static String classify(List<?> list) {
        return "list";
    }

    public static String classify(Collection<?> collection) {
        return "collection";
    }

    public static void main(String[] args) {
        Collection<?>[] collections = { new HashSet<String>(), new ArrayList<BigInteger>(),
                new HashMap<String, String>().values() };

        for (Collection<?> collection : collections)
            System.out.println(classify(collection));
    }
}
