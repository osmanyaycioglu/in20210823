package com.training.java.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolRun {

    public static void main(final String[] args) throws InterruptedException, ExecutionException {
        ExecutorService newFixedThreadPoolLoc = Executors.newFixedThreadPool(10);
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            newFixedThreadPoolLoc.execute(() -> System.out.println("Hello world : "
                                                                   + Thread.currentThread()
                                                                           .getName()));
        }
        // Future Interface
        //        Future<String> submitLoc = newFixedThreadPoolLoc.submit(() -> "Hello world"
        //                                                                      + Thread.currentThread()
        //                                                                              .getName());
        Future<String> submitLoc = newFixedThreadPoolLoc.submit(new MyCallable());

        System.out.println("Another line");
        if (submitLoc.isDone()) {
            String stringLoc = submitLoc.get();
        }
        System.out.println("Another line");
        System.out.println("Another line");
        System.out.println("Another line");

        String stringLoc = submitLoc.get();
        System.out.println(stringLoc);

        ScheduledExecutorService newScheduledThreadPoolLoc = Executors.newScheduledThreadPool(5);
        newScheduledThreadPoolLoc.scheduleWithFixedDelay(() -> System.out.println("Hello world Schedule : "
                                                                                  + Thread.currentThread()
                                                                                          .getName()),
                                                         5,
                                                         5,
                                                         TimeUnit.SECONDS);

        // String stringLoc = submitLoc.get(1, TimeUnit.SECONDS);

        Thread.sleep(2_000);

        //        for (int iLoc = 0; iLoc < 10; iLoc++) {
        //            ThreadForPool forPoolLoc = new ThreadForPool();
        //            forPoolLoc.start();
        //        }
        //        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
        //            ThreadForPool.executorQueue.add(() -> System.out.println("Hello world 2 : "
        //                                                                     + Thread.currentThread()
        //                                                                             .getName()));
        //        }

    }
}
