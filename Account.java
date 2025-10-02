import java.util.*;

public class Account {
    private int accountNumber;
    private String holderName;
    private double balance;
    private List<String> transactions;

    public Account(int accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add("Account created with balance: " + initialBalance);
    }

    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: " + amount + " | Balance: " + balance);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Withdrawn: " + amount + " | Balance: " + balance);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    public void showTransactions() {
        System.out.println("\nTransaction history for " + holderName + ":");
        for (String t : transactions) {
            System.out.println(" - " + t);
        }
    }

    @Override
    public String toString() {
        return "Account[" + accountNumber + "] - " + holderName + " | Balance: " + balance;
    }
}