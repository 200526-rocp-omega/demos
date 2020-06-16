package com.revature.comparison;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		/*
		 * As discussed previously, the relational operators
		 * (outside of == and !=) do NOT work with objects
		 * 
		 * This can be a problem, since sometimes we might want to
		 * know if one object is greater than or less than another
		 * object.
		 * 
		 * So to address this, Java has 2 built in interfaces:
		 * Comparable
		 * Comparator
		 * 
		 * These are BOTH Generic Interfaces
		 * Comparable allows us to define the "natural" ordering
		 * Whereas Comparator is used to define other means of ordering
		 * 
		 * For example, let's say you want to order Students by student id
		 * as the "default"
		 * 
		 * In this case, we could use the Comparable interface to compare Students
		 * based on their student id.
		 * 
		 * However, theoretically, we could also compare Students by their ages
		 * or their majors.
		 * 
		 * These aren't the "default" or "natural" ordering, but it is something
		 * we may want to do.
		 */
		
		List<Student> allStudents = Arrays.asList(
				new Student(5, "Larry", 20, "Economics"),
				new Student(1, "Sally", 18, "Mathematics"));
		
		System.out.println(allStudents);

		Collections.sort(allStudents); // Our natural ordering should now have Sally and then Larry

		System.out.println(allStudents);
		
		Collections.sort(allStudents, new NameComparator());
		// Our other ordering should now have Larry and then Sally
		
		System.out.println(allStudents);
	}
}
