package com.an7one.example.effectivejava.ch02createdestroyobjects.item03.example;

import com.an7one.example.effectivejava.util.Constant;

/**
 * Singleton with public final field
 * <p>
 * two main advantages:
 * 1. public static field is final, so it always contains the same object reference
 * 2. it is simpler
 * <p>
 * Nothing that a client does can change this, with one caveat:
 * a privileged client can invoke the private constructor reflectively (item 65),
 * with the aid of `AccessibleObject.setAccessible` method.
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
public class ElvisSingleton1 {

    public static final ElvisSingleton1 INSTANCE = new ElvisSingleton1();

    private ElvisSingleton1() {

    }

    public void leaveTheBuilding() {

    }
}
