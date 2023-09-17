package com.Abood.Notification;

public class FaceBookDecorator extends BaseNotifierDecorator {
    public FaceBookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String username = dataBaseService.getFaceBookNameFromUsername(getUsername());

        System.out.println("Sending "+message +" to "+username);
    }

}
