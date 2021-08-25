package com.training.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyAddresses implements Iterable<String> {

    private String       name;
    private List<String> addressList;

    public String getName() {
        return this.name;
    }

    public void add(final String str) {
        if (this.addressList == null) {
            this.addressList = new ArrayList<>();
        }
        this.addressList.add(str);
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public List<String> getAddressList() {
        return new ArrayList<>(this.addressList);
    }

    public void setAddressList(final List<String> addressListParam) {
        this.addressList = addressListParam;
    }

    @Override
    public Iterator<String> iterator() {
        return this.addressList.iterator();
    }


}
