package com.revature.bitwise;

public class Driver {

	public static void main(String[] args) {
		// 0 -> false
		// 1 -> true
		
		// 0 or 0 -> 0  |  0 and 0 -> 0
		// 0 or 1 -> 1  |  0 and 1 -> 0
		// 1 or 0 -> 1  |  1 and 0 -> 0
		// 1 or 1 -> 1  |  1 and 1 -> 1

		// In java, the ^ symbol is XOR
		// 0 ^ 0 -> 0
		// 0 ^ 1 -> 1
		// 1 ^ 0 -> 1
		// 1 ^ 1 -> 0
		
		// In Java, the "or" and "and" operators have 2 varieties
		// "and" could be && or &
		// "or" could be || or |
		
		// The single variety is called a "bitwise" operator
		
		// These logical operations can be computed on numbers
		// And if you use the bitwise operation, it performs the logical operation
		// on an individual bit at a time
		
		// Whereas the standard logical operators apply to the entire value at once
		
		// Ex: Bitwise OR
		// 10111001
		// 00011111
		// --------
		// 10111111
		int x = 0b10111001 | 0b00011111;
		
		System.out.format("%s%n", Integer.toString(x, 2));// Format the result as a binary number
	}
}
