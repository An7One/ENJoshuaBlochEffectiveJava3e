package com.an7one.example.effectivejava.ch04classesandinterfaces.item18.byinheritance.counterexamplereact;

public class Square extends Rectangle{
    public Square(int length){
        super(length, length);
    }

    public int getArea(){
        return super.getArea();
    }
}
