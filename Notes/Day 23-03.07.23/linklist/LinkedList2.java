package linklist;

class Node {
	int data;
	Node next;

	Node(int x) // parameterized constructor
	{
		data = x;
		next = null;
	}
}

public class LinkedList2 {
	static Node insertStart(Node head, int data) {
		// Creating newNode memory & assigning data value
		Node newNode = new Node(data);

		// assigning this newNode's next as current head node
		newNode.next = head;
		// re-assigning head to this newNode
		head = newNode;

		return head;
	}

	public static Node delete(Node head) {
		if (head == null) {
			System.out.println("List is empty, not possible to delete");
			return head;
		}

		System.out.println("Deleted: " + head.data);
		// move head to next node
		head = head.next;

		return head;
	}

	static void display(Node node) {

		// as linked list will end when Node is Null
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println("");
	}

	public static void main(String args[]) {
		Node head = null;
		head = insertStart(head, 6);
		head = insertStart(head, 5);
		head = insertStart(head, 4);
		head = insertStart(head, 3);
		head = insertStart(head, 2);
		head = insertStart(head, 1);

		display(head);

		head = delete(head);
		head = delete(head);

		display(head);

	}
}
