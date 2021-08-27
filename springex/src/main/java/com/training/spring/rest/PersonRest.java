package com.training.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.Person;
import com.training.spring.services.PersonService;

@RestController
@RequestMapping("/api/v1/person/provision")
public class PersonRest {

    @Autowired
    private PersonService ps;

    @PostMapping("/add")
    public String add(@RequestBody final Person person) {
        return this.ps.add(person);
    }

    @GetMapping("/get")
    public Person getPerson(@RequestParam("pid") final Long personId) {
        return this.ps.getPerson(personId);
    }

}
