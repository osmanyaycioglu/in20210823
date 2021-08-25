package com.training.java.scanner;

import java.util.Scanner;

public class ScannerRun {

    public static void main(final String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            System.out.println("Bir int girin : ");
            String nextLoc1 = scannerLoc.nextLine();
            //            int nextIntLoc = scannerLoc.nextInt();
            //            System.out.println("Sonuç : " + nextIntLoc);
            System.out.println("Bir int girin : ");
            String nextLoc = scannerLoc.nextLine();
            System.out.println(((nextLoc == null) || nextLoc.isEmpty()));
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }

        //        Scanner scannerLoc = null;
        //        try {
        //            scannerLoc = new Scanner(System.in);
        //            System.out.println("Bir int girin : ");
        //            int nextIntLoc = scannerLoc.nextInt();
        //            System.out.println("Sonuç : " + nextIntLoc);
        //
        //        } catch (Exception eLoc) {
        //            eLoc.printStackTrace();
        //        } finally {
        //            if (scannerLoc != null)
        //                scannerLoc.close();
        //        }


    }
}
