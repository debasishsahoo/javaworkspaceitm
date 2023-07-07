package Deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DequeAsQueue {
	public static void main(String[] args) {
// Create a Deque and add elements at its tail using addLast() or offerLast() method
		Deque<String> dq = new LinkedList<>();

		dq.addLast("John");
		dq.offerLast("Richard");
		dq.offerLast("Donna");
		dq.offerLast("Ken");
		dq.offer("Peter");

		System.out.println("Deque: " + dq);

// Remove elements from deque until it is empty.
		while (dq.peekFirst() != null) {
			System.out.println("Head Element: " + dq.peekFirst());
			System.out.println("Removed element from Deque: " + dq.removeFirst());
			System.out.println("Elements in Deque: " + dq);
		}
		System.out.println("\n");

// Now, deque is empty. Try to call its peekFirst(), getFirst(), pollFirst() and removeFirst() methods.

		System.out.println("deque.isEmpty(): " + dq.isEmpty());
		System.out.println("deque.peekFirst(): " + dq.peekFirst());
		System.out.println("deque.pollFirst(): " + dq.pollFirst());

		try {
			String str = dq.getFirst();
			System.out.println("deque.getFirst(): " + str);
		} catch (NoSuchElementException e) {
			System.out.println("deque.getFirst(): Deque is empty.");
		}
		try {
			String str = dq.removeFirst();
			System.out.println("deque.removeFirst(): " + str);
		} catch (NoSuchElementException e) {
			System.out.println("deque.removeFirst(): Deque is empty.");
		}
	}
}