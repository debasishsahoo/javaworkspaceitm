package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsStack {
	public static void main(String[] args) {
// Create a Deque and use it as stack. add elements at its tail using addLast() or offerLast() method.
		Deque<String> dq = new ArrayDeque<>();

		dq.push("John");
		dq.push("Richard");
		dq.push("Donna");
		dq.push("Ken");
		dq.push("Peter");

		System.out.println("Stack: " + dq);

// Remove all elements from the deque.
		while (dq.peek() != null) {
			System.out.println("Element at top: " + dq.peek());
			System.out.println("Popped: " + dq.pop());
			System.out.println("Stack: " + dq);
		}
		System.out.println(" Is Stack empty: " + dq.isEmpty());
	}
}