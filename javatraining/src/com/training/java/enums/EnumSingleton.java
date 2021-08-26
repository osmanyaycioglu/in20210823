package com.training.java.enums;

import com.training.java.calculator.IOperation;

public enum EnumSingleton implements IOperation {

    INSTANCE1("birinci") {

        @Override
        public void sayHello(final String nameParam) {
            System.out.println(this.getStr() + " Merhaba " + nameParam);
        }

    },
    INSTANCE2("ikinci"),
    INSTANCE3("üçüncü") {

        @Override
        public void sayHello(final String nameParam) {
            System.out.println(this.getStr() + " Ola " + nameParam);
        }
    };

    private String str;


    private EnumSingleton(final String str) {
        this.str = str;
    }

    public void sayHello(final String name) {
        System.out.println(this.getStr() + " Hello " + name);
    }

    public String getStr() {
        return this.str;
    }

    @Override
    public int execute(final int val1Param,
                       final int val2Param) {
        return val1Param + val2Param;
    }


}
