package com.an7one.example.effectivejava.items.item18.bycomposition.examplebird;

public class Canary {
    private Bird bird;
    public Canary(Bird bird){
       this.bird = bird;
    }

    public void chirp(){
        bird.chirp();

        System.out.println("Canary is chirping");
    }

    public void fly(){
        bird.fly();

        System.out.println("Canary is flying");
    }
}
