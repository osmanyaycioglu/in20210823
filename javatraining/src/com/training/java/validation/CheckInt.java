package com.training.java.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target(FIELD)
public @interface CheckInt {

    int max() default Integer.MAX_VALUE;

    int min() default Integer.MIN_VALUE;
}
