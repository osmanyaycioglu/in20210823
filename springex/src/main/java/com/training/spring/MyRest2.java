package com.training.spring;

import java.io.Serializable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/rest2")
@RequestScope
public class MyRest2 implements Serializable {

    int counter = 0;

    @GetMapping("/h")
    public String name() {
        return "Hello " + this.counter++;
    }

}
