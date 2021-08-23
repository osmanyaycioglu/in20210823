package com.training.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamRun {

    public static void main(final String[] args) {
        List<String> asListLoc = Arrays.asList("osman",
                                               "ali",
                                               "ayşe",
                                               "fatma",
                                               "veli",
                                               "mehmet",
                                               "osman",
                                               "ali",
                                               "onur");

        Set<String> unique = new HashSet<>();
        List<String> sorted = new ArrayList<>();
        for (String stringLoc : asListLoc) {
            if (stringLoc.length() > 4) {
                if (!unique.contains(stringLoc)) {
                    sorted.add(stringLoc);
                    unique.add(stringLoc);
                }
            }
        }
        Collections.sort(sorted);
        for (String stringLoc : sorted) {
            System.out.println("List : " + stringLoc);
        }

        asListLoc.forEach(d -> System.out.println("List : " + d));
        System.out.println("----------------------------------------------");
        asListLoc.stream()
                 .filter(o -> o.length() > 4)
                 .distinct()
                 .sorted()
                 .forEach(d -> System.out.println("Stream : " + d));
        System.out.println("----------------------------------------------");
        Set<String> collectLoc = asListLoc.parallelStream()
                                          .skip(2)
                                          .limit(5)
                                          .peek(s -> System.out.println("Thread : "
                                                                        + Thread.currentThread()
                                                                                .getName()
                                                                        + " Data : "
                                                                        + s))
                                          .collect(Collectors.toSet());
        collectLoc.forEach(System.out::println);
        System.out.println("----------------------------------------------");
        Map<String, Person> collect2Loc = asListLoc.stream()
                                                   .distinct()
                                                   .map(f -> new Person(f))
                                                   .filter(y -> y.getName()
                                                                 .length() > 4)
                                                   .peek(s -> System.out.println("Bug : " + s))
                                                   .collect(Collectors.toMap(p -> p.getName(),
                                                                             p -> p));

        Optional<String> findAnyLoc = asListLoc.stream()
                                               .findAny();
        String orElseLoc = findAnyLoc.orElse("boş");

        long countLoc = asListLoc.stream()
                                 .count();


        IntStream mapToIntLoc = asListLoc.stream()
                                         .mapToInt(s -> s.length());
        IntSummaryStatistics summaryStatisticsLoc = mapToIntLoc.summaryStatistics();
        System.out.println(summaryStatisticsLoc);

    }

}
