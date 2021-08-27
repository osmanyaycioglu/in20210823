package com.training.spring.data;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.training.spring.Person;


public interface IPersonDao extends CrudRepository<Person, Long> {

    List<Person> findByName(String name);

    List<Person> findBySurname(String surname);

    List<Person> findByNameAndSurname(String name,
                                      String surname);

    List<Person> findByNameIn(List<String> name);

    List<Person> findByNameInOrderByNameAsc(List<String> name);

    @Query("select p from Person p where p.name=?1")
    List<Person> searchByName(String name);

    @Query("select p from Person p where p.name=:isim")
    List<Person> searchByName2(@Param("isim") String name);

    @Query("select p from Person p where p.name=?1 and p.surname=?2")
    List<Person> searchByNameAndSurname(String name,
                                        String surname);

    @Query(value = "select * from persontable p where p.name=?1", nativeQuery = true)
    List<Person> searchByNameNative(String name);

}

