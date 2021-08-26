package com.training.java.threads;


public class MyPureCounter {

    private long counter = 0;

    public void increase() {
        if ((this.counter % 400_000) == 0) {
            try {
                Thread.sleep(1);
            } catch (Exception eLoc) {
            }
        }
        this.counter++;
    }

    public long getCounter() {
        return this.counter;
    }

}
