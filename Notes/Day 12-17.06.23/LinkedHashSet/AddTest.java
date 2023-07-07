package LinkedHashSet;

import java.util.LinkedHashSet;

public class AddTest {
	public static void main(String[] args) {
// Create a Linked hash set of generic type.
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();

// Checking the size of LinkedHashSet before adding elements.
		int size = lhset.size();
		System.out.println("Size of LinkedHashSet before adding elements: " + size);

// Adding elements in the linked hash set.
		lhset.add("Red"); // lhset.size() is 1.
		lhset.add("Green"); // lhset.size() is 2.
		lhset.add("Yellow"); // lhset.size() is 3.
		lhset.add("Blue"); // lhset.size() is 4.
		lhset.add("Orange"); // lhset.size() is 5.

		System.out.println("Elements in Set: " + lhset);
		int size2 = lhset.size();
		System.out.println("Size of LinkedHashSet after adding elements: " + size2);

// Adding duplicate elements that already exist in set.
		lhset.add("Red"); // lhset.size() is still 5.
		lhset.add("Yellow"); // lhset.size() is still 5.

// Create another set of String type.
		LinkedHashSet<String> lhset2 = new LinkedHashSet<String>();
		lhset2.add("Brown");
		lhset2.add(null);

// Adding elements of set2 into set.
		lhset.addAll(lhset2);
		System.out.println("Elements in Set after adding: " + lhset);
	}
}