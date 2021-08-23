package com.training.java.lambda;

import com.training.java.common.Car;
import com.training.java.common.IArac;

public class GreetingRun {


    public static void main(final String[] args) {
        IArac aracLoc = new Car(100);
        int value = 10;
        //value = 20;
        // aracLoc = new Mercedes();
        IGreet greetLoc = new TurkishGreet(value);
        String greetStrLoc = greetLoc.greet("osman");
        System.out.println(greetStrLoc);
        System.out.println("---------------------------------------------------");
        IGreet greetEng = new IGreet() {

            @Override
            public String greet(final String nameParam) {
                aracLoc.goForward();
                if (value > 20) {
                    return "Hello sir " + nameParam;
                }
                return "Hello " + nameParam;
            }
        };

        IGreet greetTr = new IGreet() {

            @Override
            public String greet(final String nameParam) {
                aracLoc.goForward();
                if (value > 20) {
                    return "Selam sir " + nameParam;
                }
                return "Selam " + nameParam;
            }
        };

        System.out.println(greetEng.greet("osman"));

        System.out.println("------------------------LAMBDA---------------------------");
        IGreet lambdaGrtEng = za -> {
            aracLoc.goForward();
            if (value > 20) {
                return "Hello sir " + za;
            }
            return "Hello " + za;
        };

        System.out.println(lambdaGrtEng.greet("osman"));
        IGreet lambdaGrtTr2 = y -> {
            return "Merhaba " + y;
        };
        IGreet lambdaGrtTr = y -> "Merhaba " + y;
        System.out.println(lambdaGrtTr.greet("osman"));

        GreetingExample exampleLoc = new GreetingExample("osman");
        //exampleLoc.greet(f -> "Ola " + f);
        // exampleLoc.greet(GreetingRun::xyz);
        GreetingRun greetingRunLoc = new GreetingRun();
        exampleLoc.greet(greetingRunLoc::abc);
    }

    public static String xyz(final String str) {
        return "AS " + str;
    }

    public String abc(final String str) {
        System.out.println("test logu");
        System.out.println("abc");
        return "Hello " + str;
    }


}
