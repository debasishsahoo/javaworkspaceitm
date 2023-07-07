package Hashing;

import java.util.*;

public class Linkedhashset {
	public static void main(String args[]) {
		// LinkedHashSet of String Type
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();

		// Adding elements to the LinkedHashSet
		lhset.add("India");
		lhset.add("Nepal");
		lhset.add("China");

		// can use this to print
		System.out.println(lhset);

		// let's print while iterating
		System.out.println("let's print while iterating.....");
		Iterator<String> itr = lhset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
