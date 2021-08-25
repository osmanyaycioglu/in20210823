package com.training.java.singleton;


public class SingletonRun {

    public static void main(final String[] args) {
        EagerSingleton.getInstance()
                      .sayHello("osman");

        LazySingleton.getInstance()
                     .sayHello("osman");

        EnumSingleton.INSTANCE1.sayHello("osman");
        EnumSingleton.INSTANCE2.sayHello("osman");
        EnumSingleton.INSTANCE3.sayHello("osman");

    }
}
