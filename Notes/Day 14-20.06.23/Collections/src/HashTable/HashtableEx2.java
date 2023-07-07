package HashTable;

import java.util.Hashtable;

public class HashtableEx2 {
	public static void main(String[] args) {
// Create a Hashtable object.	
		Hashtable<String, Integer> ht = new Hashtable<>();

		ht.put("John", 20);
		ht.put("Shubh", 30);
		ht.put("Peter", 25);
		ht.put("Deep", 15);
		ht.put("Jonshan", 40);

		System.out.println("Original entries of hash table: " + ht);

// Replacing an entry for specified key from hash table.
		Integer replace = ht.replace("Peter", 60);
		System.out.println("Replacing entry for specified key: " + replace);
		System.out.println("Updated entries in hash table: " + ht);

// Checking specified key present in hash table.
		boolean containsKey = ht.containsKey("Shubh");
		System.out.println("Is key Shubh in hash table: " + containsKey);

// Checking specified value present in hash table.
		boolean containsValue = ht.containsValue(40);
		System.out.println("Is value 40 in hash table: " + containsValue);
	}
}