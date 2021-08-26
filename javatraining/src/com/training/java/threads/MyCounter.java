package com.training.java.threads;


public class MyCounter {

    private long counter = 0;

    public void increase() {
        synchronized (this) {
            this.counter++;
        }
    }

    public long getCounter() {
        synchronized (this) {
            return this.counter;
        }
    }

}
