package Stack;

import java.util.Stack;

public class StackEx2 {
	public static void main(String[] args) {
// Create an empty stack that contains Integer objects.
		Stack<Integer> st = new Stack<>();

		st.push(25);
		st.push(30);
		st.push(35);
		st.push(40);
		st.push(45);
		st.push(50);

// Displaying elements from the stack.
		System.out.println("Elements of Stack: " + st);

// Retrieving element at the top of stack.
		Object peekElement = st.peek();
		System.out.println("Element at the top of stack: " + peekElement);

// Find the position of element into the stack.
		System.out.println("Position of element 50: " + st.search(50));
		System.out.println("Position of element 80: " + st.search(80));
	}
}