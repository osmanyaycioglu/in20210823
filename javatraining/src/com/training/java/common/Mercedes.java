package com.training.java.common;


public class Mercedes extends Car {

    public Mercedes() {
        super(125);
        System.out.println("Mercedes");
    }

    @Override
    public void turnLeft() {
        System.out.println("Mercedes sola dönüyor");
    }
}
