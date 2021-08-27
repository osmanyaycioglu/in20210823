package com.training.spring.di;

//@Component
//@Qualifier("grTR")
public class GreetTr implements IGreet {


    @Override
    public String greet(final String nameParam) {
        return "Merhaba " + nameParam;
    }

}
