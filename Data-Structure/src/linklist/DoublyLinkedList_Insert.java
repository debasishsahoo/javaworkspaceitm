package linklist;

public class DoublyLinkedList_Insert {
	Node head;
	// not using parameterized constructor would by default
	// force head instance to become null
	// Node head = null; // can also do this, but not required

	// Node Class
	class Node {
		int data;
		Node next, prev;

		Node(int x) // parameterized constructor
		{
			data = x;
			next = null;
			prev = null;
		}
	}

	public void insertBeginning(int data) {
		// Creating newNode memory & assigning data value
		Node freshNode = new Node(data);

		freshNode.next = head;
		freshNode.prev = null;

		// if DLL had already >=1 nodes
		if (head != null)
			head.prev = freshNode;

		// changing head to this
		head = freshNode;
		System.out.println(data+" is inserted at the Beginning");
	}

	public void insertEnd(int data) {
		Node freshNode = new Node(data);
		freshNode.next = null;
		if (head == null) {
			head = freshNode;
			freshNode.prev = null;
	System.out.println(data+" is inserted at the First Node");
			return;
		}
		Node last = head;
		while (last.next != null)
			last = last.next;
		
		last.next = freshNode;
		freshNode.prev = last;
		System.out.println(data+" is inserted at the End Node");

	}

	public void insertAfterPosition(int n, int data) {
		int len = getLength(head);
		int pos=n;
		// if insertion position is 0 means entering at start
		if (n == 0) {
			System.out.println("It is the First Position");
			insertBeginning(data);
			return;
		}
		// means inserting after last item
		if (n == len) {
			System.out.println("It is the Last Position");
			insertEnd(data);
			return;
		}

		// else insertion will happen somewhere in the middle

		if (n < 1 || len < n)
			System.out.println("Invalid position");
		else {
			Node freshNode = new Node(data);
			freshNode.next = null;
			freshNode.prev = null;
			Node nthNode = head;
			while (--n > 0) {
				nthNode = nthNode.next;
			}

			Node nextNode = nthNode.next; // (n+1)th node
			// assigning (n+1)th node's previous to this new node
			nextNode.prev = freshNode;
			// new_node's next assigned to (n+1)th node
			freshNode.next = nextNode;
			// new_node's previous assigned to nth node
			freshNode.prev = nthNode;
			// assign nth node's next to new_node
			nthNode.next = freshNode;
			System.out.println(data+" is Inserted at the "+(pos+1)+" Postion");
		}
	}

	public void printList() {
		Node node = head;
		Node end = null;
		// as linked list will end when Node reaches Null

		System.out.print("\nIn forward: ");
		while (node != null) {
			System.out.print(node.data + " ");
			end = node;
			node = node.next;
		}
		System.out.print("\nIn backward: ");

		while (end != null) {
			System.out.print(end.data + " ");
			end = end.prev;
		}
		System.out.println();
	}

	public int getLength(Node node) {
		int size = 0;
		// traverse to the last node each time incrementing the size
		while (node != null) {
			node = node.next;
			size++;
		}
		return size;
	}

	public static void main(String args[]) {
		DoublyLinkedList_Insert doublylist = new DoublyLinkedList_Insert();

		doublylist.insertBeginning(3);
		doublylist.insertBeginning(2);
		doublylist.insertBeginning(1);
		doublylist.insertBeginning(4);
		doublylist.insertBeginning(5);

		doublylist.printList();

		doublylist.insertEnd(30);
		doublylist.insertEnd(20);
		doublylist.insertEnd(10);
		doublylist.insertEnd(40);
		doublylist.insertEnd(50);

		doublylist.printList();

		// Inserts after 4th position
		doublylist.insertAfterPosition(4,123);

		doublylist.printList();
		
		doublylist.insertAfterPosition(5,234);

		doublylist.printList();

	}
}
