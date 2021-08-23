package com.training.java.lambda;


public class GreetingExample {

    private final String name;

    public GreetingExample(final String nameParam) {
        super();
        this.name = nameParam;
    }

    public void greet(final IGreet greet) {
        System.out.println(greet.greet(this.name));
    }
}
