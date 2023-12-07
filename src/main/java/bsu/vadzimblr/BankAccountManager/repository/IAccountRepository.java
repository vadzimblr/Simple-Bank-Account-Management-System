package bsu.vadzimblr.BankAccountManager.repository;

import bsu.vadzimblr.BankAccountManager.Models.Account;

import java.util.List;

public interface IAccountRepository {
    double getOverdraftAmount(int accountNumber);
    double getBalance(int accountNumber);
    double getTotalOverdraftAmount();
    double getAccountNumber();
    Account getAccount(int accountNumber);
    double getTotalBalance();
    List<Account> getSortedAccounts();
    void createAccount();
}
