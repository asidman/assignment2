package com.meritamerica.assignment2;


import com.meritamerica.assignment2.AccountHolder;
import com.meritamerica.assignment2.CheckingAccount;
import com.meritamerica.assignment2.SavingsAccount;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		
		// 1. Instantiate an account holder with a checkings balance of $100 and a savings balance of $1000
		AccountHolder firstAccount = new AccountHolder("Minsun", "", "Kim", "111111111", 100.0, 1000.0);
		
		// 2. Display the account holder's toString() output
		System.out.println(firstAccount.toString());

		// 3. Deposit $500 into the checking account
		firstAccount.getCheckingAccount().deposit(500);

		// 4. Withdraw $800 from the savings account
		firstAccount.getSavingsAccount().withdraw(800);
		
		// 5. Display the checking account toString() output
		firstAccount.getCheckingAccount().toString();
		
		System.out.println(firstAccount.getCheckingAccount().toString());
		
		// 6. Display the savings account toString() output
		System.out.println(firstAccount.getSavingsAccount().toString());
		
		// 7. Instantiate another account holder with a checking balance of $200 and a savings balance of $500
		//AccountHolder secondAccount = new AccountHolder("Jihan", "", "Joo", "222222222", 200.0, 500.0);
		AccountHolder secondAccount = new AccountHolder();
		secondAccount.setFirstName("Jihan");
		secondAccount.setMiddleName("");
		secondAccount.setLastName("Joo");
		secondAccount.setSSN("222222222");
		secondAccount.getCheckingAccount().deposit(200.0);
		secondAccount.getSavingsAccount().deposit(500.0);
		
		// 8. Deposit -$500 into the checking account
		secondAccount.getCheckingAccount().deposit(-500.0);
		
		// 9. Withdraw $600 from the savings account
		secondAccount.getSavingsAccount().withdraw(600.0);
		
		// 10. Dispaly the second account holder's toString() output
		System.out.println(secondAccount.toString());
	
	}

}