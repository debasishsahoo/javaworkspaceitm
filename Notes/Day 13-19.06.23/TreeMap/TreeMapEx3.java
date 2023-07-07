package TreeMap;

import java.util.TreeMap;

public class TreeMapEx3 {
	public static void main(String[] args) {
// Creating a TreeMap object of generic type.
		TreeMap<Character, String> tmap = new TreeMap<>();

// Adding entries in tree map.
		tmap.put('A', "Apple");
		tmap.put('P', "Parot");
		tmap.put('C', "Cat");
		tmap.put('B', "Boy");
		tmap.put('D', "Dog");

		Object entrySet = tmap.entrySet();
		System.out.println("Entry set: " + entrySet);
		System.out.println("Key set: " + tmap.keySet());
		System.out.println("Value set: " + tmap.values());

		Object vGet = tmap.get('C');
		System.out.println("C: " + vGet);

		boolean containsKey = tmap.containsKey('B');
		System.out.println("Is key 'B' present in map: " + containsKey);

		boolean containsValue = tmap.containsValue("Apple");
		System.out.println("Is Apple present in map: " + containsValue);
	}
}