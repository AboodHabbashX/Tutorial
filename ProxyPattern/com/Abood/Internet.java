package com.Abood;

import com.Abood.Exception.IllegalConnectionException;

public interface Internet {

    void connectTo(String host) throws IllegalConnectionException;
}
