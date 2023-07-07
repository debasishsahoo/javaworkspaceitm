package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx2 {
	public static void main(String[] args) {
// Create a Queue. 
		Queue<Integer> q = new LinkedList<>();

// Check queue is empty or not.
		boolean isEmpty = q.isEmpty();
		System.out.println("Is queue empty: " + isEmpty);

		System.out.println("q.peak(): " + q.peek()); // Returns null because queue is empty.
		System.out.println("q.poll(): " + q.poll()); // Returns null because queue is empty.

// Adds elements to the tail of queue.
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(25);
		q.add(50);

		System.out.println("Size of queue: " + q.size());
		System.out.println("Original elements in queue: " + q);

		int head = q.remove();
		System.out.println("Removed element at the head of queue: " + head); // Removes the head of queue.
		System.out.println("Elements in queue: " + q);

		int peek = q.peek();
		System.out.println("Head element of queue: " + peek); // Retrieves the head of queue without removing.
		System.out.println("Elements in queue: " + q);
	}
}