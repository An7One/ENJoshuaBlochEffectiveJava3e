package com.an7one.example.effectivejava.ch04classesandinterfaces.item18.byinheritance.counterexamplebird.child;

import com.an7one.example.effectivejava.ch04classesandinterfaces.item18.byinheritance.counterexamplebird.parent.Bird;

public class Canary extends Bird {
    @Override
    public void chirp(){
        super.chirp();

        System.out.println("[Child]Canary is chirping");
    }

    @Override
    public void fly(){
        super.fly();

        System.out.println("[Child]Canary is chirping");
    }
}
