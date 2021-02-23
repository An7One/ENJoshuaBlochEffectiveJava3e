package com.an7one.example.effectivejava.items.item18.bycomposition.examplebird;

public class Bird {
    public void chirp(){
        System.out.println("[Parent]Bird is chirping");
    }

    public void fly(){
        System.out.println("[Parent]Bird is flying");
    }

    public void run(){
        System.out.println("[Parent]Bird is running");
    }
}
