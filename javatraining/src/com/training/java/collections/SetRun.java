package com.training.java.collections;

import java.util.HashSet;
import java.util.Set;

import com.training.java.streams.Person;

public class SetRun {

    public static void main(final String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("istanbul");
        cities.add("istanbul");
        cities.add("istanbul");
        cities.add("istanbul");
        cities.add("adana");
        cities.add("adana");
        cities.add("adana");
        cities.add("adana");
        cities.add("ankara");

        System.out.println(cities);

        Set<Person> persons = new HashSet<>();
        persons.add(new Person().setName("osman")
                                .setSurname("yay")
                                .setUsername("osdhjsdf")
                                .setHeight(200)
                                .setWeight(90));
        persons.add(new Person().setName("osman")
                                .setSurname("yay")
                                .setUsername("osdhjsdf")
                                .setHeight(200)
                                .setWeight(90));
        persons.add(new Person().setName("osman")
                                .setSurname("yay")
                                .setUsername("osdhjsdf")
                                .setHeight(200)
                                .setWeight(90));
        System.out.println(persons);

        Person p1 = new Person().setName("osman")
                                .setSurname("yay")
                                .setUsername("osdhjsdf")
                                .setHeight(200)
                                .setWeight(90);
        Person p2 = new Person().setName("osman")
                                .setSurname("yay")
                                .setUsername("osdhjsdf")
                                .setHeight(200)
                                .setWeight(90);
        if (p1.equals(p2)) {
            System.out.println("Eşit");
        } else {
            System.out.println("Eşit Değil");
        }

        Set<String> firstSet = new HashSet<>();
        firstSet.add("1");
        firstSet.add("2");
        firstSet.add("3");
        firstSet.add("4");
        firstSet.add("5");
        firstSet.add("6");
        firstSet.add("7");
        Set<String> secondSet = new HashSet<>();
        secondSet.add("5");
        secondSet.add("6");
        secondSet.add("7");
        secondSet.add("8");
        secondSet.add("9");
        secondSet.add("10");
        secondSet.add("11");

        //firstSet.addAll(secondSet);
        //firstSet.retainAll(secondSet);
        firstSet.removeAll(secondSet);
        System.out.println(firstSet);
        boolean containsLoc = firstSet.contains("1");
        System.out.println("1 var mı yok mu = " + containsLoc);
        for (String stringLoc : secondSet) {
            System.out.println(stringLoc);
        }
    }
}
