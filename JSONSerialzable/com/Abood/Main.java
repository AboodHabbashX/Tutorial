package com.Abood;

import com.Abood.Json.JSONConverter;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {


        JSONConverter js =new JSONConverter("src/main/java/com/Abood/test.json");


        Student st =new Student("Abood Habbash",
                12022,
                "Abood@gmail.com",
                "Palestine",
                18);

        System.out.println(js.objectAsJson(st));


        js.objectAsJsonFile(st); // Deprecated Method

    }
}
