package com.revature.abstraction;

public class Student extends Person {
	
	private String major;
	
	// This syntax is what we use to create Constructor
	// It has an access modifier, no return type at all, and the method name must match the class name
	public Student() {
		// The very first statement of the Constructor, must be a call to either super() or this()
		// These two statements are a call to either one of this class's other Constructors or one of
		// the parent class's Constructors
		// This process will chain all the way up the inheritance tree up to the Object class
		// The Object class was written by Java themselves, and is at the top of every inheritance tree
		super(); // This will invoke the parent class's no argument constructor
		
		// The rest of the Constructor will involve initializing any fields that needs to be
		this.major = ""; // This is an empty String
		// This empty String will be the initial value for major instead of null
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override // This is called an annotation
	// This particular annotation enforces that this method does in fact override a method
	// in the parent class
	public void speak() {
		System.out.println("Hello my name is " + getName() + ", and I major in " + getMajor());
	}
	// Method overriding is where a child class changes the implementation of a method
	// The method will still have the same name, return type, and parameters
	// ONLY the implementation changes
}
