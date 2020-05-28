package com.revature.abstraction;

// The abstract keyword, which is used to declare abstract classes
// prevents us from instantiating this class
// We will never be allowed to use "new Person()"
// The purpose of abstract classes is to subclass them
public abstract class Person {
	private int age;
	private String name;
	
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
