package com.an7one.example.effectivejava.ch02createdestroyobjects.item03.example;

import com.an7one.example.effectivejava.util.Constant;

@SuppressWarnings(Constant.WARNING.UNUSED)
public class DemoApp {
    public void Demo() {
        ElvisSingleton1.INSTANCE.leaveTheBuilding();

        ElvisSingleton2.getInstance().leaveTheBuilding();
    }
}
