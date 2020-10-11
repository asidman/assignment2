package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount{
	private static final double ANNUAL_INTEREST_RATE =  .01;
	

	public SavingsAccount(double openingBalance) {
		super(openingBalance, ANNUAL_INTEREST_RATE);

	}


}