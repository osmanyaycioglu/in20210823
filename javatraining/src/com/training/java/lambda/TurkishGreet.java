package com.training.java.lambda;


public class TurkishGreet implements IGreet {

    private final int value;


    public TurkishGreet(final int valueParam) {
        super();
        this.value = valueParam;
    }


    @Override
    public String greet(final String nameParam) {
        if (this.value > 20) {
            return "Merhaba " + nameParam + " bey";
        }
        return "Merhaba " + nameParam;
    }

}
