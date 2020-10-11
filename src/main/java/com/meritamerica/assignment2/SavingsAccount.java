package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(double openingBalance) {
		super(openingBalance);
	}

	public SavingsAccount(double openingBalance, double interestRate) {
		super(openingBalance, interestRate);
	}
	
	public SavingsAccount(long accountNumber, double balance, double interestRate) {
		super(accountNumber, balance, interestRate);
	}


}
