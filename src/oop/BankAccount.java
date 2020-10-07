package oop;

public class BankAccount implements IRate {
	// Define variables
	String accountNumber;
	
	// static >> belongs to the CLASS not the object instance
	// final >> constant (often static final go together)
	 private static final String routingNumber = "123456";
	
	// Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
		// 1. They are used to define / setup / initialise properties of an object
		// 2. Constructors are IMPLICITLY called upon instantiation
		// 3. The same name as the class itself
		// 4. Constructors have NO return type
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	// Overloading: call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("New Account created: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		// accountType, initDeposit and Msg are all local variables
		System.out.println("New Account created: " + accountType);
		System.out.println("Initial deposit of: £" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "Error: Minimum deposit must be at least £1000";
		} else {
			Msg = "Thanks for your initial deposit of: £" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance+initDeposit;
	}
	
	// Getters / Setters
	
	// Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr " + name;
	}
	
	public String getName() {
		return name;
	}
	
		
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = "Security No: " + ssn;
	}
	
	
	// Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}

	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	// Private: Can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: £" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: £" + balance);
		
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + ". Account#: " + accountNumber + ". Rounting#: " + routingNumber + ". BALANCE: £" + balance +"]";
	}
	
	

}
