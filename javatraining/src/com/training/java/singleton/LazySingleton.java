package com.training.java.singleton;


public class LazySingleton {

    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (LazySingleton.instance == null) {
            synchronized (LazySingleton.class) {
                if (LazySingleton.instance == null) {
                    LazySingleton.instance = new LazySingleton();
                }
            }
        }
        return LazySingleton.instance;
    }

    public void sayHello(final String name) {
        System.out.println("Hello " + name);
    }

}
