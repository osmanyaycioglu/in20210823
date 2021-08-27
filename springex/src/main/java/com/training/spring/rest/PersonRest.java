package com.training.spring.rest;

import java.util.List;

import javax.validation.Valid;

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
    public String add(@Valid @RequestBody final Person person) {
        return this.ps.add(person);
    }

    @GetMapping("/get")
    public Person getPerson(@RequestParam("pid") final Long personId) {
        return this.ps.getPerson(personId);
    }

    @GetMapping("/getbyname")
    public List<Person> getPerson(@RequestParam("name") final String name) {
        return this.ps.getPersonsByName(name);
    }

}
