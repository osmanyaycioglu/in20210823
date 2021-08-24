package com.training.java.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonParser {

    public static void main(final String[] args) throws Exception {
        //        FileReader f;
        //        BufferedReader b = new BufferedReader(f);
        //        String lineLoc = null;
        //        while((lineLoc = b.readLine()) != null) {
        //
        //        }
        Map<String, Person> collectLoc = Files.readAllLines(Paths.get("persons.txt"))
                                              .stream()
                                              .map(line -> line.split(","))
                                              .map(parts -> {
                                                  Person personLoc = new Person();
                                                  personLoc.setName(parts[0]);
                                                  personLoc.setSurname(parts[1]);
                                                  personLoc.setWeight(Integer.parseInt(parts[2]));
                                                  personLoc.setHeight(Integer.parseInt(parts[3]));
                                                  personLoc.setUsername(parts[4]);
                                                  return personLoc;
                                              })
                                              .filter(p -> p.getWeight() > 90)
                                              .collect(Collectors.toMap(p -> p.getUsername(),
                                                                        p -> p));

        Map<String, Person> collectLoc2 = Files.readAllLines(Paths.get("persons.txt"))
                                               .stream()
                                               .map(line -> line.split(","))
                                               .map(parts -> new Person(parts[0],
                                                                        parts[1],
                                                                        Integer.parseInt(parts[2]),
                                                                        Integer.parseInt(parts[3]),
                                                                        parts[4]))
                                               .filter(p -> p.getWeight() > 90)
                                               .collect(Collectors.toMap(p -> p.getUsername(),
                                                                         p -> p));

        Map<String, Person> collectLoc3 = Files.readAllLines(Paths.get("persons.txt"))
                                               .stream()
                                               .map(line -> line.split(","))
                                               .map(parts -> new Person().setName(parts[0])
                                                                         .setSurname(parts[1])
                                                                         .setWeight(Integer.parseInt(parts[2]))
                                                                         .setHeight(Integer.parseInt(parts[3]))
                                                                         .setUsername(parts[4]))
                                               .filter(p -> p.getWeight() > 90)
                                               .collect(Collectors.toMap(p -> p.getUsername(),
                                                                         p -> p));

        Map<String, Person> collectLoc4 = Files.readAllLines(Paths.get("persons.txt"))
                                               .stream()
                                               .map(line -> line.split(","))
                                               .map(PersonParser::createPerson)
                                               .filter(p -> p.getWeight() > 90)
                                               .collect(Collectors.toMap(p -> p.getUsername(),
                                                                         p -> p));
        System.out.println(collectLoc4);
    }

    public static Person createPerson(final String[] parts) {
        return new Person().setName(parts[0])
                           .setSurname(parts[1])
                           .setWeight(Integer.parseInt(parts[2]))
                           .setHeight(Integer.parseInt(parts[3]))
                           .setUsername(parts[4]);
    }

}
