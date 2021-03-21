package com.an7one.example.effectivejava.ch06enumsandannotations.item38.example;

// Emulated extensible enum using an interface
public interface Operation {
    double apply(double x, double y);
}
