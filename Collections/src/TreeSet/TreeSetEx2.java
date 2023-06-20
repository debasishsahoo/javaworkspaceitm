package TreeSet;

import java.util.TreeSet;

public class TreeSetEx2 {
	public static void main(String[] args) {
// Creating an TreeSet object of type String.
		TreeSet<String> ts = new TreeSet<>();

// Adding string objects to tree set.
		ts.add("India");
		ts.add("USA");
		ts.add("Australia");
		ts.add("New zealand");
		ts.add("Switzerland");
		
// Checking for a specific element in set.
		boolean element = ts.contains("USA");
		System.out.println("Is USA in TreeSet: " + element);

// Removing element from the tree set.
		ts.remove("New zealand");
		System.out.println("Sorted tree set: " + ts);
		ts.clear();
		System.out.println("Elements in tree set: " + ts);
	}
}


























