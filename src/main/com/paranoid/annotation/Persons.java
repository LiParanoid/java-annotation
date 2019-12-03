package com.paranoid.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Paranoid
 * @create 2019-12-03 15:21
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Persons {
    Person[] value();
}
