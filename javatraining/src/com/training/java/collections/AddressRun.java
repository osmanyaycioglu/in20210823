package com.training.java.collections;

import java.util.List;

public class AddressRun {

    public static void main(final String[] args) {
        MyAddresses addressesLoc = new MyAddresses();
        addressesLoc.add("istanbul 1");
        addressesLoc.add("istanbul 2");
        addressesLoc.add("istanbul 3");
        addressesLoc.add("istanbul 4");

        List<String> addressListLoc = addressesLoc.getAddressList();
        addressListLoc.removeIf(s -> true);

    }
}
