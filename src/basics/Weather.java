package basics;

public class Weather {
	public static void main(String[] args) {
		// This program will give suggestions of what to wear based on the weather (temperature)
		
		int temperature = 75;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("Its warm outside, wear shorts and t-shirt.");
		}
		
		else if ((temperature > 70) && (sunCondition == "Sunny")) {
			System.out.println("Its a little colder today, maybe bring a jumper.");
			System.out.println("Wear a hat to block out the sun.");
		}
		
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day, make sure to wear warmer clothes.");
		}
		
		else {
			System.out.println("Its cold today wear trousers and bring a jacket.");
		}
		
		System.out.println("The program is ending");
		
		
	}
	

}
