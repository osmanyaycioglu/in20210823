package com.training.java.threads;

import java.util.concurrent.atomic.AtomicLong;

public class MyAtomicCounter extends MyCounter {

    private final AtomicLong counter = new AtomicLong();

    @Override
    public void increase() {
        this.counter.incrementAndGet();
    }

    @Override
    public long getCounter() {
        return this.counter.get();
    }

}
