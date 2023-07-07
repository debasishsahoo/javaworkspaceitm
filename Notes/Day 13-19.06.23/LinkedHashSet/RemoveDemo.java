package LinkedHashSet;

import java.util.LinkedHashSet;

public class RemoveDemo {
	public static void main(String[] args) {
// Create a Linked hash set of generic type.
		LinkedHashSet<String> set = new LinkedHashSet<String>();

// Adding elements in the linked hash set.
		set.add("A");
		set.add("G");
		set.add("Y");
		set.add("B");
		set.add("O");
		set.add(null);

		System.out.println("Elements in set: " + set);

// Remove a string element from linked hash set.
		set.remove(null);
		System.out.println("Elements in set after removing: " + set);
		System.out.println(set.size() + " elements in set");

// Create another linked hash set of String type.
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		set2.add("S");
		set2.add(null);
		System.out.println("Elements in set2: " + set2);
		System.out.println(set2.size() + " elements in set2");

		System.out.println("Is S in set2? " + set2.contains("S"));

		set.addAll(set2);
		System.out.println("Elements in set after adding: " + set);

		set.removeAll(set2);
		System.out.println("Elements in set after removing set2: " + set);

		set.retainAll(set2);
		System.out.println("After removing common elements in set2 " + "from set, set is " + set);
	}
}