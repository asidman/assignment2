package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount{
	
	private static final double ANNUAL_INTEREST_RATE =  .0001;

	public CheckingAccount(double openingBalance) {
		super(openingBalance, ANNUAL_INTEREST_RATE);
	}
	}
