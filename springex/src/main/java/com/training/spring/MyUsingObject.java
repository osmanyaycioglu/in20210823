package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component

//@Controller
//@Service
//@Repository
//@Configuration

//@Scope("prototype")
public class MyUsingObject {

    private int      counter = 0;

    @Autowired
    private MyObject myObject;

    public String hello(final String name) {
        this.counter++;
        return this.myObject.sayHello(name) + " Thanks " + this.counter;
    }

    public MyObject getMyObject() {
        return this.myObject;
    }

    public void setMyObject(final MyObject myObjectParam) {
        this.myObject = myObjectParam;
    }


}
