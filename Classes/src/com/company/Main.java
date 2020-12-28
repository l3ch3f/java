package com.company;

public class Main {

    public static void main(String[] args) {
	    // Create a new class for a bank account.
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for eacht field
        // Create two additional methods
        // 1. to allow the customer to deposit funds (this should increment the balance field).
        // 2. to allow the customer to withdraw funds. This should deduct from the balance field.
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by intelliJ) to confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        Account bobsAccount = new Account("12345", 0.0, "Bob brown", "myeaml@bob.com", "0123-2131");
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(100.0);
        bobsAccount.withdrawal(150.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(150.0);
    }
}
