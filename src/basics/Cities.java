package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"London", "Brighton", "Manchester", "Southampton"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// Declare array
		String[] countries;
		
		//Define the array
		countries = new String[3];
		countries[0] = "UK";
		countries[1] = "Spain";
		countries[2] = "USA";
		System.out.println(countries[2]);
		
		System.out.println("********************");
		
		
		
		// Declare and define the array (only size)
				String[] counties = new String[5];
				counties[0] = "London City";
				counties[1] = "East Sussex";
				counties[2] = "Lancashire";
				counties[3] = "Hampshire";
				counties[4] = "Buckinghamshire";
				int i = 0;
				
		// Do loop: Enters the loop THEN tests the condition
		do {
			System.out.println("COUNTY: " + counties[i]);
			i = i + 1;
		} while (i < 5);
		
		// While loop: Tests condition first the enters loop
		int n = 0;
		boolean countyFound = false;
		while(!countyFound) {
			String county = counties[n];
			System.out.println(county);
			if (county == "Lancashire") {
			System.out.println("COUNTY FOUND");
			countyFound = true;
			}
			
			n++;
		}
		
		System.out.println("\nPRINTING WITH FOR LOOP");
		// For loop: best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(counties[x]);
		}
	}

}
