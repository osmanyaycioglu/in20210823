package com.training.spring;

import org.springframework.stereotype.Component;

@Component
public class MyObject {

    public String sayHello(final String name) {
        return "Hello " + name;
    }

}
