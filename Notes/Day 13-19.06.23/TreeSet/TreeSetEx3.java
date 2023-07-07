package TreeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx3 {
	public static void main(String[] args) {
// Creating a set object and adding elements to it.
		Set<String> s = new HashSet<>();
		s.add("Delhi");
		s.add("New York");
		s.add("Paris");
		s.add("London");
		s.add("Delhi"); // Adding duplicate elements.

		TreeSet<String> ts = new TreeSet<>(s);
		System.out.println("Sorted TreeSet: " + ts);

// Using methods of SortedSet interface.
		System.out.println("First Element: " + ts.first());
		System.out.println("Last Element: " + ts.last());
		System.out.println("HeadSet Elements: " + ts.headSet("London"));
		System.out.println("TailSet Elements: " + ts.tailSet("London"));

		SortedSet<String> subSet = ts.subSet("Delhi", "Paris");
		System.out.println("SubSet Elements: " + subSet);
		System.out.println("Sorted Set: " + ts.comparator()); // It will return null because natural ordering is used.
	}
}
