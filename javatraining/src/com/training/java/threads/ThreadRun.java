package com.training.java.threads;

import java.util.concurrent.CountDownLatch;

public class ThreadRun {

    public static long counter = 0;

    public static void main(final String[] args) {
        MyThread[] myThreadsLoc = new MyThread[10];
        MyCounter counterLoc = new MyCounter();
        CountDownLatch countDownLatchLoc = new CountDownLatch(10);

        //        Semaphore semaphoreLoc = new Semaphore(5);
        //        semaphoreLoc.acquire();
        //        // Code
        //        semaphoreLoc.release();


        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            myThreadsLoc[iLoc] = new MyThread(counterLoc,
                                              countDownLatchLoc);
            myThreadsLoc[iLoc].setName("Runner-" + iLoc);
            myThreadsLoc[iLoc].start();
            // myThreadsLoc[iLoc].interrupt();
        }
        try {
            countDownLatchLoc.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));
        System.out.println("Counter : " + ThreadRun.counter);
        System.out.println("Counter : " + counterLoc.getCounter());
        long total = 0;
        for (MyThread myThreadLoc : myThreadsLoc) {
            total += myThreadLoc.getLocalMyCounter()
                                .getCounter();
        }
        System.out.println("Local Counter : " + total);
    }
}
