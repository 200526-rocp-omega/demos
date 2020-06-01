package com.revature.varargs;

public class Driver {

	public static void main(String[] args) {
		Driver d = new Driver();

		System.out.println(d.add(5, 10)); // Will invoke the first add method
		
		System.out.println(d.add(5, 5, 5)); // Will invoke the second add method
		
		System.out.println(d.add()); // Zero parameters
		System.out.println(d.add(15)); // One parameter
		System.out.println(d.add(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)); // 15 parameters
	}

	public int add(int x, int y) {
		return x + y;
	}
	
	public int add(int x, int y, int z) {
		return x + y + z;
	}
	
	// This is called varargs (or var-args)
	// It allows for a single method definition that supports any number of parameters
	// You may also have other parameters as well, and the var-args parameter must be the last
	// one listed
	public int add(int...values) {
		// values will be an array of type int
		// and will contain all of the parameters
		
		int sum = 0;
		for(int val : values) {
			sum += val;
		}
		
		return sum;
	}
	
	// This method is an unrelated example that might help with type conversion
	// The goal of this method is to round the input to the closest whole number
	public long round(double value) {
		long roundDown = (long) value;
		// The above statement casts the double as a long
		// the result is that the decimal portion will be truncated
		// and the effect is that we are rounding down no matter what
		
		// We can obtain the decimal portion by subtracting roundDown from value
		double decimalPortion = value - roundDown;
		
		// Below is the ternary operator
		// it will evaluate to the left if the condition is true
		// otherwise it will evaluate to the right
		// the syntax is (condition) ? trueResult : falseResult
		return (decimalPortion >= .5) ? roundDown + 1 : roundDown;
	}
}
