package com.meritamerica.assignment2;


public class BankAccount {
	
	protected double accountBalance;
	protected double accountInterestRate;
	protected long accountAccountNumber;
	public BankAccount() {
		
	}

//	1. BankAccount(double balance, double interestRate)
	public BankAccount(double balance, double interestRate) {
		accountBalance = balance;
		accountInterestRate = interestRate;
		accountAccountNumber = 0;
	}

//2. BankAccount(long accountNumber, double balance, double interestRate)
	public BankAccount(long accountNumber, double balance, double interestRate) {
		accountAccountNumber = accountNumber;
		accountBalance = balance;
		accountInterestRate = interestRate;
	}
//3. long getAccountNumber()
	public long getAccountNumber(){
		return accountAccountNumber;
	}
	
//4. double getBalance()
	public double getBalance(){
		return accountBalance;
	}
//5. double getInterestRate()
	public double getInterestRate(){
		return accountInterestRate;
	}
//6. boolean withdraw(double amount)
	public boolean withdraw(double amount){
		if (amount >= 0 && amount <= accountBalance) {
		accountBalance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
//7. boolean deposit(double amount)
	public boolean deposit(double amount){
		if (amount >= 0) {
		accountBalance += amount;
			return true;
		}
		else {
			return false;
		}
	}
//8. double futureValue(int years)
	public double futureValue(int years){
		return accountBalance * Math.pow(1+ accountInterestRate, years);
	}
}

