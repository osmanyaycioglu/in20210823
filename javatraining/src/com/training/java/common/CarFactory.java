package com.training.java.common;


public class CarFactory {

    public static IArac createArac(final int index) {
        switch (index) {
            case 1:
                return new BMW();
            case 2:
                return new Car(100);
            case 3:
                return new Car(50);
            case 4:
                return new Mercedes();
            case 5:
                return new Mazda();
            default:
                return new Car(20);
        }
    }

}
