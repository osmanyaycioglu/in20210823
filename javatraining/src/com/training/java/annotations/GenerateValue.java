package com.training.java.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target({
          TYPE,
          FIELD
})
public @interface GenerateValue {

    String val() default "";

    int max() default Integer.MAX_VALUE;

}
