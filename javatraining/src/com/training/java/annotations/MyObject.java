package com.training.java.annotations;

// java.exe -X -cp my.jar com.training.java.collections.ConnectionRun

// @MyAnnotation
public class MyObject {

    @MyAnnotation
    private String  name;
    @MyAnnotation(val = "akar")
    private String  surname;
    @MyAnnotation
    private int     val1;
    @MyAnnotation
    private Integer val2;

    public int getVal1() {
        return this.val1;
    }

    public void setVal1(final int val1Param) {
        this.val1 = val1Param;
    }

    public Integer getVal2() {
        return this.val2;
    }


    public void setVal2(final Integer val2Param) {
        this.val2 = val2Param;
    }


    public String getName() {
        return this.name;
    }


    public void setName(final String nameParam) {
        this.name = nameParam;
    }


    public String getSurname() {
        return this.surname;
    }


    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    @Override
    public String toString() {
        return "MyObject [name="
               + this.name
               + ", surname="
               + this.surname
               + ", val1="
               + this.val1
               + ", val2="
               + this.val2
               + "]";
    }


}
