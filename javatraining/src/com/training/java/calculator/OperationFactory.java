package com.training.java.calculator;


public class OperationFactory {

    public static final int OPERATION_ADD    = 1;
    public static final int OPERATION_SUBS   = 2;
    public static final int OPERATION_MULT   = 3;
    public static final int OPERATION_DIVIDE = 4;

    public static IOperation getOperation(final int index) {
        switch (index) {
            case OPERATION_ADD:
                return (a,
                        b) -> a + b;
            case OPERATION_SUBS:
                return (a,
                        b) -> a - b;
            case OPERATION_MULT:
                return (a,
                        b) -> a * b;
            case OPERATION_DIVIDE:
                return OperationFactory::divide;
            default:
                throw new IllegalStateException();
        }
    }

    public static int divide(final int a,
                             final int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

}
