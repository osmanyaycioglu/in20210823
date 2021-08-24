package com.training.java.generics;

import com.training.java.calculator.IOperation;

public class OperationExecutor<T extends IOperation> {

    private T val;

    public void calistir() {
        this.getVal().execute(10,
                         20);
    }

    public T getVal() {
        return val;
    }

    public void setVal(T valParam) {
        val = valParam;
    }
}
