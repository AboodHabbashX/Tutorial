package com.Abood;


import com.Abood.Annotation.XMLElement;
import com.Abood.Annotation.XMLSerializable;

@SuppressWarnings("unused")

@XMLSerializable
public class Student {
    @XMLElement(tag = "name")
    private String name ;
    @XMLElement(tag = "id")
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
