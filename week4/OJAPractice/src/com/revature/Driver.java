package com.revature;

import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		Random r = new Random();
		
		int x = r.nextInt(6); // Generate a number between [0 - 5] (The upper bound is exclusive)
		System.out.println(x);
		
		int y = (int) Math.round(Math.random() * 5); // Generate a number between [0 - 5]
		// Math.random() * 5 -> 0 - 4.99999... -> round() -> 0 - 5
		int z = (int) Math.floor(Math.random() * 6); // Generate a number between [0 - 5]
		// Math.random() * 6 -> 0 - 5.9999... -> floor() -> 0 - 5
		
		int other = (int) Math.ceil(Math.random() * 6); // Generate a number between [0 - 6]
		// Math.random() * 6 -> 0 - 5.9999 -> ceil() -> 0 - 6
		
//		for(int i = 0; i < 100; i++) {
//			int val = r.nextInt(397) + 4; // [4 - 400] (inclusive)
//			
//			double result = Math.log10(val);
//			
//			System.out.println(result);
//		}
		
		for(int i = 0; i < 100; i++) {
			double val = r.nextDouble() * 2; // [0 - 2)
			
			double result = Math.log10(val);
			
			System.out.println(result);
		}
	}
	/*
	 * The Math class is a helper class that has many mathematical methods
	 * (as well as some constants). Everything is static, so we do not
	 * need to instantiate the Math class. The Math class comes from
	 * the java.lang package, so it does NOT need to be imported.
	 * 
	 * Random is another helper class that has many methods to obtain random
	 * values. This class DOES need to be instantiated. The Random class
	 * comes from the java.util package, so it DOES need to be imported.
	 * 
	 * Technically, the Math class does have some methods to obtain
	 * random values, but it is recommended to use the Random class
	 * instead.
	 */
}
