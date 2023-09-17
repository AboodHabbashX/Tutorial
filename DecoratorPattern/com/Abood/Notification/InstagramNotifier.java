package com.Abood.Notification;

public class InstagramNotifier extends Notifier{
    public InstagramNotifier(String username) {
        super(username);
    }
    @Override
    public void send(String message) {
       String name = dataBaseService.getInstagramNameFromUsername(getUsername());
        System.out.println("Sending " +message +" to "+name);
    }
}
