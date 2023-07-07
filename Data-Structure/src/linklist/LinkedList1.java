package linklist;

public class LinkedList1 {
	Node head;
	// not using parameterized constructor would by default
	// force head instance to become null
	// Node head = null; // can also do this, but not required

	// Node Class
	class Node {
		int data;
		Node next;

		Node(int x) // parameterized constructor
		{
			data = x;
			next = null;
		}
	}

	public Node insert(int data) {
		// Creating newNode memory & assigning data value
		Node newNode = new Node(data);
		// assigning this newNode's next as current head node
		newNode.next = head;

		// re-assigning head to this newNode
		head = newNode;

		return head;
	}

	public void display() {
		Node node = head;
		// as linked list will end when Node reaches Null
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public void delete() {
		if (head == null) {
			System.out.println("List is empty, not possible to delete");
			return;
		}

		System.out.println("Deleted: " + head.data);
		// move head to next node
		head = head.next;
	}
	
	
	
	
	public static void main(String args[]) {
		LinkedList1 ll = new LinkedList1();

		ll.insert(6);
		ll.insert(5);
		ll.insert(3);
		ll.insert(4);
		ll.insert(2);
		ll.insert(1);

		ll.display();

		ll.delete();
		ll.delete();

		ll.display();
	}
}

