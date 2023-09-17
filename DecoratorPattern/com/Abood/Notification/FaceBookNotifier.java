package com.Abood.Notification;

public class FaceBookNotifier extends Notifier{
    public FaceBookNotifier(String username) {
        super(username);
    }

    @Override
    public void send(String message) {
        String name = dataBaseService.getFaceBookNameFromUsername(getUsername());

        System.out.println("Sending "+message +" to "+name);
    }
}
