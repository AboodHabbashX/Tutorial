package com.Abood.AnnotationProcessing.Storage;

import com.Abood.AnnotationProcessing.Builder;

@Builder
public class Student {
    private String username ;
    private String email;
    private int id;
    private int age;


    public Student(String username , String email ,  int id ,int age) {
        this.username=username;
        this.email=email;
        this.id=id;
        this.age=age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
