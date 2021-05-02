package com.an7one.example.effectivejava.ch04classesandinterfaces.item23.example;

import com.an7one.example.effectivejava.util.Constant;

/**
 * That the fields int he hierarchy are accessed directly rather that by accessor methods,
 * which is done for brevity on purpose, but NOT recommended (item 16)
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}
