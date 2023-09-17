package com.Abood;

public class ATM {
    public static final String GREEN = "\u001B[92m";

    public static synchronized void draw (BankAccount account  ,int amount) {

        int balance = account.getBalance();

        if ((balance-amount) <- account.getOverDraft()) {
            System.err.println("Transaction Denied");
        } else {
            account.removeBalance(amount);
            System.out.println(GREEN+"$"+amount +" Successfully withdraw");

        }
        System.out.println("your balance: "+account.getBalance());
    }
}
