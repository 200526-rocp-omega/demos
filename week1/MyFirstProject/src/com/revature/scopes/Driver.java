package com.revature.scopes;

public class Driver {
	
	/*
	 * There are 4 scopes in Java:
	 * 
	 * Each scope is defined with curly brackets: { }
	 * 
	 * Instance Scope: Variable/Methods that belong to the object itself (the instance)
	 * Static Scope: Variable/Methods that belong to the class itself (the blueprint)
	 * 
	 * The following 2 scopes only apply to variables (NOT to methods)
	 * These are the local scopes
	 * Method Scope: The outermost scope of the inside of a method
	 * Block Scope: Further nested scopes inside of a method
	 */
	
	public int x; // Instance Scope
	public static int y; // Static Scope

	public static void main(String[] args) {
		Driver.y = 7;
		System.out.println(y);

//		System.out.println(x);
		// The above statement does not compile since x does not exist yet
		
		Driver myDriver = new Driver();
		myDriver.x = 15;
		System.out.println(myDriver.x);
		// Now we can access x, since it exists as long as myDriver exists
		
		System.out.println("==============");
		
		// myDriver is in the Method Scope
		// It exists only inside this method
		
		// Invoking the printXDifferently method
		// Invoking means to skip to that method body, and start executing line by line
		// When that method body is complete, return here and continue
		printXDifferently(myDriver);
		
		// Output 15
		System.out.println(myDriver.x);
		
		// We will invoke the printX method, and pass in myDriver as an input
		printX(myDriver);
		
		// Output 25
		System.out.println(myDriver.x);
	}
	
	// The below syntax inside the parentheses does NOT create an object
	// It is declaring that this method may receive a pre-existing object of type Driver
	// And it will be temporarily referred to as "d"
	public static void printX(Driver d) {
		// The output is 25
		d.x = 25;
		// Modifies the first object
	}
	
	public static void printXDifferently(Driver d) {
		// The output is 15
		d = new Driver();
		d.x = 25;
		// Modifies the second object
	}
	// Java is a strongly and statically typed language
}
