package com.revature.objects;

public class Driver {
	
	// This section of the class allows us to define what are referred to as "member variables"
	// These are the "state" of the class
	// Each instance of this class will have their OWN values for each of these "categories"
	// Additional Note: Member variables will be initialized to that type's default value
	int value;
	// Unless you specify the initial value yourself like I have done below
	boolean isCool = true;
	
	static Driver staticDriver = getDriver(); // Static/Class field/variable/attribute

	public static void main(String[] args) {
		// This method acts as the entrypoint for our program
		
		// I want to create an instance of this Driver class
		// The syntax for creating an instance of a class is as follows
		// We first need to create a variable to store the instance in
		
		// [type] name = new ClassName();
		// The left hand side is the variable declaration
		// The right hand side is the creation of the object instance
		Driver myDriver;
		myDriver = new Driver();
		
		// This dot notation is how we access properties specific to the instance
		System.out.println(myDriver.value);
		System.out.println(myDriver.isCool);
		
		Driver myDriver2ElectricBoogaloo = new Driver();
		
		// We change the values of the 2nd object instance
		myDriver2ElectricBoogaloo.value = 17;
		myDriver2ElectricBoogaloo.isCool = false;
		
		// We print out the values
		System.out.println(myDriver2ElectricBoogaloo.value);
		System.out.println(myDriver2ElectricBoogaloo.isCool);
		System.out.println("================================"); // This is a divider in the output
		// Note that by changing the 2nd instance's values, the first instance is unaffected
		System.out.println(myDriver.value);
		System.out.println(myDriver.isCool);
		
		System.out.println("================================"); // This is a divider in the output
		System.out.println(Driver.staticDriver.value); // Accessing a static field in a static manner
		System.out.println(myDriver.staticDriver.value); // Accessing a static field through an instance
		
		System.out.println(myDriver.getClass().getCanonicalName());
	}

	public static Driver getDriver() {
		return new Driver();
	}
}
