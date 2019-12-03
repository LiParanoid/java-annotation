package com.paranoid.annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Paranoid
 * @create 2019-12-03 15:22
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Persons.class)
public @interface Person{
    String role() default "";
}