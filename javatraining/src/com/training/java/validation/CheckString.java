package com.training.java.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target(FIELD)
public @interface CheckString {

    int max() default Integer.MAX_VALUE;

    int min() default 0;
}
