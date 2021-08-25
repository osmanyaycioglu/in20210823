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

            MyObject myObjectLoc = ObjectCreator.createFromObj(new MyObject());
            System.out.println(myObjectLoc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
