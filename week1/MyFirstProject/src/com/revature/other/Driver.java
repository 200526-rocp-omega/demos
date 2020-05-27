package com.revature.other;

public class Driver {

	public static void main(String[] args) {
		Student s = new Student();

		s.setName("Larry");
		System.out.println(s.getName());
		
		// The below statement does not compile, since we do not have access to default access from
		// a different package
//		System.out.println(s.defaultAccess);
	}

}
