package com.training.spring.di;

//@Component
////@Primary
//@Qualifier("grESP")
public class GreetEsp implements IGreet {

    @Override
    public String greet(final String nameParam) {
        return "Ola " + nameParam;
    }

}
