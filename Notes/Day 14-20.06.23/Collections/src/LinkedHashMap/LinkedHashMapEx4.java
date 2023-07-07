package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx4 {
	public static void main(String[] args) {
		final int max = 5;
		LinkedHashMap<String, String> lhmap = new LinkedHashMap<String, String>() {
			protected boolean removeEldestEntry(Map.Entry<String, String> e) {
				return size() > max;
			}
		};

		lhmap.put("R", "Red");
		lhmap.put("G", "Green");
		lhmap.put("B", "Brown");
		lhmap.put("O", "Orange");
		lhmap.put("P", "Pink");

		System.out.println("Initial Entries of LinkedHashMap");
		System.out.println(lhmap);

// Adding more entry into linked hash map.
		lhmap.put("W", "White");
		System.out.println("Displaying Map after adding more entry: " + lhmap);

		lhmap.put("Y", "Yellow"); // Adding one more entry into linked hash map.
		System.out.println("Displaying Map after adding one more entry: " + lhmap);
	}
}