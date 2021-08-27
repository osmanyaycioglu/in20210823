package com.training.spring;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class MyObject implements Serializable {

    public String sayHello(final String name) {
        return "Hello " + name;
    }

}
