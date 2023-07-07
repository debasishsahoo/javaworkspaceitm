package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapIterating3 {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();

		hmap.put(1012, " John");
		hmap.put(1202, " Ricky");
		hmap.put(1303, " Deep");
		hmap.put(1404, " Mark");
		hmap.put(1505, " Maya");

// Iterating over entries of a map using entrySet() method.
		for (Entry<Integer, String> entry : hmap.entrySet()) {
			System.out.println("Id: " + entry.getKey() + ", Name: " + entry.getValue());
		}

		HashMap<String, String> hmap2 = new HashMap<>();

		hmap2.put("India", " Delhi");
		hmap2.put("USA", " Washington, D.C.");
		hmap2.put("Australia", " Canberra");
		hmap2.put("New Zealand", " Wellington");
		hmap2.put("Switzerland", " Bern");

		// Iteration over map using forEach() method.
		hmap2.forEach((k, v) -> System.out.println("Country: " + k + ", Capital: " + v));

		// Creating a hash map object of key type string and value type integer.
		HashMap<String, Integer> map = new HashMap<>();

		// Adding entries in hash map.
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);

		// Using Stream API to itrate over entries.
		map.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		});
		
		// Using forEach() method with lambda expression to iterate over hash map.
		   map.forEach((key, value) -> System.out.println(key + " = " + value));

	}
}