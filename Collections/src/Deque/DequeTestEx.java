package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTestEx {
	public static void main(String[] args) {
// Create a Deque and add elements to the deque.
		Deque<String> dq = new ArrayDeque<String>();

		dq.offer("ABC");
		dq.offer("PQR");
		dq.offer("MNO");
		dq.offer("IJK");
		dq.offer("GHI");

		System.out.println(dq);

		System.out.println("dq.getFirst(): " + dq.getFirst());
		System.out.println(dq);

		System.out.println("dq.removeFirst(): " + dq.removeFirst());
		System.out.println(dq);

// Adding new element at the head of queue.
		dq.addFirst("ABC");
		System.out.println(dq);

		System.out.println("dq.getLast(): " + dq.getLast());
		System.out.println(dq);

		System.out.println("dq.removeLast(): " + dq.removeLast());
		System.out.println(dq);

		dq.addLast("GHI");
		System.out.println(dq);
	}
}