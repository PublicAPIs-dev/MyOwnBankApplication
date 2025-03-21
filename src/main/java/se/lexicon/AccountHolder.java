package se.lexicon;

import java.util.UUID;

/**
 * The AccountHolder class holds data about an account.
 * It offers functionalities to get or set most of the data, only passwordID can't be set or get.
 */
public class AccountHolder {
    private String name;
    private String accountId;
    private double balance;
    private String password;
    private String passwordID;

    AccountHolder(String name, String password, double balance, String passwordID){
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.passwordID = passwordID;
        accountId = BankOperations.generateId();
    }

    // Getters and Setters

    /**
     * Return the name of the account
     * @return The name member.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name member.
     * @param name The new name of the account.
     * @param password The current password to make sure only the right person can change the name.
     * @return Returns true if the change was successfully, otherwise returns false.
     */
    public boolean setName(String name, String password) {
        boolean success = false;
        if (password.equals(this.password)){
            this.name = name;
            success = true;
        }
        return success;
    }

    /**
     * Unique account id.
     * @return The unique account id.
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Returns the accounts balance.
     * @return Current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Set the balance to something else.
     * @param balance The new balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Get the account holders password
     * @param passwordID Requires the account password id to get the password.
     * @return Returns the password if passwordID was right, otherwise returns null.
     */
    public String getPassword(String passwordID) {
        if(this.passwordID.equals(passwordID))
            return password;
        return null;
    }

    /**
     * Set the account holders password to something else.
     * @param oldPassword Requires the old password to change it to something else.
     * @param newPassword The new password.
     * @return Returns true if the change was made, otherwise returns false.
     */
    public boolean setPassword(String oldPassword, String newPassword) {
        boolean success = false;
        if (oldPassword.equals(this.password)){
            this.password = newPassword;
            success = true;
        }
        return success;
    }
}
