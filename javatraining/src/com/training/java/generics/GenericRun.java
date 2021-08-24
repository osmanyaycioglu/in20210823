package com.training.java.generics;

import java.util.function.Function;

import com.training.java.calculator.IOperation;

public class GenericRun {

    public static void main(final String[] args) {
        HolderString holderStringLoc = new HolderString();
        holderStringLoc.setValue("osman");
        System.out.println(holderStringLoc.getValue());

        Holder holderLoc = new Holder();
        holderLoc.setValue("str val");
        holderLoc.setValue(10);

        Object valueLoc = holderLoc.getValue();
        if (valueLoc instanceof String) {
            String str = (String) valueLoc;
            System.out.println("Sonuç : " + str);
        }

        HolderGeneric<String> strGen = new HolderGeneric<>();
        strGen.setValue("str val");
        String value2Loc = strGen.getValue();

        HolderGeneric<Double> doubleGen = new HolderGeneric<>();
        doubleGen.setValue(10.2D);
        Double value3Loc = doubleGen.getValue();

        Function<String, Integer> func = s -> Integer.parseInt(s);
        Integer applyLoc = func.apply("100");

        int methodGenLoc = methodGen((x,
                                      y) -> x + y);

        int methodGenLoc2 = methodGen(new SubsOp());

        OperationExecutor<IOperation> m = new OperationExecutor<>();
        m.setVal((a,
                  b) -> a + b);
        m.calistir();

        OperationExecutor<SubsOp> m2 = new OperationExecutor<>();
        m2.setVal(new SubsOp());
        m2.calistir();

    }

    public static <T extends IOperation> int methodGen(final T test) {
        return test.execute(10,
                            15);
    }

}
