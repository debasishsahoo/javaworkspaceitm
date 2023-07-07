package Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
	public static void main(String[] args) {
// Create object of vector class without using generic.
		Vector v = new Vector();

// Add ten elements of integer type using addElement() method. For this we will use for loop.
		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
// It will print all elements at a time like this [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

// Now we want to get elements one by one. So, we will require Enumeration concept.

// Create object of Enumeration by calling elements() method of vector class using object reference variable v.

// At the beginning, e (cursor) will point to index just before the first element in v.
		Enumeration e = v.elements();

// Checking the next element availability using reference variable e and while loop.
		while (e.hasMoreElements()) {
			// Moving cursor to next element.
			Object o = e.nextElement();
			// Now type casting is required because the return type of nextElement() method
			// is an object.
			// Therefore, it's compulsory to require type casting.
			Integer i = (Integer) o;

			System.out.println(i);
		}
		
		
		
		
		
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			Object o = en.nextElement();
			Integer it = (Integer) o;
			// Getting even elements one by one.
			if (it % 2 == 0) {
				System.out.println(it);
			}
		}
	}
}