package com.paranoid.greatway;

import com.paranoid.annotation.MyAnnotation;

import java.lang.annotation.Annotation;

/**
 * @author Paranoid
 * @create 2019-12-03 15:05
 */

/**
 * 测试自定义注解  @MyAnnotation，以及获取注解名称
 */
@MyAnnotation
public class TestMyAnnotation {
    public static void main(String[] args) {
        Annotation[] annotations = TestMyAnnotation.class.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getSimpleName());
        }
    }
}
