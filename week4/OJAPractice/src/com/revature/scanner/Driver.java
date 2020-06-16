package com.revature.scanner;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// So sometimes we might want to read user input from the console
		// (Or perhaps from other sources such as an InputStream)
		// There is a built-in class called Scanner that allows us
		// to read from the InputStream that represents the console

		// There is a System.in static variable, which is of type InputStream
		// And this specific variable represents the console
		
		System.out.println(System.in);
		
		// So that InputSteam just represents a "stream" of inputs coming in
		
		// The Scanner class allows us to parse and process this data
		
		Scanner scan = new Scanner(System.in); // Import Scanner from java.util
		// We pass in a InputStream into the Constructor
		
		for(int i = 0; i < 10; i++) {
			System.out.println(scan.next());
		}
		
		System.out.println(scan.next());
		// When you perform a method such as next() on the System.in InputStream
		// Your console will be paused, and waiting for input, ONLY IF the buffer
		// was ALREADY empty
		
		// If there was data left over in the System.in InputStream, then it will parse
		// that data first and the application will NOT pause
		
		System.out.println(scan.nextLine());
		
		// The above statement worked perfectly fine, however, the buffer had a newline character
		// left over. So, the nextLine() obtained the empty string as a result
		
		// This was caused because our usage of parsing individual tokens left the newline character'
		// at the end
		System.out.println(scan.nextLine()); // This time, the buffer is empty, so we will be
		// prompted for more information
		
		System.out.println("First line\nSecondLine");
	}
}
