package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.di.IGreet;
import com.training.spring.di.Language;

@RestController
@RequestMapping("/rest")
public class MyRest {

    @Autowired
    private MyUsingObject muo;

    @Autowired
    @Qualifier("grDYN")
    private IGreet        greet;

    @Autowired
    private Language      lang;

    @Autowired
    @Qualifier("langGreet")
    private IGreet        langGreet;


    @GetMapping("/hello")
    public String hello() {
        return this.muo.hello("osman");
    }

    @GetMapping("/greet")
    public String greet() {
        return this.greet.greet("osman");
    }

    @GetMapping("/lang")
    public String lang() {
        return this.lang.getHelloStr();
    }

    @GetMapping("/lg")
    public String lang2() {
        return this.langGreet.greet("osman");
    }

}
