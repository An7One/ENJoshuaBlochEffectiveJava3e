/**
 * Parent Class, Template Method Pattern Demo
 * <p>
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods.
 * <p>
 * Reference:
 * https://www.tutorialspoint.com/design_pattern/template_pattern.htm#:~:text=In%20Template%20pattern%2C%20an%20abstract,defined%20by%20an%20abstract%20class.
 */
package com.an7one.example.effectivejava.ch07lambdasandstreams.item44.absoleteexample.templatepatterndemo.game;

import com.an7one.example.effectivejava.util.Constant;

@SuppressWarnings(Constant.WARNING.UNUSED)
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    // template method
    public final void play() {
        // to initialize the game
        initialize();

        // to start the game
        startPlay();

        // to end the game
        endPlay();
    }
}
