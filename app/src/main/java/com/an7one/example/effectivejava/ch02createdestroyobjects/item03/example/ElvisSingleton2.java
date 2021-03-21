package com.an7one.example.effectivejava.ch02createdestroyobjects.item03.example;

import com.an7one.example.effectivejava.util.Constant;

/**
 * Singleton with static factory
 * <p>
 * main advantages:
 * 1. without changing its API, one can change the singleton to other design patterns
 * 2. to be able to write a generic singleton factory if it is required
 * 3. a method reference can be used as a supplier
 * <p>
 * Unless one of these advantages is relevant, the public field approach is preferable.
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
public class ElvisSingleton2 {
    private static final ElvisSingleton2 INSTANCE = new ElvisSingleton2();

    public static ElvisSingleton2 getInstance() {
        return INSTANCE;
    }

    private ElvisSingleton2() {

    }

    public void leaveTheBuilding() {

    }
}
