package com.revature.exceptions;

public class Driver {

	public static void main(String[] args) throws Exception {
		myMethod1();
		
		someRiskyMethod();
		
		System.out.println(finallyPractice());
		
		System.out.println(withdraw(1000, 250)); // Withdraw $250 from $1000
		
		try {
			System.out.println(withdraw(250, 1000)); // Withdraw $1000 from $250
		} catch(OverdraftException e) {
			e.printStackTrace();
		}
		
		System.out.println("The program has ended!");
	}
	
	// In order for a try block to be syntactically acceptable
	// it must be followed by either:
	// 1) at least 1 catch block
	// 2) a finally block
	public static void myMethod1() {
		try {
//			System.out.println(7 / 0); // Throws an ArithmeticException
//			System.out.println((new int[0])[1]); // Throws an ArrayIndexOutOfBoundsException
			throw new ArithmeticException("Division by zero"); // We can throw our own exceptions
		} catch(ArithmeticException e) {
			// We have handled the exception
			e.printStackTrace();
			// We can print to the console the stack trace of the exception
			// This can potentially be the way in which we handle the exception
		}
	}
	
	public static void someRiskyMethod() throws Exception {
		System.out.println("Some risky method!");
//		throw new Exception("Risky method was risky");
	}
	
	// The finally block WILL ALWAYS execute no matter what
	// Whether an exception occurs or not, the finally block will still run
	// This creates some odd results when combined with return statements
	// If we attempt to return inside a try-catch block, but there is also
	// a finally block
	// The program will momentarily interrupt the return, in order for the finally
	// block to execute
	// And if the finally block ALSO returns something, the original return value
	// will be overwritten
	public static int finallyPractice() {
		try {
			return 1 / 0;
		} catch(Exception e) {
//			System.exit(0);
			// System.exit() will instantly shut down the application
			// This is the ONLY way to prevent the finally block from executing
			return 5;
		} finally {
			return 10;
		}
	}
	
	public static double withdraw(double balance, double amountToWithdraw) {
		if(amountToWithdraw > balance) {
			throw new OverdraftException("Attempted to withdraw too many funds!");
		}
		
		System.out.println("We withdrew $" + amountToWithdraw + " from your account!");
		
		double remainingBalance = balance - amountToWithdraw;
		return remainingBalance;
	}
}
