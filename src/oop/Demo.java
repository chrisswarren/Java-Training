package oop;

class person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email + " is eating");
		
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
		
	}
}

public class Demo {

	public static void main(String[] args) {
		
		// Instantiating and object
		person person1 = new person();
		
		//Define some properties
		person1.name = "Chris";
		person1.email = "chris@test.com";
		person1.phone = "070801561056";
		
		// Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		person person2 = new person();
		person2.name = "Heidi";
		person2.email = "hlawson@test.com";
		person2.phone = "01215048489";	
		
		person2.walk();
		person2.eat();
		person2.sleep();
		
		/*
		// Attributes, Variables, adjectives. These are descriptors
		String name = "Chris";
		String email = "chris@test.com";
		String phone = "01714156156";
		
		// Action, Activity, Behaviour
		// System.out.println(name + " is walking.");
		walking(name);
		System.out.println(name + " is eating.");
		
		// What if we wanted to add another person?
		String name2 = "Heidi";
		String email2 = "heidi@test.com";
		String phone2 = "078154684646";
		
		// System.out.println(name2 + " is walking.");
		walking(name2);
		System.out.println(name2 + " is eating.");
		
		// What about binding attributes and properties together?
		
		
		}
	
	// Enhance by adding functions to minimise code
			static void walking(String name) {
				System.out.println(name + " is walking");
	*/
	}
	
	
}
