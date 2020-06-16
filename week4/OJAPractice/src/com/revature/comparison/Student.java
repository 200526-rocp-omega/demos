package com.revature.comparison;

import java.util.Objects;

public class Student implements Comparable<Student> {

	private int studentId;
	private String name;
	private int age;
	private String major;
	
	public Student() {
		super();
	}

	public Student(int studentId, String name, int age, String major) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.major = major;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, major, name, studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return age == other.age && Objects.equals(major, other.major) && Objects.equals(name, other.name)
				&& studentId == other.studentId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", major=" + major + "]";
	}

	// If Sally is supposed to be in line before Larry
	// Since our ordering is based off of student id
	// Sally should have a lower student id than Larry
	// In this case, Sally.compareTo(Larry) should be negative
	// Larry.compareTo(Sally) should be positive
	// Sally.compareTo(Sally) should be zero
	
	// Additional Note:
	// There should be no ties
	// The only way to get zero, should be if you're comparing something with itself
	@Override
	public int compareTo(Student o) {
		if(this.studentId < o.getStudentId()) {
			return -1;
		}
		
		if(this.studentId == o.getStudentId()) {
			return 0;
		}
		
		return 1;
	}
	// Since Student IDs are UNIQUE, there should be no ties
}
