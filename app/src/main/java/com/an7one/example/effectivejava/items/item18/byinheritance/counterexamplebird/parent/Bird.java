package com.an7one.example.effectivejava.items.item18.byinheritance.counterexamplebird.parent;

public class Bird {
    public void chirp() {
        System.out.println("[Parent]Bird is chirping");
    }

    /**
     * unnecessarily expose implementations details to "ostrich"
     */
    public void fly() {
        System.out.println("[Parent]Bird is flying");
    }

    /**
     * unnecessarily expose implementations details to "canary"
     */
    public void run() {
        System.out.println("[Parent]Bird is running");
    }
}
