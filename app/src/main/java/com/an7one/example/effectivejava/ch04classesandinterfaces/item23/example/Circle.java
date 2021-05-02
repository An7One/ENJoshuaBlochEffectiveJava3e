package com.an7one.example.effectivejava.ch04classesandinterfaces.item23.example;

import com.an7one.example.effectivejava.util.Constant;

@SuppressWarnings(Constant.WARNING.UNUSED)
class Circle extends Figure {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * (radius * radius);
    }
}
