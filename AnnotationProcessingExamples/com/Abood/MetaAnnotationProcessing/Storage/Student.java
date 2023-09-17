package com.Abood.MetaAnnotationProcessing.Storage;

import com.Abood.MetaAnnotationProcessing.Important;
import com.Abood.MetaAnnotationProcessing.ImportantMethod;

@Important
public class Student {

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @ImportantMethod
    public String getName() {
        return name;
    }

    @ImportantMethod
    public void setName(String name) {
        this.name = name;
    }
    @ImportantMethod
    public int getId() {
        return id;
    }
    @ImportantMethod
    public void setId(int id) {
        this.id = id;
    }


    public void addNewStudent(){

    }
}
