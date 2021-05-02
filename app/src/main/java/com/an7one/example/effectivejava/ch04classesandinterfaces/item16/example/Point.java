package com.an7one.example.effectivejava.ch04classesandinterfaces.item16.example;

import com.an7one.example.effectivejava.util.Constant;

@SuppressWarnings(Constant.WARNING.UNUSED)
class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
