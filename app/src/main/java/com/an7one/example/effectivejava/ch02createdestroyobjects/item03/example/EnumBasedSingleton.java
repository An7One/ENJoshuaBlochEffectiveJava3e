package com.an7one.example.effectivejava.ch02createdestroyobjects.item03.example;

import com.an7one.example.effectivejava.ch02createdestroyobjects.item03.example.fakeapi.FakeConnection;
import com.an7one.example.effectivejava.ch02createdestroyobjects.item03.example.fakeapi.FakeDB;
import com.an7one.example.effectivejava.util.Constant;

/**
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
