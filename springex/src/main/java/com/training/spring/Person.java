package com.training.spring;


public class Person {

    private Long    personId;
    private String  name;
    private String  surname;
    private Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(final Integer ageParam) {
        this.age = ageParam;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personIdParam) {
        personId = personIdParam;
    }


}
