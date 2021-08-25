package com.training.java.streams;

import com.training.java.annotations.MyAnnotation;

public class Person extends Object {

    private String name;
    private String surname;
    private int    weight;
    private int    height;
    @MyAnnotation
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
        return "Person [name="
               + this.name
               + ", surname="
               + this.surname
               + ", weight="
               + this.weight
               + ", height="
               + this.height
               + ", username="
               + this.username
               + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + this.height;
        result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
        result = (prime * result) + ((this.surname == null) ? 0 : this.surname.hashCode());
        result = (prime * result) + ((this.username == null) ? 0 : this.username.hashCode());
        result = (prime * result) + this.weight;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        if (this.height != other.height) {
            return false;
        }
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!this.name.equals(other.name)) {
            return false;
        }
        if (this.surname == null) {
            if (other.surname != null) {
                return false;
            }
        } else if (!this.surname.equals(other.surname)) {
            return false;
        }
        if (this.username == null) {
            if (other.username != null) {
                return false;
            }
        } else if (!this.username.equals(other.username)) {
            return false;
        }
        if (this.weight != other.weight) {
            return false;
        }
        return true;
    }


}
