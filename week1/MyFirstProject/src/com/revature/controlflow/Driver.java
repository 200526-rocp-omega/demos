package com.revature.controlflow;

import java.util.List;
import java.util.ArrayList;

public class Driver {
	
	/*
	 * There are many structures that can be used to modify the flow
	 * of an application.
	 * The application will always start at the main method
	 * and will execute in sequence statement by statement
	 * 
	 * Control flow structures allow us to change the flow of this sequence
	 * 
	 * if
	 * if-else (which can be chained with even more if-elses)
	 * while loops
	 * for loops
	 * do-while loops
	 * enhanced for-loops
	 * switch statements
	 */

	public static void main(String[] args) {
		int var = 700;
		
		// You can switch on these types: int, char, short, and byte,
		// as well as well as their Wrapper Classes, Enums, and Strings ONLY

		switch(var) {
		case 300:
			System.out.println("Three Hundred");
			break; // This allows us to prematurely break out of any loop structure (not including if or if-elses)
			// The break statement is VERY important for the switch statement
			// Without it, the switch statement will "fall through" to the next case, and execute multiple cases
			// This odd behavior can be purposefully used if desired, but it is hard to recognize, so generally
			// it is not recommended
		case 200:
			System.out.println("Two Hundred");
			break;
		case 100:
			System.out.println("One Hundred");
			break;
		default: // The default case will execute if the switch value does not match any case
			System.out.println("Something else");
			break;
		}
		
		// Enhanced for-loop is also known as the for-each loop
		// Enhanced For-Loop works with Arrays or Collections
		int[] arr = {4, 5, 6}; // Example of an array
		
		int[] arr2 = new int[5]; // Declaring an int array of size 5
		// All 5 values are initialized to the int type default (which is zero)
		// Below is an example of a regular for-loop
		for(int index = 0; index < arr.length; index++) {
			arr2[index] = arr[index]; // Copy every value over to the new array
		}
		
		List<Integer> myList = new ArrayList<>(); // Example of Collection
		myList.add(7);
		myList.add(8);
		myList.add(9);
		
		// The first portion of the enhanced for loop is the type of element in the array/collection
		// One characteristic of the enhanced for loop is that you are not allowed to modify the size of the
		// collection while you are in an enhanced for-loop
		for(int i : arr) {
			System.out.println(i);
		}
		
		for(Integer i : myList) {
			System.out.println(i);
//			myList.remove(i); // Modifying the size of a collection while inside
			// of an enhanced for-loop will cause a ConcurrentModificationException
			// It is NOT allowed
		}
		
		if(var < 700) {
			System.out.println("We were at most 699");
		} else {
			System.out.println("We were greater than or equal to 700");
		}
		
		if(var <= 100) {
			System.out.println("One Hundred or Less");
		} else if(var <= 200) {
			System.out.println("Two Hundred or Less");
		} else if(var <= 300) {
			System.out.println("Three Hundred or Less");
		} else {
			System.out.println("Larger than 300");
		}
		
		int count = 5;
		while(count > 5) {
			System.out.println(count);
			count--; // Decrement by 1
		}
		// the value of count is still five
		
		// do-while loops will skip the very first conditional check
		// and due to this, they will always execute at least once
		
		do {
			System.out.println(count);
			count--;
		} while(count > 5); // Even though this condition was false before we started
		// the do-while loop still runs the first time
		// Only afterwards does it check the condition, which is false, so the loop ends after 1 iteration
	}

}
