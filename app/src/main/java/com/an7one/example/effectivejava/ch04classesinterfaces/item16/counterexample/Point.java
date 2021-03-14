package com.an7one.example.effectivejava.ch04classesinterfaces.item16.counterexample;

import com.an7one.example.effectivejava.util.Constant;

/**
 * Because the data fields of such classes are accessed directly,
 * these classes do not offer benefits of encapsulation.
 * <p>
 * One cannot change the representation without changing the API,
 * (cannot) enforce invariants,
 * and (cannot) take auxiliary action when a field is accessed.
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
class Point {
    public double x;
    public double y;
}
