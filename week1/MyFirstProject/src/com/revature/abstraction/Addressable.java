package com.revature.abstraction;

// Interfaces are similar to Abstract Classes
// Interfaces may ONLY have abstract methods and MUST also be public
// Interfaces MAY have variables, but these variables MUST be public, static, and final
public interface Addressable {
	
	// final variables are constant, and may not be modified
	String greeting = "Hello, ";

	void speak(); // If you do not include one of the required keywords, the compiler will add it for you
	// In this case, we did not put abstract, but the compiler added it in
	
	default void speak2() {
		System.out.println("Say something");
	}
}
// The concept behind interfaces is that they define some sort of "contract" in terms of behavior
// They define a list of methods that will be available for any class that implements this interface


// In a much later version of Java, interfaces obtained the ability to have non-abstract methods
// The core reason is to support backwards compatibility
// This was accomplished by the introduction of the default keyword for interfaces
// Methods in an interface may be declared as default instead of abstract
// and in this case, you may provide a method body

// As such, it is NOT recommended to use the default keyword in an interface if it can be avoided