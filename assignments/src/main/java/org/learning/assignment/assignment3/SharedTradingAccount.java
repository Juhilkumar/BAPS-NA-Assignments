package org.learning.assignment.assignment3;

// 1. Write a multithreaded program to update a shares resource(variable) from multiple threads.
public class SharedTradingAccount {
    // Initial Balance
    private double balance = 2500;

    public static void main(String[] args) {
        SharedTradingAccount account = new SharedTradingAccount();

        // Few threads for deposit and withdrawal operations for the tading account
        Thread thread1 = new Thread(new DepositTask(account.balance, 300), "First Deposit - Transaction From TATA Inc.");
        Thread thread2 = new Thread(new DepositTask(account.balance, 9000), "Second Deposit - Transaction From Reliance.");
        Thread thread3 = new Thread(new WithdrawTask(account.balance, 500), "First Withdrawal - Transaction From Adani.");
        Thread thread4 = new Thread(new WithdrawTask(account.balance, 700), "Second Withdrawal - Transaction From Wipro.");

        System.out.println("Initial Balance : " + account.balance);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Start executing threads one by one
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Balance after all the transaction: " + account.balance);
    }
}