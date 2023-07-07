package HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashtableEx3 {
	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<>();

		ht.put("John", 20);
		ht.put("Shubh", 30);
		ht.put("Peter", 25);
		ht.put("Deep", 15);
		ht.put("Jonshan", 40);

		System.out.println("Original entries of hash table: " + ht);

// Iterating elements of hash table using iterator() method.
		System.out.println("Iterating keys of hash table:");
		Iterator<String> itr = ht.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\n");

		System.out.println("Iterating values of hash table:");
		Iterator<Integer> itrValue = ht.values().iterator();
		while (itrValue.hasNext()) {
			System.out.println(itrValue.next());
		}
		System.out.println("\n");
		System.out.println("Iterating entries of hash table:");

		Iterator<Entry<String, Integer>> itrEntry = ht.entrySet().iterator();
		while (itrEntry.hasNext()) {
			System.out.println(itrEntry.next());
		}
	}
}