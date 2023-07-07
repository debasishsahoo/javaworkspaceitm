package Hashing;

import java.util.HashSet;

public class Hashset {
	public static void main(String args[]) {
		// HashSet declaration
		HashSet<String> hset = new HashSet<String>();

		// Adding elements to the HashSet
		hset.add("TATA");
		hset.add("Flipkart");
		hset.add("Scaler");
		hset.add("Phonepe");
		hset.add("Jio");
		// Addition of duplicate elements
		hset.add("Jio");
		hset.add("Flipkart");
		// Addition of null values
		hset.add(null);
		hset.add(null);

		// Displaying HashSet elements
		System.out.println(hset);
	}
}
