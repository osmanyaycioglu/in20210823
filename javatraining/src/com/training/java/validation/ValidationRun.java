package com.training.java.validation;

import com.training.java.streams.Person;

public class ValidationRun {

    public static void main(final String[] args) {
        Person personLoc = new Person("osman",
                                      "yaycioglu",
                                      95,
                                      200,
                                      "osmany");
        try {
            ValidationEngine.validate(personLoc);
            System.out.println("Validated...");
        } catch (ValidationException e) {
            e.printStackTrace();
        }

    }
}
