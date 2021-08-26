package com.training.java.threads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {


    public MyCallable() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public String call() throws Exception {
        return "Hello world"
               + Thread.currentThread()
                       .getName();
    }

}
