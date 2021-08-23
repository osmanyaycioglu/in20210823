package com.training.java.common;


public class Mazda extends Car {

    public Mazda() {
        super(115);
        System.out.println("Mazda");
    }

    @Override
    public void turnLeft() {
        System.out.println("Mazda sola dönüyor");
    }
}
