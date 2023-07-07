package LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapEx3 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> lhmap = new LinkedHashMap<>();
		lhmap.put("En", "English");
		lhmap.put("Hi", "Hindi");
		lhmap.put("Ta", "Tamil");
		lhmap.put("De", "German");
		lhmap.put("Fr", "French");

		System.out.println("Entries in LinkedHashMap lhmap: " + lhmap);

// Call remove() method to delete an entry for specified key.
		lhmap.remove("De");
		System.out.println("Updated Entries in LinkedHashMap: " + lhmap);

// Call replace() method to replace specified value for a specified key.
		lhmap.replace("En", "English-US");
		System.out.println("After replacing, updated entries in LinkedHashMap: " + lhmap);

// Call containsValue() method to determine specified value for specified key.
		boolean value = lhmap.containsValue("Hindi");
		System.out.println("Is Hindi present in LinkedHashMap: " + value);
	}
}