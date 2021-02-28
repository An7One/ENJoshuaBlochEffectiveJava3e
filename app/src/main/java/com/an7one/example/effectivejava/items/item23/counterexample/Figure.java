package com.an7one.example.effectivejava.items.item23.counterexample;

import com.an7one.example.effectivejava.util.Constant;

@SuppressWarnings(Constant.WARNING.UNUSED)
class Figure {
    enum Shape {RECTANGLE, CIRCLE}

    // tag field - the shape of this figure
    final Shape shape;

    // these fields are used only if the shape is a RECTANGLE
    double length;
    double width;

    // this field is used only if the shape is a CIRCLE
    double radius;

    // the constructor for CIRCLE
    Figure(double radius) {
        this.shape = Shape.CIRCLE;
        this.radius = radius;
    }

    // the constructor for RECTANGLE
    Figure(double length, double width) {
        this.shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch (shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}
