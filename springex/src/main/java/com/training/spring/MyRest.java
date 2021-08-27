package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyRest {

    @Autowired
    private MyUsingObject muo;

    @GetMapping("/hello")
    public String hello() {
        return this.muo.hello("osman");
    }

}
