package com.training.java.common;


public class Car extends Object implements IArac {

    private String model;
    private int    horsePower;
    private int    topSpeed;


    public Car(final int horsePowerParam) {
        this.horsePower = horsePowerParam;
        this.topSpeed = horsePowerParam * 2;
    }

    @Override
    public void goForward() {
        System.out.println("Going forward : " + this.topSpeed);
    }

    @Override
    public void goBack() {
        System.out.println("Going back");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("Turning right");
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(final String modelParam) {
        this.model = modelParam;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(final int horsePowerParam) {
        if (horsePowerParam < 10) {
            throw new IllegalArgumentException("Horse power 10 dan küçük olamaz");
        }
        this.horsePower = horsePowerParam;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public void setTopSpeed(final int topSpeedParam) {
        this.topSpeed = topSpeedParam;
    }


}
