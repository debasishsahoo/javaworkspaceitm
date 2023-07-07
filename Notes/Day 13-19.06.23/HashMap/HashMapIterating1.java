package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapIterating1 {
	public static void main(String[] args) {
		HashMap<Character, String> hmap = new HashMap<>(); // Creating a hash map.

// Adding entries in hash map.
		hmap.put('V', "Violet");
		hmap.put('I', "Indigo");
		hmap.put('B', "Blue");
		hmap.put('G', "Green");
		hmap.put('Y', "Yellow");
		hmap.put('O', "Orange");
		hmap.put('R', "Red");

// Creating an Iterator object using iterator() method.
// entrySet is a method that is used to get view of entries of a hash map.
		Iterator<Entry<Character, String>> itr = hmap.entrySet().iterator();
		System.out.println("Iterating Entries of HashMap");
		while (itr.hasNext()) {
			Object key = itr.next();
			System.out.println(key);
		}
// Iterating over hash map keys.
// keySet is a method that is used to get view of keys of a hash map.
		Iterator<Character> itr2 = hmap.keySet().iterator();
		System.out.println("Iterating Keys of HashMap");
		while (itr2.hasNext()) {
			Object keyView = itr2.next();
			System.out.println(keyView);
		}
// Iterating over values.
// values is a method that is used to get values of keys of a hash map.
		Iterator<String> itr3 = hmap.values().iterator();
		System.out.println("Iterating Values of HashMap");
		while (itr3.hasNext()) {
			Object valuesView = itr3.next();
			System.out.println(valuesView);
		}
	}
}