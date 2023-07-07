package HashMap;

import java.util.HashMap;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(5, "Banana");
		hmap.put(10, "Mango");
		hmap.put(15, "Apple");

		System.out.println("Entries in HashMap: " + hmap);
		System.out.println("Size of HashMap: " + hmap.size());

// Adding duplicate key in hash map.
		hmap.put(10, "Guava"); // Still hmap.size is 3.
		hmap.put(20, "Banana"); // Adding duplicate value.

		System.out.println("Updated entries in HashMap: " + hmap);
		System.out.println("Size after adding duplicate value: " + hmap.size());
	}
}