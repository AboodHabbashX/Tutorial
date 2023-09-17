package com.Abood.Notification;

import com.Abood.DataBase.DataBaseService;

public class Notifier implements INotifier{
    private final String username;
    protected final DataBaseService dataBaseService;

    public Notifier(String username ) {
        this.username=username;

        dataBaseService=new DataBaseService();
    }


    @Override
    public void send(String message){
        String mail = dataBaseService.getMailByUsername(username);
        System.out.println("Sending "+message+" to Mail "+ mail );
    }

    public String getUsername() {
        return username;
    }
}
