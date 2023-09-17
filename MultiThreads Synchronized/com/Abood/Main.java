package com.Abood;

import com.Abood.Threads.MyThread;

public class Main {
    public static void main(String[] args) {

        // what is java Synchronization ?
        // Java Synchronization is used to make sure by some
        // synchronization method that only one thread can access the resource at a given point in time.

        /*
         out put with multiThread Synchronized ->
         $100 Successfully withdraw
         your balance: 200
         $100 Successfully withdraw
         your balance: 100
        */

        BankAccount account=new BankAccount(50);
        account.addBalance(300);
        MyThread th1 =new MyThread(new Runnable() {
            @Override
            public void run() {
                ATM.draw(account , 100);
            }
        });
        MyThread th2 =new MyThread(new Runnable() {
            @Override
            public void run() {
                ATM.draw(account ,100);
            }
        });

        th1.start();
        th2.start();


        /*
         out put without !! multiThread Synchronized ->

         $100 Successfully withdraw
         $100 Successfully withdraw
         your balance: 100
         your balance: 100

         */

        // it`s bad :D
    }
}
