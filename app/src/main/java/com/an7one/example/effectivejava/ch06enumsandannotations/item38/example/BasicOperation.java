package com.an7one.example.effectivejava.ch06enumsandannotations.item38.example;

import com.an7one.example.effectivejava.util.Constant;

@SuppressWarnings(Constant.WARNING.UNUSED)
public enum BasicOperation implements Operation {
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },

    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },

    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
