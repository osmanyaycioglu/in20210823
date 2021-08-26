package com.training.java.enums;

import com.training.java.calculator.IOperation;

public enum EError implements IOperation {

    ERROR_PARAMETER(300, "Paramter hatası oluştu", ECategory.INPUT) {

        @Override
        public int execute(final int val1Param,
                           final int val2Param) {
            return val1Param + val2Param;
        }
    },
    ERROR_SYSTEM(500, "Sistem error oluştu", ECategory.SYSTEM) {

        @Override
        public int execute(final int val1Param,
                           final int val2Param) {
            return super.execute(val1Param,
                                 val2Param);
        }
    };

    private final int       cause;
    private final String    message;
    private final ECategory category;

    private EError(final int cause,
                   final String message,
                   final ECategory category) {
        this.cause = cause;
        this.message = message;
        this.category = category;
    }

    public int getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }

    public ECategory getCategory() {
        return this.category;
    }

    public static EError getError(final int cause) {
        EError[] valuesLoc = EError.values();
        for (EError eErrorLoc : valuesLoc) {
            int ordinalLoc = eErrorLoc.ordinal();
            String nameLoc = eErrorLoc.name();
            if (eErrorLoc.getCause() == cause) {
                return eErrorLoc;
            }
        }
        return null;
    }

    @Override
    public int execute(final int val1Param,
                       final int val2Param) {
        throw new IllegalStateException();
    }

}
