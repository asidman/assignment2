package com.meritamerica.assignment2;

public class AccountHolder {

	private String myFirstName;
	private String myMiddleName;
	private String myLastName;
	private String mySsn;
	private CheckingAccount myCheckingAccount;
	private SavingsAccount mySavingsAccount;
	
	
	public AccountHolder(String myFirstName, String myMiddleName, String myLastName, String mySsn) {
		super();
		this.myFirstName = myFirstName;
		this.myMiddleName = myMiddleName;
		this.myLastName = myLastName;
		this.mySsn = mySsn;
	}

	public AccountHolder() {
		myFirstName = "";
		myMiddleName = "";
		myLastName = "";
		mySsn = "";
		myCheckingAccount = new CheckingAccount(0.0);
		mySavingsAccount = new SavingsAccount(0.0);
	}
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingAccountOpeningBalance) {
		this.myFirstName = firstName;
		this.myMiddleName = middleName;
		this.myLastName = lastName;
		this.mySsn = ssn;
		this.myCheckingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.mySavingsAccount = new SavingsAccount(savingAccountOpeningBalance);
		
	}
	
	public String getFirstName(String firstName) {
		return myFirstName;
	}
	
	public void setFirstName(String firstName) {
		myFirstName = firstName;
	}
	
	public String getMiddleName(String middleName) {
		return myMiddleName;
	}
	
	public void setMiddleName(String middleName) {
		myMiddleName = middleName;
	}
	public String getLastName(String lastName) {
		return myLastName;
	}
	
	public void setLastName(String lastName) {
		myLastName = lastName;
	}
	
	public String getSSN(String ssn) {
		return mySsn;
	}
	
	public void setSSN(String ssn) {
		mySsn = ssn;
	}


	public CheckingAccount getCheckingAccount() {
		return myCheckingAccount;
	}
	
	public SavingsAccount getSavingsAccount() {
		return mySavingsAccount;
	}
	
	public String toString(){
		return "Name: " + myFirstName + " " + myMiddleName + " " + myLastName + "\n" +
			"SSN: " + mySsn + "\n" + 
			myCheckingAccount.toString() +
			mySavingsAccount.toString();
		
		
//		CheckingAccount[] getCheckingAccounts()
//		int getNumberOfCheckingAccounts()
//		double getCheckingBalance()
//		SavingsAccount addSavingsAccount(double openingBalance)
//		SavingsAccount addSavingsAccount(SavingsAccount savingsAccount)

		
//		SavingsAccount[] getSavingsAccounts()
		
//		int getNumberOfSavingsAccounts()
		
//		double getSavingsBalance()
		
//		CDAccount addCDAccount(CDOffering offering, double openingBalance)
		
//		CDAccount addCDAccount(CDAccount cdAccount)
		
//		CDAccount[] getCDAccounts()
		
//		int getNumberOfCDAccounts()
		
//		double getCDBalance()
		
//		double getCombinedBalance()

					
	}
}
