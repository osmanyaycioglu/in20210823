package com.training.spring.di;

//@Component
////@Primary
//@Qualifier("grENG")
public class GreetEng implements IGreet {

    @Override
    public String greet(final String nameParam) {
        return "Hello " + nameParam;
    }

}
