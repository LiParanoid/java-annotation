package com.paranoid.annotation;

import java.lang.annotation.*;

/**
 * @author Paranoid
 * @create 2019-12-03 15:10
 */

/**
 *  @interface 声明注解
 *  @Target 声明注解可以标注的位置
 *  @Retention 声明注解的生命周期
 *  @Inherited 被这个元注解标记的超类的子类可以继承超类的注解。
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyAnnotation {

}
