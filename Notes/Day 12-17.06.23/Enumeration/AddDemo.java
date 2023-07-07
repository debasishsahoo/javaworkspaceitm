package Enumeration;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AddDemo {
	public static void main(String[] args) {
// Create an object of ArrayList of String type.
		List<String> list = new ArrayList<>();

// Adding elements to array list.
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println("List: " + list);

		System.out.println();
		ListIterator<String> listIterator = list.listIterator();

		System.out.println("Forward Direction Iteration:");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		listIterator.add("E"); 
		// Adds an element before the iterator position.
		System.out.println();
		System.out.println(list);
		System.out.println();

		System.out.println("Backward Direction Iteration:");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		listIterator.set("J"); // It will update the last element returned by previous.
		System.out.println();
		System.out.println(list);
	}
}