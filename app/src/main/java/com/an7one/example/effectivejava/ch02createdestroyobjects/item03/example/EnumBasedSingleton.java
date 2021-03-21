package com.an7one.example.effectivejava.ch02createdestroyobjects.item03.example;

import com.an7one.example.effectivejava.ch02createdestroyobjects.item03.example.fakeapi.FakeConnection;
import com.an7one.example.effectivejava.ch02createdestroyobjects.item03.example.fakeapi.FakeDB;
import com.an7one.example.effectivejava.util.Constant;

/**
 * a single-element `enum` type is often the best way to implement a single
 * <p>
 * one cannot use this approach if the singleton must extend a superclass other than `Enum`,
 * though one can declare an enum to implement interface.
 * <p>
 * `enum`s in Java are `final` by default
 * https://www.programiz.com/java-programming/enum-inheritance
 * <p>
 * Reference:
 * https://howtodoinjava.com/java/enum/is-enum-really-best-for-singletons/
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
enum EnumBasedSingleton {
    INSTANCE;

    private final FakeConnection connection;

    EnumBasedSingleton() {
        connection = FakeDB.getConnection();
    }

    public static EnumBasedSingleton getInstance() {
        return INSTANCE;
    }

    public FakeConnection getConnection() {
        return connection;
    }
}
