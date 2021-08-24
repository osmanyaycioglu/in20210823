package com.training.java.streams;


public class Person {

    private String name;
    private String surname;
    private int    weight;
    private int    height;
    private String username;

    public Person() {
    }

    public Person(final String nameParam) {
        super();
        this.name = nameParam;
    }


    public Person(final String nameParam,
                  final String surnameParam,
                  final int weightParam,
                  final int heightParam,
                  final String usernameParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.weight = weightParam;
        this.height = heightParam;
        this.username = usernameParam;
    }

    public String getName() {
        return this.name;
    }

    public Person setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public String getSurname() {
        return this.surname;
    }

    public Person setSurname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

    public int getWeight() {
        return this.weight;
    }

    public Person setWeight(final int weightParam) {
        this.weight = weightParam;
        return this;
    }


    public int getHeight() {
        return this.height;
    }


    public Person setHeight(final int heightParam) {
        this.height = heightParam;
        return this;
    }


    public String getUsername() {
        return this.username;
    }


    public Person setUsername(final String usernameParam) {
        this.username = usernameParam;
        return this;
    }


    @Override
    public String toString() {
        return "Person [name=" + this.name + ", surname=" + this.surname + ", weight=" + this.weight + "]";
    }


}
