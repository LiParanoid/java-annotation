package com.paranoid.greatway;

import com.paranoid.annotation.Person;
import com.paranoid.annotation.Persons;

/**
 * @author Paranoid
 * @create 2019-12-03 15:27
 */
@Person(role="artist")
@Person(role="coder")
@Person(role="PM")
public class TestPersonsAnnotation {
    public static void main(String[] args) {
        boolean annotationPresent = TestPersonsAnnotation.class.isAnnotationPresent(Persons.class);
        System.out.println(annotationPresent);
        if(annotationPresent){
            Persons annotation = TestPersonsAnnotation.class.getAnnotation(Persons.class);
            Person[] value = annotation.value();
            for (Person person : value) {
                System.out.println(person.role());
            }
        }
    }
}
