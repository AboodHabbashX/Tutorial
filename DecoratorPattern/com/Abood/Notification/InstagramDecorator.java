package com.Abood.Notification;

public class InstagramDecorator extends BaseNotifierDecorator {
    public InstagramDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
       String username2 = dataBaseService.getInstagramNameFromUsername(getUsername());
        System.out.println("Sending "+message + " to "+username2);
    }

}
