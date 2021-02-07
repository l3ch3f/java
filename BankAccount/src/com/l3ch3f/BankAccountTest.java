package com.l3ch3f;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    public void deposit() throws Exception {
        BankAccount account = new BankAccount("Tim", "blabla", 1000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00,true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.jupiter.api.Test
    public void withdraw() throws Exception {
        fail("this test has yet to be implemented");
    }

    @org.junit.jupiter.api.Test
    public void getBalance_deposit() throws Exception {
        BankAccount account = new BankAccount("Tim", "blabla", 1000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00,true);
        assertEquals(1200.00, account.getBalance(),0);
    }

    @org.junit.jupiter.api.Test
    public void getBalance_withdraw() throws Exception {
        BankAccount account = new BankAccount("Tim", "blabla", 1000.00, BankAccount.CHECKING);
        double balance = account.withdraw(200.00,true);
        assertEquals(800.00, account.getBalance(),0);
    }

    @org.junit.jupiter.api.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Tim", "blabla", 1000.00, BankAccount.CHECKING);
        assertTrue(account.isChecking(), "The account is NOT a checking account");
    }
}