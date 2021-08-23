package com.training.java.streams;


public class Person {

    private String name;
    private String surname;
    private int    weight;

    public Person() {
    }


    public Person(final String nameParam) {
        super();
        this.name = nameParam;
    }


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

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(final int weightParam) {
        this.weight = weightParam;
    }


    @Override
    public String toString() {
        return "Person [name=" + this.name + ", surname=" + this.surname + ", weight=" + this.weight + "]";
    }


}
