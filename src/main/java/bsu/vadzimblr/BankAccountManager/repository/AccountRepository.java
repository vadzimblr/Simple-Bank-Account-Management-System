package bsu.vadzimblr.BankAccountManager.repository;

import bsu.vadzimblr.BankAccountManager.Models.Account;

import java.util.List;

public class AccountRepository implements IAccountRepository {

    @Override
    public double getOverdraftAmount(int accountNumber) {
        return 0;
    }

    @Override
    public double getBalance(int accountNumber) {
        return 0;
    }

    @Override
    public double getTotalOverdraftAmount() {
        return 0;
    }

    @Override
    public double getAccountNumber() {
        return 0;
    }

    @Override
    public Account getAccount(int accountNumber) {
        return null;
    }

    @Override
    public double getTotalBalance() {
        return 0;
    }

    @Override
    public List<Account> getSortedAccounts() {
        return null;
    }

    @Override
    public void createAccount() {

    }
}
