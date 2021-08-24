package com.training.java.generics;


public class HolderGeneric<T> {

    private T value;

    public T getValue() {
        return this.value;
    }

    public void setValue(final T valueParam) {
        this.value = valueParam;
    }


}
