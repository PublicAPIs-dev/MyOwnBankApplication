package se.lexicon;

import java.util.UUID;

// todo: complete
public class AccountHolder {
    private String name;
    private String accountId;
    private double balance;
    private String password;

    AccountHolder(String name, String password, double balance){
        this.name = name;
        this.password = password;
        this.balance = balance;
        accountId = BankOperations.generateId();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public boolean setName(String name, String password) {
        boolean success = false;
        if (password.equals(this.password)){
            this.name = name;
            success = true;
        }
        return success;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String oldPassword, String newPassword) {
        boolean success = false;
        if (oldPassword.equals(this.password)){
            this.password = newPassword;
            success = true;
        }
        return success;
    }
}
