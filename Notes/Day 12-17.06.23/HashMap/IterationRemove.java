package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IterationRemove {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();

		hmap.put(5, "Five");
		hmap.put(10, "Ten");
		hmap.put(15, "Fifteen");
		hmap.put(20, "Twenty");
		hmap.put(25, "Twenty-five");
		hmap.put(30, "Thirty");

// Here, entrySet is a method that is used to get a view of entries of a map.
		Iterator<Entry<Integer, String>> itr = hmap.entrySet().iterator();
		System.out.println("Iterating Entries of HashMap");
		while (itr.hasNext()) {
			Object key = itr.next();
			System.out.println(key);
		}
// Removing the last entry returned by Iterator 
		itr.remove(); // This method will remove the last entry of a hash map while iterating.
		System.out.println("Entries of HashMap after removing: " + hmap.entrySet());

		// Iterating over keys of a hashmap using keySet() method.
		for (Integer num : hmap.keySet())
			System.out.println("Number: " + num);
		System.out.println();

		// Iterating over values of a hashmap using values() method.
		for (String word : hmap.values())
			System.out.println("Word: " + word);
	}
}
