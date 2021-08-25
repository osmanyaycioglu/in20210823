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
        for (int iLoc = 0; iLoc < 1; iLoc++) {
            //            builderLoc.append(" ");
            //            builderLoc.append(iLoc);
            str1 += " " + iLoc;
            // String concatLoc = str1.concat(" " + iLoc);
            str1.substring(2);
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));
        System.out.println(builderLoc.toString());

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 100_000; iLoc++) {
            String.format("osman %s yaycioglu %s %d",
                          str1,
                          str2,
                          delta);
            // String stringLoc = "osman " + str1 + " yaycioglu" + str2 + " " + delta;
        }
        System.out.println("Concat Delta : " + (System.currentTimeMillis() - delta));
        // stringLoc += 10;

        String.format("osman %s yaycioglu %s %d",
                      str1,
                      str2,
                      delta);


    }
}
