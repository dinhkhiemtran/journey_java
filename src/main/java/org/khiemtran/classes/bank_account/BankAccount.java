package org.khiemtran.classes.bank_account;

import java.util.Objects;

public class BankAccount {
  private int money;
  private boolean isAccountOpen;

  public BankAccount() {
    this.money = 0;
  }

  void open() {
    this.isAccountOpen = true;
  }

  void close() {
    this.isAccountOpen = false;
  }

  public synchronized int getBalance() throws BankAccountActionInvalidException {
    if (!isAccountOpen()) throw new BankAccountActionInvalidException("Account closed");
    return Math.max(this.money, 0);
  }

  public synchronized void deposit(int amount) throws BankAccountActionInvalidException {
    if (!isAccountOpen()) throw new BankAccountActionInvalidException("Account closed");
    if (amount <= 0) throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
    this.money += amount;
  }

  public synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
    if (!isAccountOpen()) throw new BankAccountActionInvalidException("Account closed");
    if (Objects.equals(money, 0))
      throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
    if (amount <= 0) throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
    if ((money - amount) < 0)
      throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
    this.money -= amount;
  }

  private boolean isAccountOpen() {
    return this.isAccountOpen;
  }
}
