package bsu.vadzimblr.BankAccountManager.Models;

import java.util.ArrayList;
import java.util.List;

public class Account implements DAOMapper<Account>{
    private String currencyName;
    private double amount;
    private double overdraftAmount;
    private int customerId;
    private int accountNumber;
    private boolean isBlocked;

    public Account(String currencyName, double amount, double overdraftAmount, int customerId,
                   int accountNumber, boolean isBlocked) {
        this.currencyName = currencyName;
        this.amount = amount;
        this.overdraftAmount = overdraftAmount;
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.isBlocked = isBlocked;
    }

    public Account(String currencyName, int customerId, int accountNumber) {
        this.currencyName = currencyName;
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.isBlocked = false;
        this.amount = 0;
        this.overdraftAmount = 0;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    @Override
    public List<String> mapModelToParameters(Account model) {
        List<String> result = new ArrayList<>();
        result.add(currencyName);
        result.add(String.valueOf(amount));
        result.add(String.valueOf(overdraftAmount));
        result.add(String.valueOf(customerId));
        result.add(String.valueOf(accountNumber));
        result.add(String.valueOf(isBlocked));
        return result;
    }
}
