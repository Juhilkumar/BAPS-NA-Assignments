package org.learning.assignment.assignment3;

public class WithdrawTask implements Runnable{
    double balance;
    double withdrawAmount;

    public WithdrawTask(double balance, double withdrawAmount) {
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        withdraw(withdrawAmount);
    }

    // Synchronized method to withdraw money
    private synchronized void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            String message = String.format("%s Amount %f is debited successfully. ---- New balance: %f ", Thread.currentThread().getName(), amount, balance);
            System.out.println(message);
        } else {
            String errorMessage = String.format("%s attempted to withdraw: %f, Insufficient funds.", Thread.currentThread().getName(), amount);
            System.out.println(errorMessage);
        }
    }
}
