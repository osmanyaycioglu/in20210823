package com.training.java.validation;


public class ValidationException extends Exception {

    private static final long serialVersionUID = 1256006853937614546L;


    public ValidationException() {
    }

    public ValidationException(final String message) {
        super(message);
    }

    public ValidationException(final Exception exp) {
        super(exp);
    }


}
