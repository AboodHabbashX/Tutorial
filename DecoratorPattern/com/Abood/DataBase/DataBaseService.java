package com.Abood.DataBase;

public class DataBaseService{


    public String getMailByUsername(String username) {
        return username+"@Mail.com";
    }
    public String getInstagramNameFromUsername(String username) {
        return username +"@Instagram";
    }
    public String getFaceBookNameFromUsername(String username) {
        return username +"@Facebook";
    }


}
