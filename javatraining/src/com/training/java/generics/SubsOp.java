package com.training.java.generics;

import com.training.java.calculator.IOperation;

public class SubsOp implements IOperation {

    @Override
    public int execute(final int val1Param,
                       final int val2Param) {
        return val1Param - val2Param;
    }

}
