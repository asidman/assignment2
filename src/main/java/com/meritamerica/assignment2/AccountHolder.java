package com.meritamerica.assignment2;

import com.meritamerica.assignment2.AccountHolder;
import com.meritamerica.assignment2.CheckingAccount;
import com.meritamerica.assignment2.SavingsAccount;

public class AccountHolder{

	private String myFirstName;
	private String myMiddleName;
	private String myLastName;
	private String mySsn;
	private CheckingAccount myCheckingAccount;
	private SavingsAccount mySavingsAccount;
	
	private SavingsAccount[] savingsAccountArray = new SavingsAccount[1];
	private CheckingAccount[] checkingAccountArray = new CheckingAccount[1];
	private CDAccount[] CDAccountArray = new CDAccount[1];
	private int count = 0;
	
	
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
	}
		
//		CheckingAccount[] getCheckingAccounts()
		public CheckingAccount[] getCheckingAccounts() {
			CheckingAccount checkingAccounts = new CheckingAccount(0.0);
			return myCheckingAccount[];
		}
	    
	    
		
		
//		int getNumberOfCheckingAccounts()
		public int getNumberOfCheckingAccounts() {
			int numberOfAccounts = 0;
			return numberOfAccounts;
			
		}
		
//		double getCheckingBalance()
		public static double getCheckingBalance() {
			return 0;
		}
//		SavingsAccount addSavingsAccount(double openingBalance)
	public SavingsAccount addSavingsAccount(double openingBalance) {
		     SavingsAccount savingsAccount = new SavingsAccount(openingBalance);
		     return savingsAccount;
			
		}
		
		
//		SavingsAccount addSavingsAccount(SavingsAccount savingsAccount)
		public SavingsAccount[] addSavingsAccount(SavingsAccount savingsAccount) {
		if(count == savingsAccountArray.length) {
			SavingsAccount newarr[] = new SavingsAccount[count+1];
			for(int i = 0; i < count; i++) {
				newarr[count] = savingsAccountArray[count];
		}	
			savingsAccountArray = newarr;
			
		}
		savingsAccountArray[count] = savingsAccount;
		count++;
		return null;
		}
		
//		SavingsAccount[] getSavingsAccounts()
		public SavingsAccount[] getSavingsAccount () {
			SavingsAccount savingsAccounts = new SavingsAccount();
			return mySavingsAccount[];
		}
		
		
//		int getNumberOfSavingsAccounts()
		public int getNumberOfSavingsAccounts() {
			int numberOfAccounts = 0;
			return numberOfAccounts;
			
		}
		
//		double getSavingsBalance()
		public static double getSavingsBalance() {
			return 0;
		}
		
//		CDAccount addCDAccount(CDOffering offering, double openingBalance)
		public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		     CDAccount cdAccount = new CDAccount(offering, openingBalance);
		     return cdAccount;
		}
		
//		CDAccount addCDAccount(CDAccount cdAccount)
		     public CDAccount[] addCDAccount(CDAccount cdAccount) {
		 		if(count == savingsAccountArray.length) {
		 			CDAccount newarr[] = new CDAccount[count+1];
		 			for(int i = 0; i < count; i++) {
		 				newarr[count] = CDAccountArray[count];
		 		}	
		 			CDAccountArray = newarr;
		 			
		 		}
		 		CDAccountArray[count] = cdAccount;
		 		count++;
		 		return null;
		 		}
		     
//		CDAccount[] getCDAccounts()
		public CDAccount getCDAccounts(double CDOffering, double balance) {
			CDAccount cdAccounts = new CDAccount(null, balance);
			return cdAccounts;
		}
	
		
//		int getNumberOfCDAccounts()
		public int getNumberOfCDAccounts() {
			int numberOfAccounts = 0;
			return numberOfAccounts;
		}
		
//		double getCDBalance()
		public static double getCDBalance() {
			return 0;
		}
		
//		double getCombinedBalance()
		public static double getCombinedBalance() {
			return 0;
		}

					
	
}
