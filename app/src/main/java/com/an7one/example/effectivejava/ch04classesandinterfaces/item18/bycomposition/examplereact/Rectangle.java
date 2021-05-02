package com.an7one.example.effectivejava.ch04classesandinterfaces.item18.bycomposition.examplereact;

public class Rectangle {
    private final int width;
    private final int length;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }

    public int getArea(){
        return width * length;
    }
}
