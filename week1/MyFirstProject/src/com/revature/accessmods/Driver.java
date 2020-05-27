package com.revature.accessmods;

public class Driver {
	
	/*
	 * Access Modifiers can be provided to methods as well as instance/static variables
	 * There are 4 access modifiers in Java:
	 * 		public
	 * 		private
	 * 		protected
	 * 		default
	 * 
	 * public access:
	 * 		Provide access from everywhere/anywhere
	 * 
	 * private access:
	 * 		Provide access only from within the same class
	 * 
	 * protected access:
	 * 		Provide access to classes within the same package, or subclasses
	 * 
	 * default access:
	 * 		Provide access to classes only within the same package
	 * 		(commonly referred to as package-private)
	 */

	public static void main(String[] args) {
		Student s = new Student();
		
		System.out.println(s.studentId);
		
		s.major = "Mathematics";
		System.out.println(s.major);
		
		s.name = "Larry";
		System.out.println(s.name);
		
//		System.out.println(s.age);
		// The above statement does not compile since age was private, so it was not accessible
		// from inside Student
		
		System.out.println(s.getAge());
		
		s.printAge();
	}
}
