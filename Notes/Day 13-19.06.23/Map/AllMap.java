package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AllMap {
	public static void main(String[] args) {
// Create a map of generic type.
		Map<Integer, String> map = new HashMap<>();
		
		
		

// Checking map is empty or not.
		boolean isEmpty = map.isEmpty();
		System.out.println(" Is Map is empty? " + isEmpty);

// Adding entries in the map. Call put() method to add entries in map.
		map.put(101, "Red");
		map.put(103, "Green");
		map.put(102, "Yellow");
		map.put(104, "Blue");
		map.put(106, "Pink");

		System.out.println("Entries in Map: " + map);
		int size = map.size();
		System.out.println("No. of entries in Map: " + size);


// Create another map.
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(115, "Brown");
		map2.put(120, "Purple");
		map2.put(125, "Green");

// Inserting elements of map2 into map.
		map.putAll(map2);
		System.out.println("Entries in updated Map: " + map);

		// Removing an entry for the specified key.
		map.remove(104);
		System.out.println("Entries in Map after removing an entry: " + map);

		// Removing specified value associated with the specified key from the map.
		map.remove(106, "Pink");
		System.out.println("Entries in Map after removing Pink: " + map);
		map.clear();
		System.out.println(map);
		
		
		Map<String, String> FMap = new HashMap<>();

		FMap.put("A", "Apple");
		FMap.put("B", "Boy");
		FMap.put("C", "Cat");
		FMap.put("D", "Dog");
		FMap.put("E", "Elephant");
		System.out.println("Orignal Entries in Map: " + FMap);

		
		// Replacing a specified value for a specified key.
		FMap.replace("E", "Element");
		System.out.println("Updated Entries in Map after replacing: " + FMap);

		// Replace old value with a new value.
		FMap.replace("B", "Boy", "Bucket");
		System.out.println(FMap);

		Map<String, String> ssmap = new HashMap<>();

		ssmap.put("B", "B");
		ssmap.put("D", "H");
		ssmap.put("A", "A");
		ssmap.put("C", "R");
		ssmap.put("E", "T");

		Set<String> keys = ssmap.keySet();
		System.out.println("Set view of keys: " + keys);

		Collection<String> values = ssmap.values();
		System.out.println("Collection view of values: " + values);
		
		
		Map<String, String> cmap = new HashMap<>();

		   cmap.put("V", "Violet");
		   cmap.put("I", "Indigo");
		   cmap.put("B", "Blue");
		   cmap.put("G", "Green");
		   cmap.put("Y", "Yellow");
		   cmap.put("O", "Orange");
		   cmap.put("R", "Red");

		  String value = cmap.get("V"); // It will return a value for specified key in this cmap.
		  System.out.println(value);

		  boolean entryKey = cmap.containsKey("B");
		  System.out.println(entryKey);

		  boolean entryValue = cmap.containsValue("Brown");
		  System.out.println(entryValue);
		
		

	}
}