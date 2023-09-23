package com.Abood;

import com.Abood.Exception.IllegalConnectionException;

import java.util.ArrayList;

public class Proxy implements Internet {

    private final static ArrayList<String> bannedSites ;
    private final static RealInternet realInternet ;

    static {
        bannedSites =new ArrayList<>();
        realInternet =new RealInternet();


        // Banned Sites
        bannedSites.add("facebook.com");
        bannedSites.add("instagram.com");

    }
    @Override
    public void connectTo(String host) throws IllegalConnectionException {
        if (bannedSites.contains(host)){
            throw new IllegalConnectionException("This site has been attended");
        } else {
            realInternet.connectTo(host);
        }

    }
}
