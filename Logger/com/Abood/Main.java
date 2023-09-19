package com.Abood;


import com.Abood.Exception.AccessDenied;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String > data =new HashMap<>();
        Scanner ff=new Scanner(System.in);

        data.put("Abood","5000");

        System.out.println("Please enter username");
        String username =ff.nextLine();

        System.out.println("Please enter password");
        String password =ff.nextLine();

        try {
            if (data.containsKey(username)){
                if (data.get(username).equals(password)) {
                    System.out.println("Welcome to my world :) ");
                } else {
                    throw new AccessDenied("the password or username wrong ");
                }
            }
        }catch (Exception exception) {
            Logger.logExceptionToFile("log.txt",exception);
            exception.printStackTrace();
        }




    }

}



