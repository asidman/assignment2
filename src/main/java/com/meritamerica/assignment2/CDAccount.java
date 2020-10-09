package com.meritamerica.assignment2;

public class CDAccount extends BankAccount{
	private CDOffering cdCDOffering;
	private double cdBalance;
	
	
	//1. CDAccount( CDOffering offering, double balance) {
	public CDAccount (CDOffering offering, double balance) {
		super(balance, offering.getInterestRate());
		cdCDOffering = offering;
		cdBalance = balance;
		}
	
	//2. double getBalance()
	public double getBalance() {
		return cdBalance;
	}
	//3. double getInterestRate ()
	public int getTerm() {
		return cdCDOffering.getTerm();
	}
	//4.  java.util.Date getStartDate ()
	public int getStartDate(int Date) {
		return Date;
	}
	//5. long getAccountNumber () 
	public long getAccountNumber() {
		return super.getAccountNumber();
	}
	//6. double futureValue ()
	public double futureValue () {
		return super.getInterestRate();
	}
	
}

