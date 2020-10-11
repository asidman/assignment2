package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount{
	
	public CheckingAccount(double openingBalance) {
		super(openingBalance);
	}

	public CheckingAccount(double openingBalance, double interestRate) {
		super(openingBalance, interestRate);
	}
	
	public CheckingAccount(long accountNumber, double balance, double interestRate) {
		super(accountNumber, balance, interestRate);
	}


}
