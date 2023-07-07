package vectorTest;

import java.util.ArrayList;
import java.util.Vector;

public class VectorTest1 {
	public static void main(String[] args) {
// Create an empty vector object with an initial capacity of 5.
		Vector v = new Vector();

// Check the size of vector before adding elements.
		int size = v.size();
		System.out.println("Size of vector before adding elements: " + size);

// Adding elements to a vector using reference variable v.
		v.add("Red");
		v.add("Green");
		v.add("Yellow");
		v.add("Pink");
		v.add("White");
		System.out.println("Vector elements: " + v);

// Check size and capacity.
		int vectorsize = v.size();
		System.out.println("Size: " + vectorsize);

		int capacity = v.capacity();
		System.out.println("Default capacity: " + capacity);

// Adding elements using addElement() method.
		v.addElement(null);
		v.addElement(20);
		v.add(5, 15);
		int newsize = v.size();
		System.out.println("New size after adding elements: " + newsize);

		int newcapacity = v.capacity();
		System.out.println("New capacity after adding elements: " + newcapacity);
		System.out.println("Elements order after addition: " + v);

// Create an ArrayList with an initial capacity of 10.
		ArrayList al = new ArrayList();

// Adding elements using reference variable al.
		al.add("Brown");
		al.add("Black");

// Call addAll() method to add collection of elements into vector.
		v.addAll(al);

// Now check size and capacity of the vector.
		int vsize = v.size();
		System.out.println("Size: " + vsize);
		int vcapacity = v.capacity();
		System.out.println("Vcapacity: " + vcapacity);

// Adding 11th element to check size and capacity.
		v.add(10);
		System.out.println("Elements: " + v);

		int vecsize = v.size();
		System.out.println("Size after adding 11th element: " + vecsize);

		int cap = v.capacity();
		System.out.println("Capacity after adding 11th element: " + cap);
	}
}