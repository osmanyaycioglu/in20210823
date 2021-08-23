package com.training.java.lambda;

import java.util.function.Supplier;

public class TestRun {

    public static void main(final String[] args) {
        ITest testLoc = (al,
                         u,
                         n) -> "Gridiniz : " + al + " " + u + " " + n;
        System.out.println(testLoc.test("osman",
                                        52,
                                        100L));
        Supplier<Long> sup = () -> 100L;
    }

}
