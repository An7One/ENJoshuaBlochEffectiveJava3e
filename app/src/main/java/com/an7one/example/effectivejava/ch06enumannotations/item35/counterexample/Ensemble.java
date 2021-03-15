package com.an7one.example.effectivejava.ch06enumannotations.item35.counterexample;

import com.an7one.example.effectivejava.util.Constant;

/**
 * Do NOT do this:
 * abuse of ordinal to derive an associated value
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
public enum Ensemble {
    SOLO, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusicians() {
        return 1 + ordinal();
    }
}
