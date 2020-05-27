package com.revature.other;

import com.revature.accessmods.Person;

public class Student extends Person {

	public int studentId;
	String major; // Default access, since there is a lack of an access modifier keyword
	
	private int age = 5;
	
	public void printAge() {
		System.out.println(this.age);
		System.out.println(this.getAge());
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
