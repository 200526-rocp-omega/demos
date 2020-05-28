package com.revature.abstraction;

public class Driver {

	public static void main(String[] args) {
		Person s = new Student(19, "Sally", "Economics");
		// This is called Covariance
		// Where our "reference variable" on the left is a more generic type
		// than the specific object that is on the right
		
		Person e = new Employee(33, "Larry", "Revature");

//		s.speak();
//		e.speak();
		
		Person[] people = { s, e }; // This is an array initializer
		// The curly braces syntax allows us to list out all of the values that the array will
		// have initialized
		// Alternatively, we could have written the following statements:
		// Person[] people = new Person[2];
		// people[0] = s;
		// people[1] = e;
		
		for(Addressable p : people) {
			p.speak();
			p.speak2();
		}
	}

}
