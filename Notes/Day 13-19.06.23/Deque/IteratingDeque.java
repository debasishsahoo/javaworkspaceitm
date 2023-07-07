package Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class IteratingDeque {
	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<Integer>();

		dq.offer(50);
		dq.offer(10);
		dq.offer(20);
		dq.offer(05);
		dq.offer(30);

		System.out.println("Elements in deque:");
		System.out.println(dq);

// Iterating over elements of the deque.
		System.out.println("\nIteration in forward direction:");
		Iterator<Integer> itr = dq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
// Iterating over elements in reverse order.
		System.out.println("\nIteration in reverse order:");
		Iterator<Integer> itr2 = dq.descendingIterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}