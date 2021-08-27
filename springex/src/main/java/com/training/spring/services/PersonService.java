package com.training.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.Person;
import com.training.spring.data.IPersonDao;

@Service
public class PersonService {

    @Autowired
    private IPersonDao iPersonDao;

    public String add(final Person person) {
        this.iPersonDao.save(person);
        return "SUCCESS";
    }

    public Person getPerson(final Long personId) {
        Optional<Person> personLoc = this.iPersonDao.findById(personId);
        return personLoc.orElse(null);
    }

    public List<Person> getPersonsByName(final String personName) {
        return this.iPersonDao.findByName(personName);
    }


}
