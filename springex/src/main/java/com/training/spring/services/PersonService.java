package com.training.spring.services;

import org.springframework.stereotype.Service;

import com.training.spring.Person;

@Service
public class PersonService {

    public String add(final Person person) {
        return "SUCCESS";
    }

    public Person getPerson(final Long personId) {
        Person personLoc = new Person();
        personLoc.setAge(personId.intValue());
        personLoc.setName("ali");
        personLoc.setSurname("veli");
        return personLoc;
    }


}
