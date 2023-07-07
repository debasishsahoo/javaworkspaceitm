package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class KeySetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(25);
		ts.add(80);
		ts.add(05);
		ts.add(100);
		ts.add(90);
		System.out.println("Sorted TreeSet:");

// Traversing elements.
		Iterator<Integer> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Iterating elements through Iterator in descending order");
		Iterator<Integer> it = ts.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}