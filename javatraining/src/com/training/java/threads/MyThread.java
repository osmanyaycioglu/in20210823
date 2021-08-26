package com.training.java.threads;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {

    private final MyCounter      counter;

    private final MyPureCounter  localMyCounter = new MyPureCounter();

    private final CountDownLatch countDownLatch;

    boolean                      shutdown       = false;

    public MyThread(final MyCounter counterParam,
                    final CountDownLatch countDownLatchParam) {
        super();
        this.counter = counterParam;
        this.countDownLatch = countDownLatchParam;
    }


    @Override
    public void run() {
        //        while (!shutdown) {
        //            try {
        //
        //            } catch (Exception eLoc) {
        //            }
        //        }
        for (long iLoc = 0; iLoc < 5_000_000L; iLoc++) {
            // this.localMyCounter.increase();
            this.counter.increase();
            if (this.isInterrupted()) {
                System.out.println("Interrupted");
                break;
            }
            // ThreadRun.counter++;
        }
        this.countDownLatch.countDown();
    }


    public MyPureCounter getLocalMyCounter() {
        return this.localMyCounter;
    }

}
