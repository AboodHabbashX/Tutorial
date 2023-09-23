package com.Abood;

import com.Abood.Exception.IllegalConnectionException;

public class Main {
    public static void main(String[] args) throws IllegalConnectionException {

        Internet t =new Proxy();

        // you can use try and catch
        t.connectTo("amazon.com");
        t.connectTo("facebook.com");

    }
}
