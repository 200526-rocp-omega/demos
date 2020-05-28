package com.revature.abstraction;

// The abstract keyword, which is used to declare abstract classes
// prevents us from instantiating this class
// We will never be allowed to use "new Person()"
// The purpose of abstract classes is to subclass them
public abstract class Person {
	private int age;
	private String name;
	
	/*
	 * We ONLY receive the default Constructor if we do NOT write ANY of our own Constructors.
	 * Previously, we had access to the default Constructor. When we added in the Constructor
	 * in the Person that takes 2 parameters, we LOST the default Constructor.
	 * Since the Student Class was using that default Constructor, the change we made
	 * to the Person Class broke the Student Class.
	 * In order to fix it, we had 2 options:
	 * 1) We could add in another Constructor to the Person Class that takes no parameters
	 * 2) We could change the Student Class to use the new Person Constructor that was just added
	 * 
	 */
	public Person() {
		super();
	}
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// The abstract keyword can also be used on methods
	// It is only allowed to be used in interfaces or abstract classes
	// Abstract methods DO NOT have a method body
	// They instead just end with a semicolon
	public abstract void speak();
}
