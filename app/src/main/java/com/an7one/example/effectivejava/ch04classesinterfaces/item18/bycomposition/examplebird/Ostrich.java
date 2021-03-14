package com.an7one.example.effectivejava.ch04classesinterfaces.item18.bycomposition.examplebird;

public class Ostrich {
    private Bird bird;

    public Ostrich(Bird bird) {
        this.bird = bird;
    }

    public void chirp() {
        bird.chirp();

        System.out.println("Canary is chirping");
    }

    public void run() {
        bird.run();

        System.out.println("Canary is running");
    }
}
