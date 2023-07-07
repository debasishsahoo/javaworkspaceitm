package Stack;

import java.util.Stack;

public class StackEx3 {
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

// Removing elements from the stack one by one.
		while (st.size() > 0) {
			System.out.println("Removed element: " + st.pop());
		}
		System.out.println("Is stack empty: " + st.empty());
	}
}