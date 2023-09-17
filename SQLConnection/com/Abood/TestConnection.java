package com.Abood;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestConnection {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
              "jdbc:mysql://127.0.0.1:3306/database name",
              "your username here",
              "your password here"
            );

            PreparedStatement preparedStatement =// use your table name instead people
                    connection.prepareStatement("select * from people");

            ResultSet rs =preparedStatement.executeQuery();

            while (rs.next()){
                String name= rs.getString("firstname"); // use your column Label Instead firstname
                int id = rs.getInt("id"); // use your column Label Instead id

                System.out.println("name: "+name +"\n" +"id: "+id);
            }
        }catch(Exception e) {

            e.printStackTrace();
        }

    }
}



