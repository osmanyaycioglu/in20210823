package com.training.java.threads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyLockCounter extends MyCounter {

    private long                         counter = 0;
    //private final ReentrantLock lock    = new ReentrantLock();
    private final ReentrantReadWriteLock lock    = new ReentrantReadWriteLock();
    private final Map<String, String>    maop    = new ConcurrentHashMap<>();

    @Override
    public void increase() {

        try {
            this.lock.writeLock()
                     .lock();
            //            this.lock.tryLock(1,
            //                              TimeUnit.SECONDS);
            this.counter++;
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {
            this.lock.writeLock()
                     .unlock();
        }
    }

    @Override
    public long getCounter() {
        try {
            this.lock.readLock()
                     .lock();
            //            this.lock.tryLock(1,
            //                              TimeUnit.SECONDS);
            return this.counter;
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
            return this.counter;
        } finally {
            this.lock.readLock()
                     .unlock();
        }
    }
}
