package com.training.java.lambda;


public class EnglishGreet implements IGreet {

    private final int value;


    public EnglishGreet(final int valueParam) {
        super();
        this.value = valueParam;
    }

    @Override
    public String greet(final String nameParam) {
        if (this.value > 20) {
            return "Hello sir " + nameParam;
        }
        return "Hello " + nameParam;
    }

}
