package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterationTest1 {
	public static void main(String[] args) {
// Creating a map object.
		Map<String, String> map = new HashMap<>();

// Adding elements into map using put() method.
		map.put("V ", " Violet");
		map.put("I ", " Indigo");
		map.put("B ", " Blue");
		map.put("G ", " Green");
		map.put("Y ", " Yellow");
		map.put("O ", " Orange");
		map.put("R ", " Red");

// Iterating map using Iterator.
// entrySet is a method that is used to get view of entries of a map.
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
		System.out.println("Iterating Entries of Map");
		while (itr.hasNext()) {
			Object key = itr.next();
			System.out.println(key);
		}
		
		
		
// keySet is a method that is used to get view of keys of a map
		Iterator<String> itr2 = map.keySet().iterator();
		System.out.println("Iterating Keys of Map");
		while (itr2.hasNext()) {
			Object keyView = itr2.next();
			System.out.println(keyView);
		}
// values is a method that is used to get values of keys of a map.
		Iterator<String> itr3 = map.values().iterator();
		System.out.println("Iterating Values of Map");
		while (itr3.hasNext()) {
			Object valuesView = itr3.next();
			System.out.println(valuesView);
		}
	}
}