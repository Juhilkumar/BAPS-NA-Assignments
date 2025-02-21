package org.learning.assignment.assignment3;

public class DepositTask implements Runnable {
    double balance;
    double depositAmount;

    public DepositTask(double balance, double depositAmount) {
        this.balance = balance;
        this.depositAmount = depositAmount;
    }

    @Override
    public void run() {
        deposit(depositAmount);
    }

    // Synchronized method to deposit money
    public synchronized void deposit(double amount) {
        // The money will be deposited if the amount is greater than 0
        if (amount > 0) {
            balance += amount;
            String message = String.format("%s Amount %f is credited successfully. ---- New balance: %f ", Thread.currentThread().getName(), amount, balance);
            System.out.println(message);
        }
    }
}
