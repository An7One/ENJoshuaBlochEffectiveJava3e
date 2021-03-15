package com.an7one.example.effectivejava.ch02createdestroyobjects.item03.example;

import com.an7one.example.effectivejava.util.Constant;

@SuppressWarnings(Constant.WARNING.UNUSED)
public class Elvis {
    // static factory method
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {

    }

    public void leaveTheBuilding() {

    }
}
