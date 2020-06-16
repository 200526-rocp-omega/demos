package com.revature.comparison;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// This if statement determines if o1's name is alphabetically before o2's name
		if(o1.getName().compareTo(o2.getName()) < 0) {
			return -1;
		}
		
		// If their names match, then we need to compare their
		// student IDs to prevent ties
		if(o1.getName().equals(o2.getName())) {
			return o1.compareTo(o2);
			// We are using the natural ordering if their names are the same
			// The natural ordering will handle the student ids for us
		}
		
		return 1;
	}
}
