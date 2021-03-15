package com.an7one.example.effectivejava.ch02createdestroyobjects.item03.example.fakeapi;

public class FakeDB {
    public static FakeConnection getConnection() {
        return new FakeConnection();
    }
}
