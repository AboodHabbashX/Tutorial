package com.Abood;

import com.Abood.XML.XML;

public class Main {
    public static void main(String[] args) {


        Student st =new Student("Abood Habbash" ,12022);
        try {

            String xml = XML.getXMLString(st);

            System.out.println(xml);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
