package com.revature.strings;

public class Driver {

	public static void main(String[] args) {
		System.out.println(String.format("%s said hello to %s!", "Larry", "Sally"));
		
		System.out.format("%09.3f was%nrounded to %d!%n", 33.55, Math.round(33.55));
		// You can also access it directly with System.out.format() if you only intend
		// on printing out the result, and don't need to save it.
		// Note, this method does not automatically add a newline for you
		
		/*
		 * The String class has a static method called format(), that lets
		 * you format Strings using special "format specifiers".
		 * They generally begin with a % symbol.
		 * There are many different categories of specifiers and there
		 * are many options for them.
		 * 
		 * %d is a whole number of base 10
		 * %s is a String
		 * %n is a newline character
		 * %f is a decimal-valued number (base 10)
		 * There are many more
		 */
		
		System.out.format("%%");
	}
}
