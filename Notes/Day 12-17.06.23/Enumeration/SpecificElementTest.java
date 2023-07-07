package Enumeration;

import java.util.ArrayList;
import java.util.ListIterator;

public class SpecificElementTest {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <= 9; i++) {
			al.add(i);
		}
		System.out.println(al);

		ListIterator<Integer> litr = al.listIterator(4); // Iterating through a specific element '4'.
		while (litr.hasNext()) {
			Integer it = litr.next();
			System.out.println(it);
		}
		while (litr.hasPrevious()) {
// This statement will throw 
//ConcurrentModificationException 
//because we can not add an element in the ArrayList during Iteration.
			al.add(20);
			Integer it1 = litr.next();
			System.out.println(it1);
		}
	}
}