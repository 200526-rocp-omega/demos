package com.revature.abstraction;

public class Employee extends Person {

	private String company;
	
	public Employee() {
		super();
	}
	
	public Employee(int age, String name, String company) {
		super(age, name);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void speak() {
		System.out.println("Hello, my name is " + getName() + " and I work at " + getCompany());
	}

}
