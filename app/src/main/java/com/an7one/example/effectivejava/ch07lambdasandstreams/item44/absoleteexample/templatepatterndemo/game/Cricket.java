/**
 * Child Class, Template Method Pattern Demo
 * <p>
 * Reference:
 * https://www.tutorialspoint.com/design_pattern/template_pattern.htm#:~:text=In%20Template%20pattern%2C%20an%20abstract,defined%20by%20an%20abstract%20class.
 */
package com.an7one.example.effectivejava.ch07lambdasandstreams.item44.absoleteexample.templatepatterndemo.game;

import com.an7one.example.effectivejava.util.Constant;

@SuppressWarnings(Constant.WARNING.UNUSED)
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized!");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Ended!");
    }
}
