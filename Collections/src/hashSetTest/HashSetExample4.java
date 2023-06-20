package hashSetTest;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample4 {
	public static void main(String[] args) {
		Set<String> pCountry = new HashSet<String>();

// Check that HashSet is empty or not.
System.out.println("Is popularCountries set empty? : " + pCountry.isEmpty());
System.out.println("Number of countries in HashSet before adding: " + pCountry.size());

// Adding elements to hash set.
		pCountry.add("INDIA");
		pCountry.add("USA");
		pCountry.add("UK");
		pCountry.add("FRANCE");

// Find size of HashSet.
System.out.println("Number of countries in HashSet after adding: " + pCountry.size());

		Set<String> set = new HashSet<String>();
		System.out.println("Is set empty? : " + set.isEmpty());
System.out.println("Number of elements in HashSet before adding: " + set.size());

		set.add("Dollar");
		set.add("Indian Rupee");
		set.add("Euro");
		set.add("Yen");

		System.out.println("List of Elements in set");
		System.out.println(set);
System.out.println("Number of elements in the HashSet after adding: " + set.size());
		// Call contains() method to check an element exists in set or not.
		if (set.contains("Dollar")) {
			System.out.println("Does Element 'Dollar' exist in set?");
			System.out.println("Yes, Element 'Dollar' exists in set");
		} else {
			System.out.println("No, Element 'Dollar' does not exist in set");
		}
		System.out.println("Does Element 'Dinar' exist in set?");
		if (set.contains("Dinar")) {
			System.out.println("Yes, Element 'Dinar' exists in set ");
		} else {
			System.out.println("No, Element 'Dinar' does not exist in set");
		}

	}
}