package com.training.java.collections;


public class StringRun {

    public static void main(final String[] args) {
        String str1 = "osman"; // heap 0x123832
        String str2 = new String("osman");
        if (str1.equals(str2)) {
            System.out.println("Str Eşit");
        } else {
            System.out.println("Str Eşit Değil");
        }

        str1 += " yaycıoğlu"; // heap 0x7346437


        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("osman yaycıoğlu");
        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 100_000; iLoc++) {
            //            builderLoc.append(" ");
            //            builderLoc.append(iLoc);
            str1 += " " + iLoc;
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));
        System.out.println(builderLoc.toString());
    }
}
