package com.Abood;

import com.Abood.Annotation.JSONElement;
import com.Abood.Annotation.JSONSerializable;

@JSONSerializable(tag ="Student")
class Student {

    @JSONElement(tag = "name")
    private String name;

    @JSONElement(tag = "id")
    private int id;

    @JSONElement(tag = "email")
    private String email;
    @JSONElement(tag = "address")
    private String address;

    @JSONElement(tag = "age")
    private int age;


    public Student(String name , int id,String email, String address , int age) {
        this.name=name;
        this.id=id;
        this.email=email;
        this.address=address;
        this.age=age;
    }

    // I dont need Getter And Setter :)

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}