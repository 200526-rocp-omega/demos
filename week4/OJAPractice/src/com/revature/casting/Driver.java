package com.revature.casting;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		Object o = new String("Larry");
		// This is an example of Covariance
		
		// But sometimes, we need to change the type of the reference variable
		
		// If you need to make the reference variable more broad, that is easy
		// and casting is not required
		
		String s = "Hello World";
		Object someObj = s; // No casting required
		// This is called up-casting
		// And we are moving the reference variable UP the class heirarchy of the object
		
		
		// Moving DOWN the class heirarchy can be risky
		// Because we don't know what type the object is until the program is running
		// Which means it is entirely possible that the object we have
		// is not of the type it should be
		
		Object obj = new Object(); // If we mistakenly thought this was a String
		// We might try to change the reference variable to String
		
//		String s2 = (String) obj; // This compiles!!!
		// However, we know where obj came from, so we know this will not work
		// We receive a ClassCastException
		
		// But if we try down-casting a reference variable that DOES point to a String, it works!
		
		String s3 = (String) someObj; // This works, because someObj did in fact point to a String object
		
		System.out.println(s3);
		
		// The below block of code is related, but much more niche, and complex
		List<Integer> myNumbers = new ArrayList<>();
		List<? extends Number> castedList = myNumbers; // Effectively up-casts the Integers into Numbers
		// Note that the below statement does NOT work
//		List<Number> otherCastedList = myNumbers;
		
		List<Integer> downCastList = (List<Integer>) castedList; // down-cast back to List<Integer>
		
		// List has a Class Heirarchy
		// And the Generic has a Class Heirarchy
		// They are not the same heirarchies
		// ArrayList <- List & AbstractList <- Object
		Iterable<Integer> iterable = myNumbers; // Up-casting the base type
		List<Integer> myNumbers2 = (List<Integer>) iterable; // Down-casting the base type back
		
		// Integer <- Number <- Object
		
		// The complex stuff is done
		
		// You may also cast primitive values
		// Generally, primitives of the same category but of different sizes
		// are casted most frequently
		
		long l = 55L;
		
		int x = (int) l; // This is an example of down-casting
		// Requires an explicit cast
		// But in terms of primitives, it is caused by the SIZE of the primitive
		
		// However, when casting to a larger size, no casting syntax needed
		
		char c = 33;
		int y = c; // No casting syntax needed here since int is larger in size than char
		
		
		// You can also cast between different categories of primitives
		double d = 33.55;
		
		int z = (int) d; // double and int are different categories
		// double is a decimal valued number
		// int is a whole number
		// But we can cast them
		System.out.println(z); // Note, that decimal valued numbers will get truncated
		
		// There are some combinations that cannot be converted/casted
//		boolean b = (boolean) z;
		
		// Everything except for boolean can be casted back and forth
		
		// Additional note
		// Objects cannot be casted into primitives
		// However, due to wrapper classes, the objects of the Wrapper classes
		// will first be "auto-unboxed" into a primitive, and then that primitive
		// can be casted
		
		Integer val = new Integer(17);
		
		int number = val; // There are some cases where you might need explicit casting
		// But in this case, it is not needed
		
		Object o2 = val;
		
		int number2 = (int) o2; // Won't work without casting
		// This situation can potentially throw exceptions as well if you are not careful
		
//		int testVal = (int) (Object) "Larry";
		// The above throws an Exception
	}
}
