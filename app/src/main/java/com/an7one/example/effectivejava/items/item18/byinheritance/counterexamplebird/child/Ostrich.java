package com.an7one.example.effectivejava.items.item18.byinheritance.counterexamplebird.child;

import com.an7one.example.effectivejava.items.item18.byinheritance.counterexamplebird.parent.Bird;

public class Ostrich extends Bird {

    @Override
    public void chirp(){
        super.chirp();

        System.out.println("[Child]Ostrich is chirping");
    }

    @Override
    public void run(){
        super.run();

        System.out.println("[Child]Ostrich is running");
    }
}
