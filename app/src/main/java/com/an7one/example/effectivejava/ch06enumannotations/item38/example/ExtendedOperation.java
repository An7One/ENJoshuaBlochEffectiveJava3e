package com.an7one.example.effectivejava.ch06enumannotations.item38.example;

import com.an7one.example.effectivejava.util.Constant;

/**
 * Emulated extension enum
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
public enum ExtendedOperation implements Operation {
    EXP("^") {
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMAINDER("%") {
        public double apply(double x, double y) {
            return x % y;
        }
    };

    private final String symbol;

    ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
