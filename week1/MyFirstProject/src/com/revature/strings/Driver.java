package com.revature.strings;

public class Driver {

	public static void main(String[] args) {
		String s = "This is my house";
		
		System.out.println(s);
		System.out.println("This is my house");
		System.out.println(s == "This is my house"); // With primitives, the == operator compares the values
		// But for objects, the == operator compares the memory location
		// The above statement on line 10, will output whether they reference the same object in the heap
		
		System.out.println(s.equals("This is my house"));
		// the equals method exists on the Object class, which means ALL objects will inherit this method
		// By default, the implementation that gets inherited is the same as the == operator
		// So classes must override this equals method in order to properly compare
		
		String s2 = "Hello"; // Inside the String Pool
		// compare the substring of s2 (the last 2 characters) = "lo" with the String literal "lo"
		System.out.println(s2.substring(3).equals("lo")); // Checking if they have the same content
		System.out.println(s2.substring(3) == "lo"); // Checking if they have same memory location
		
		String s3 = new String("Hello"); // Outside the String Pool
		System.out.println(s3.equals(s2)); // Will be true
		System.out.println(s3 == s2); // Will be false
		
		System.out.println(s2 == s3.intern()); // Will be true
		// The intern method will find or generate a String inside the String Pool that matches the current
		// String
		
		String str = "This is my house";
		str.substring(11); // "house"
		System.out.println(str); // Output is "This is my house"
		
		str = str.substring(11);
		System.out.println(str); // Output is "house"
		
		// Java additionally has 2 classes: StringBuilder and StringBuffer
		// that are similar to Strings, except that they CAN be modified
		
		// StringBuilder and StringBuffer are pretty much the same except that StringBuffer
		// is thread-safe whereas StringBuilder is NOT thread-safe
		// Due to this extra safety, StringBuffer is a bit slower than StringBuilder
		
		StringBuilder sb = new StringBuilder("Hello");
		
		// In a multi-threaded scenario, it used to be recommended to use StringBuffer
		// However, in more recent years the recommendation is still to use StringBuilder
		// but you would implement your own thread-safety around it, where needed
		
		sb.reverse(); // StringBuilder IS mutable
		
		System.out.println(sb); // Note: System.out.println will invoke the toString method on objects it receives
		// Note that toString is ALSO a method on the Object Class, and similar to equals, should be
		// overridden in your own classes
		
		// Check out some of the methods in the String and StringBuilder classes to familiarize yourself
		// with some possibilities
	}

}
