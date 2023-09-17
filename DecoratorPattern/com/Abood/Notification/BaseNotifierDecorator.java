package com.Abood.Notification;

import com.Abood.DataBase.DataBaseService;

public class BaseNotifierDecorator implements INotifier{
    private final INotifier wrapped ;
    protected final DataBaseService dataBaseService;
    public BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped=wrapped;
        dataBaseService =new DataBaseService();

    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }
}
