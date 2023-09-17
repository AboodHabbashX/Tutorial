package com.Abood;

public class BankAccount {

    private int balance ;
    private int overDraft = 0;


    public BankAccount(int overDraft) {
        this.overDraft=overDraft;
    }

    public void addBalance(int balance) {
        this.balance += balance;
    }
    public void removeBalance(int balance){
        this.balance-=balance;
    }

    public int getOverDraft() {
        return overDraft;
    }

    public int getBalance() {
        return balance;
    }
}
