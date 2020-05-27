package com.revature.primitives;
// This package declaration MUST be the first line of the file
// Or be non-existent

// We see the same class declaration that we saw last time

public class Driver {
	
	// Java has 8 built in primitive types
	// These are specifically NOT objects
	// They are the ONLY values within Java that are not Objects
	// EVERY other value IS an object
	
	// boolean -- True/False values
	// You would think that this type only needs 1 bit
	// And you would be right, except that we do not have memory storage of 1 bit at a time
	// The specific size used is dependent upon the JVM, and whether it can/does optimize memory usage
	// Most of the time, booleans will end up being 1 entire byte
	// byte -- integral value that can be stored in 1 byte
	// A byte is 8 bits
	// Ex: 0000001 -> 1
	// Ex: 0000010 -> 2
	// A bit is a single 0 or 1 value
	// short -- signed integral value, 16 bits
	// char -- unsigned integral value, 16 bits
	// Represents an ASCII value, which is translated into a letter or alphabetic symbol
	// int -- signed integral value, 32 bits 
	// long -- signed integral value, 64 bits
	// float -- signed decimal value, 32 bits
	// double -- signed decimal value, 64 bits
	
	

	// This is a method declaration
	// This is how we define the behavior of our classes
	// There are several keywords in front of the name: public, static, void
	// public is an access modifier
	// static is a non-access modifier
	// void is the return type
	
	// Methods are allowed to return results, and the type of that result must be declared at the top
	// void is a return type that means that the method will not return anything
	
	// main would be the name of the method
	
	// String[] args would be the parameters
	// Parameters are values that are passed in to this method (inputs)
	
	// This specific method declaration, exactly as shown below, is referred to as the "main method"
	// This method is what the JVM will invoke in order to start the program
	// It is the entrypoint to the program
	
	// These inputs will come from command line arguments
	public static void main(String[] args) {
		// This is a comment
		// It will be ignored by the compiler
		// It is simply here for other humans to understand something about the code
		// These are single-line comments
		
		/* This marks the beginning of a multi-line comment
		 * 
		 * And it will continue to be ignored by the compiler until it sees
		 * the star-slash
		 * 
		 * The extra asterisks that are added for us on each line do not matter
		 * They are simply there for visual effect
		 * 
		 * I will be using these comments for notes within the projects
		 */
		
	}
	
	public static int add(int x, int y) {
		return x + y;
	}

}
