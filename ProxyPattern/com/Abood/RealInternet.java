package com.Abood;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String host) {
        System.out.println("Connection successfully to host "+host);
    }
}
