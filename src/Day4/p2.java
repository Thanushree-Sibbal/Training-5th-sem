package Day4;

import java.util.Scanner;

/**class Account {
    protected int accountId;
    protected String holderName;
    protected double balance;

    public Account(int accountId, String holderName, double balance) {
        if (accountId >= 100 && accountId <= 999)
            this.accountId = accountId;
        else
            this.accountId = -1;

        this.holderName = holderName;

        if (balance >= 0)
            this.balance = balance;
        else
            this.balance = 0;
    }

    public double credit(double amount) {
        balance += amount;
        return balance;
    }

    public void setAccountBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;  // invalid in base class
        }
        System.out.println(this.balance);
    }

    public void printDetails() {
        System.out.println(accountId + holderName + (int)balance);
    }
}

class VIPAccount extends Account {

    public VIPAccount(int accountId, String holderName, double balance) {
        super(accountId, holderName, balance);
    }

    @Override
    public void setAccountBalance(double balance) {
        if (balance >= -10000) {
            this.balance = balance;
            System.out.println("The balance can be negative but no less than -10000");
        } else {
            System.out.println("Balance too low for VIP account.");
        }
    }
}

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int id = sc.nextInt();
        sc.nextLine(); // clear newline
        String name = sc.nextLine();
        double initialBalance = sc.nextDouble();
        double creditAmount = sc.nextDouble();
        double negativeBalance = sc.nextDouble();

        // Base Account
        Account acc = new Account(id, name, initialBalance);
        acc.printDetails();
        System.out.println((int) acc.credit(creditAmount));
        acc.setAccountBalance(acc.balance); // prints current balance

        // VIP Account
        VIPAccount vip = new VIPAccount(id, name, initialBalance);
        vip.setAccountBalance(negativeBalance); // handles negative logic
    }
}**/
class Account {
    int accountID;
    String holderName;
    double balance;

    public Account(int accID, String name, double bal) {
        if(accID < 100 || accID > 999){
            this.accountID = -1;
        }else{
            this.accountID = accID;
        }
        if(bal < 0){
            this.balance = 0;
        }else{
            this.balance = bal;
        }
        this.holderName = name;
    }

    void setAccountBalance(double bal){
        if(bal >= 0){
            balance = bal;
        }else{
            balance = 0;
        }
        System.out.println(balance);
    }

    double credit(double amt){
        balance += amt;
        return balance;
    }
}

class VIPAccount extends Account{
    public VIPAccount(int accID, String name, double bal) {
        super(accID, name, bal);
    }

    @Override
    void setAccountBalance(double bal) {
        if(bal >= -10000){
            balance = bal;
        }else{
            balance = -10000;
        }
        System.out.println("The balance can be negative but no less than -10000");
    }
}

class p2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        double bal = sc.nextDouble();
        double credtAmt = sc.nextDouble();
        double negBal = sc.nextDouble();

        Account acct = new Account(id, name, bal);
        System.out.println(acct.accountID + " " + acct.holderName + " " + acct.balance);

        double newBal = acct.credit(credtAmt);
        System.out.println(newBal);

        acct.setAccountBalance(newBal);

        VIPAccount vipAcct = new VIPAccount(id, name, newBal);
        vipAcct.setAccountBalance(negBal);
    }
}