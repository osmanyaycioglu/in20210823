package com.training.java.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(final String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            while (true) {
                System.out.println("1-Toplama");
                System.out.println("2-Çıkarma");
                System.out.println("3-Çarpma");
                System.out.println("4-Bölme");
                System.out.println("Seçiminiz : ");
                int nextIntLoc = scannerLoc.nextInt();
                IOperation operationLoc = OperationFactory.getOperation(nextIntLoc);
                System.out.println("Value 1 : ");
                int val1Loc = scannerLoc.nextInt();
                System.out.println("Value 2 : ");
                int val2Loc = scannerLoc.nextInt();
                System.out.println("Sonuç : "
                                   + operationLoc.execute(val1Loc,
                                                          val2Loc));
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }

    }

}
