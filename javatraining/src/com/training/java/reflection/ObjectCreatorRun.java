package com.training.java.reflection;

import com.training.java.annotations.MyObject;
import com.training.java.streams.Person;

public class ObjectCreatorRun {

    public static void main(final String[] args) {
        try {
            MyObject objectLoc = ObjectCreator.create(MyObject.class);
            System.out.println(objectLoc);
            Person createLoc = ObjectCreator.create(Person.class);
            System.out.println(createLoc);
            MyObject myObject2Loc = new MyObject();
            myObject2Loc.setName("osman");
            // myObject2Loc.setSurname("yay");
            MyObject myObjectLoc = ObjectCreator.createFromObj(myObject2Loc);
            System.out.println(myObjectLoc);

            Person personLoc = new Person();
            if ((personLoc.getName() == null)
                || personLoc.getName()
                            .isEmpty()) {
                personLoc.setName("boş");
            }
            //            personLoc.setName("osman");
            //            personLoc.setSurname("yay");
            Person personLast = ObjectCreator.createFromObj(personLoc);
            System.out.println(personLast);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
