package com.training.spring;

public class MyUsingObjectProxy extends MyUsingObject {


    private final MyUsingObject myUsingObject;

    public MyUsingObjectProxy(final MyUsingObject myUsingObjectParam) {
        super(myUsingObjectParam.getGreet());
        this.myUsingObject = myUsingObjectParam;
    }

    @Override
    public String hello(final String name) {
        return null;
    }

    @Override
    public MyObject getMyObject() {
        return null;
    }

    @Override
    public void setMyObject(final MyObject myObjectParam) {
    }


}
