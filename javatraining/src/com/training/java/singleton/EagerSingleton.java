package com.training.java.singleton;


public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    static {
        System.out.println("instance yaratılıyor");
    }

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return EagerSingleton.instance;
    }

    public void sayHello(final String name) {
        System.out.println("Hello " + name);
    }

}
