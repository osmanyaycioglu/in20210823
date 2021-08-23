package com.training.java.common;


public class CarRunner {

    private final IArac arac;

    public CarRunner(final int index) {
        this.arac = CarFactory.createArac(index);
    }

    public void goToSpot() {
        this.arac.goForward();
        this.arac.turnLeft();
    }

    public static void main(final String[] args) {
        String stringLoc = "osman";
        Integer intVal = 10;

        Car carLoc = new Car(100);
        //carLoc.setHorsePower(100);

        IArac arac = new Car(100);

        arac.goForward();
        arac.turnLeft();
        System.out.println("------------------------------------");
        CarRunner carRunnerLoc = new CarRunner(4);
        carRunnerLoc.goToSpot();


    }
}
