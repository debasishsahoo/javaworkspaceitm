package LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapEx1 {
	public static void main(String[] args) {
// Create a LinkedHashMap instance.	
		LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<>();

// Checking the size of linked hash map before adding entries.
		int size = lhmap.size();
		System.out.println("Size of LinkedHashMap before adding entries: " + size);

// Checking linked hash map is empty or not before adding entries. 
		boolean isEmpty = lhmap.isEmpty();
//		System.out.println("Is LinkedHashMap empty: " + isEmpty);

// Adding entries in linked hash map. 
		lhmap.put("John", 30);
		lhmap.put("Peter", 25);
		lhmap.put("Ricky", 23);
		lhmap.put("Deep", 28);
		lhmap.put("Mark", 32);

		System.out.println("Display entries in LinkedHashMap");
		System.out.println(lhmap);

		int size2 = lhmap.size();
		System.out.println("Size of LinkedHashMap after adding entries: " + size2);

// Adding null as key and value.
		lhmap.put(null, null);
		System.out.println(lhmap);
	}
}