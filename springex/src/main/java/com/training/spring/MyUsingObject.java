package com.training.spring;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import com.training.spring.di.IGreet;


@Component

//@Controller
//@Service
//@Repository
//@Configuration

//@Scope("prototype")
@ApplicationScope
public class MyUsingObject implements Serializable {

    private static final long serialVersionUID = -1225766601930637145L;

    private int               counter          = 0;

    @Autowired
    private MyObject          myObject;

    private final IGreet      greet;

    private IGreet            greet2;

    @Autowired
    public MyUsingObject(@Qualifier("grDYN") final IGreet greetParam) {
        this.greet = greetParam;
    }

    @Autowired
    public void methodInj(@Qualifier("grDYN") final IGreet greetParam) {
        this.greet2 = greetParam;
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void dest() {
        System.out.println("destroy");
    }

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

    public IGreet getGreet() {
        return this.greet;
    }


}
