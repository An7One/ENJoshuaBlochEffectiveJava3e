package com.an7one.example.effectivejava.items.item18.bycomposition.examplereact;

public class Square {
    private final Rectangle rectangle;

    public Square(int length){
        this.rectangle = new Rectangle(length, length);
    }

    public Square(Rectangle rectangle){
        this.rectangle = rectangle;
    }

    public int getArea(){
        return rectangle.getArea();
    }
}
