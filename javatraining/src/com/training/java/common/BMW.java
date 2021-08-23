package com.training.java.common;


public class BMW extends Car {

    public BMW() {
        super(150);
        System.out.println("fddfg");
    }

    @Override
    public void turnLeft() {
        System.out.println("BMW sola dönüyor");
    }
}
