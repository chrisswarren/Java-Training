package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Strikes";
		bookTitle = "Star Wars - The Empire Strikes Back";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is Chrome");
		}
		
		String firstName = "Chris";
		String lastName = "Warren";
		String NIN = "01505156156";
		
		System.out.println("There are " +NIN.length() + " digits in your NI.");
		
		// Print the initials plus last 4 digits of SSN
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.println(NIN.substring(7, 11));
	}

}
