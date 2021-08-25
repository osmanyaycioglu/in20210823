package com.training.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.training.java.streams.Person;

public class MapRun {

    public static void main(final String[] args) {
        // Map<String, Person> personMap = new HashMap<>();
        Map<String, Person> personMap = new ConcurrentHashMap<>(1_600_000,
                                                                0.9f,
                                                                1_600);

        //        personMap.put(null,
        //                      new Person().setName("osman")
        //                                  .setSurname("yay")
        //                                  .setUsername("osmanyay")
        //                                  .setHeight(200)
        //                                  .setWeight(90));
        //        personMap.put(null,
        //                      new Person().setName("ali")
        //                                  .setSurname("yay")
        //                                  .setUsername("osmanyay")
        //                                  .setHeight(200)
        //                                  .setWeight(90));
        //        personMap.put(null,
        //                      new Person().setName("veli")
        //                                  .setSurname("yay")
        //                                  .setUsername("osmanyay")
        //                                  .setHeight(200)
        //                                  .setWeight(90));

        personMap.put("osmanyay",
                      new Person().setName("osman")
                                  .setSurname("yay")
                                  .setUsername("osmanyay")
                                  .setHeight(200)
                                  .setWeight(90));
        personMap.put("aliyay",
                      new Person().setName("ali")
                                  .setSurname("yay")
                                  .setUsername("aliyay")
                                  .setHeight(200)
                                  .setWeight(90));

        personMap.put("ayşeyay",
                      new Person().setName("ali")
                                  .setSurname("yay")
                                  .setUsername("aliyay")
                                  .setHeight(200)
                                  .setWeight(90));

        Person personLoc = personMap.get("aliyay");

        System.out.println(personLoc);

        Set<String> keySetLoc = personMap.keySet();
        for (String keyLoc : keySetLoc) {
            Person personFromMapLoc = personMap.get(keyLoc);
            System.out.println(personFromMapLoc);
        }

        Collection<Person> valuesLoc = personMap.values();
        for (Person person2Loc : valuesLoc) {
            System.out.println(person2Loc);
        }

        Set<Entry<String, Person>> entrySetLoc = personMap.entrySet();
        for (Entry<String, Person> entryLoc : entrySetLoc) {
            String keyLoc = entryLoc.getKey();
            Person valueLoc = entryLoc.getValue();
        }
        Map<Integer, String> mapStr = new HashMap<>();
        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            mapStr.put(iLoc,
                       "osman");
        }
        System.out.println("Put Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            mapStr.get(iLoc);
        }
        System.out.println("Get Delta : " + (System.currentTimeMillis() - delta));

        Collection<String> values2Loc = mapStr.values();
        delta = System.currentTimeMillis();
        for (String stringLoc : values2Loc) {

        }
        System.out.println("Gezme Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            mapStr.remove(iLoc);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));


    }
}
