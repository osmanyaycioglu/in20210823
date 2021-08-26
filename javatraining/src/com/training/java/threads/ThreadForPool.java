package com.training.java.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadForPool extends Thread {

    // public static BlockingQueue<Runnable> executorQueue = new PriorityBlockingQueue<>();
    // DelayQueue<> re = new DelayQueue<>();
    public static BlockingQueue<Runnable> executorQueue = new ArrayBlockingQueue<>(1000);

    @Override
    public void run() {
        while (true) {
            try {
                Runnable takeLoc = ThreadForPool.executorQueue.take();
                // ThreadForPool.executorQueue.poll(10, TimeUnit.SECONDS);
                takeLoc.run();
            } catch (Exception eLoc) {
                eLoc.printStackTrace();
            }
        }
    }

}
