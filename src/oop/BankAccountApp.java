package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		// acc1.name = "Chris Warren";
		// With encapsulation: public API methods
		acc1.setName("Chris Warren");
		System.out.println(acc1.getName() + "\n");
		acc1.setSsn("051505649846");
		System.out.println(acc1.getSsn() + "\n");
		
		acc1.setRate();
		acc1.increaseRate();
		
		
		
		acc1.accountNumber = "1515616161";
		acc1.balance = 1926.33;
		
		acc1.deposit(1500);
		acc1.deposit(2500);
		acc1.deposit(620);
		
		acc1.withdraw(300);
		
		System.out.println(acc1.toString() + "\n");
		
		
		/*
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "1515616161";
		
				
		BankAccount acc3 = new BankAccount("Savings Account", 1000);
		acc3.accountNumber = "1515616161";
		acc3.checkBalance();
		
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
		
		System.out.println("**************");
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 2533.55;
		cd1.interestRate = "4.5";
		cd1.name = "Heidi Lawson";
		cd1.accountNumber = "01515105616";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/

	}

}
