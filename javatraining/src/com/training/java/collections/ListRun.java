package com.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListRun {

    //private final List<String> myListLoc = new ArrayList<>();
    //private final List<String> myListLoc = new Vector<>();
    private final List<String> myListLoc = Collections.synchronizedList(new ArrayList<>());

    public void method() {
        this.myListLoc.add("osman");
        this.myListLoc.add("ali");
        this.myListLoc.add("veli");
        String stringLoc = this.myListLoc.get(0);
        int sizeLoc = this.myListLoc.size();

    }

    public static void main(final String[] args) throws InterruptedException {
        List<String> myListLoc = new ArrayList<>(1_200_000);
        //List<String> myListLoc = new LinkedList<>();
        //        myListLoc.add("osman");
        //        myListLoc.add("ali");
        //        myListLoc.add("veli");

        System.gc();
        Thread.sleep(3_000);

        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            myListLoc.add("testStr-1");
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            myListLoc.get(iLoc);
        }
        System.out.println("Get Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        //        Iterator<String> iteratorLoc = myListLoc.iterator();
        //        while (iteratorLoc.hasNext()) {
        //            String stringLoc = (String) iteratorLoc.next();
        //
        //        }
        for (String stringLoc : myListLoc) {

        }
        System.out.println("Gezme Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 10_000; iLoc++) {
            myListLoc.remove(10_000);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));

        String stringLoc = myListLoc.get(0);

        int sizeLoc = myListLoc.size();


    }
}
