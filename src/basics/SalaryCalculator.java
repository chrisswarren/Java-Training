package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Lets create a variable to define our career
		
		
		// Declare a variable
		String career;
		System.out.println("Program is starting");
		career = "Ecommerce Test Lead";
		System.out.println("My career: " + career);
		
		//Declare and define a variable
		int hoursPerWeek = 40;
		int weeksPerYear = 52;
		double rate = 14.30;
		
		// Compute our annual salary
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My annual salary as a " + career + " at the rate of £" + rate +"per hour is £" + salary + "per year.");
		// rate * hoursPerweek * weeksPerYear
	}

}
