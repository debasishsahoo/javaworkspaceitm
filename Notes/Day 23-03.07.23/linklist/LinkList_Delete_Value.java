package linklist;

public class LinkList_Delete_Value {
	Node head;

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

	public Node insertStart(int data) {
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

	void deleteVal(int value) {
		Node temp = head;
		Node previous = null;

		if (temp == null) {
			System.out.println("Can't delete Linked List empty");
			return;
		}

		// Case when there is only 1 node in the list
		if (temp.next == null) {
			head = null;
			System.out.println("Deleted: " + value);
			return;
		}

		// if the head node itself needs to be deleted
		if (temp.data == value) {
			head = temp.next; // changing head to next in the list
			System.out.println("Deleted: " + value);
			return;
		}

		// traverse until we find the value to be deleted or lld ends
		while (temp != null && temp.data != value) {
			// store previous link node as we need to change its next val
			previous = temp;
			temp = temp.next;
		}

		// if value is not present then
		// temp will have traversed to last node NULL
		if (temp == null) {
			System.out.println("Value not found");
			return;
		}

		// for node to be deleted : temp lets call it nth node
		// assign (n-1)th node's next to (n+1)th node
		previous.next = temp.next;
		System.out.println("Deleted: " + value);
	}

	public static void main(String args[]) {
		LinkList_Delete_Value lld = new LinkList_Delete_Value();

		lld.insertStart(6);
		lld.insertStart(5);
		lld.insertStart(4);
		lld.insertStart(3);
		lld.insertStart(2);
		lld.insertStart(1);

		lld.display();

		lld.deleteVal(10);
		lld.deleteVal(5);
		lld.deleteVal(2);

		lld.display();

		lld.deleteVal(1);
		lld.display();

	}

}
