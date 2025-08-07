package Day3;


import java.util.Scanner;

class Bank {
    private String accountHolderName;
    private double balance;

    public Bank(String name, double initialBalance) {
        this.accountHolderName = name;
        this.balance = initialBalance;
    }

    // Getter for account holder's name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for account holder's name
    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Getter for balance (read-only access)
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading inputs
        String name = sc.nextLine();
        double initialBalance = sc.nextDouble();
        sc.nextLine();  // Consume leftover newline
        String operation = sc.nextLine();
        double amount = sc.nextDouble();

        // Creating BankAccount object
        Bank account = new Bank(name, initialBalance);

        // Performing the operation
        if (operation.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else if (operation.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount);
        }

        // Displaying the result
        System.out.println("Account Holder: " + account.getAccountHolderName() + ", Updated Balance: " + account.getBalance());
    }
}
