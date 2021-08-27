package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

import com.training.spring.di.IGreet;
import com.training.spring.di.Language;

@RestController
@RequestMapping("/rest")
//@RequestScope
//@SessionScope
@ApplicationScope
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
    public String hello(@RequestParam("isim") final String name) {
        return this.muo.hello(name);
    }

    @GetMapping("/hello2/{isim}")
    public String hello2(@PathVariable("isim") final String name) {
        return this.muo.hello(name);
    }

    @PostMapping("/hello3")
    public String hello2(@RequestBody final Person person) {
        return this.muo.hello(person.getName() + " " + person.getSurname());
    }

    @PostMapping("/hello4")
    public Person xyz(@RequestBody final Person person) {
        person.setSurname("yaycıoğlu");
        return person;
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
