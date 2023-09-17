package com.Abood.MetaAnnotationProcessing;

import com.Abood.MetaAnnotationProcessing.Storage.Student;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        if (Student.class.isAnnotationPresent(Important.class)){
            Method[]method = Student.class.getDeclaredMethods();

            for (Method m :method){
                if (m.isAnnotationPresent(ImportantMethod.class)){
                    System.out.println(m.getName() + "(); "+" Important Method");
                } else {
                    System.out.println(m.getName() +"(); "+" Not Important Method");
                }
            }
        }

    }
}
