package linklist;

public class LinkList_Delete_Position {
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
		System.out.println();
		if (node == null) {
			System.out.println("List is empty");
			return;
		}

		// as linked list will end when Node reaches Null
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	void deletepos(int pos) {
		Node temp = head;
		Node previous = null;

		int size = calcSize(head);

		if (pos < 1 || pos > size) {
			System.out.println("Enter valid position");

			return;
		}

		// if the head node itself needs to be deleted
		if (pos == 1) {
			// changing head to next in the list
			head = temp.next;
			System.out.println("Deleted Item: " + temp.data);
			return;
		}

		// run until we find the value to be deleted in the list
		while (--pos > 0) {
			// store previous link node as we need to change its next val
			previous = temp;
			temp = temp.next;
		}

		// (pos-1)th node's next assigned to (pos+1)nth node
		previous.next = temp.next;
		System.out.println("Deleted Item: " + temp.data);

	}

	public int calcSize(Node node) {
		int size = 0;
		// traverse to the last node each time incrementing the size
		while (node != null) {
			node = node.next;
			size++;
		}
		return size;
	}

	public void deleteStart() {
		if (head == null) {
			System.out.println("List is empty, not possible to delete");
			return;
		}

		System.out.println("Deleted: " + head.data + " From Beginning ");
		// move head to next node
		head = head.next;
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty, not possible to delete");
			return;
		}

		// if LL has only one node
		if (head.next == null) {
			System.out.println("Deleted: " + head.data + " From the End");
			head = head.next;
		}
		Node previous = null;
		Node temp = head;
		// else traverse to the last node
		while (temp.next != null) {
			// store previous link node as we need to change its next val
			previous = temp;
			temp = temp.next;
		}
		// Current assign 2nd last node's next to Null
		System.out.println("Deleted: " + temp.data + " From the End");
		previous.next = null;
		// 2nd last now becomes the last node

	}

	public void deleteNthNode(int n) {
		int len = calcSize(head);

		// Can only insert after 1st position
		// Can't insert if position to insert is greater than size of Linked List
		if (n < 1 || n > len) {
			System.out.println("Can't delete\n");

		} else {
			if (n == 1) {
				// head has to be deleted
				System.out.println("Deleted: " + head.data);
				head = head.next;
				return;
			}
			// required to traverse
			Node temp = head;
			Node previous = null;

			// traverse to the nth node
			while (--n > 0) {
				previous = temp;
				temp = temp.next;
			}
			// assigned next node of the previous node to nth node's next
			previous.next = temp.next;
			System.out.println("Deleted: " + temp.data);
		}
	}

	public static void main(String args[]) {
		LinkList_Delete_Position ll = new LinkList_Delete_Position();

		ll.insert(60);
		ll.insert(50);
		ll.insert(40);
		ll.insert(30);
		ll.insert(20);
		ll.insert(10);

		ll.display();

		ll.deletepos(1);
		ll.display();

		ll.deletepos(3);
		ll.display();

		ll.deletepos(4);
		ll.display();

		ll.deletepos(-2); // not valid as pos negative
		ll.deletepos(10); // not valid as breaches size of Linked List

		ll.display();
		ll.deleteStart();
		ll.display();
		ll.deleteStart();
		ll.display();
		ll.deleteStart();
		ll.display();

		ll.insert(60);
		ll.insert(50);
		ll.insert(40);
		ll.insert(30);
		ll.insert(20);
		ll.insert(10);
		ll.display();
		ll.deleteLast();
		ll.display();
		ll.deleteLast();
		ll.display();
		ll.deleteLast();
		ll.display();
		ll.deleteLast();
		ll.display();
		ll.deleteLast();
		ll.display();
		ll.deleteStart();
		ll.display();

		
		
		ll.insert(35);
		ll.insert(34);
		ll.insert(33);
		ll.insert(32);
		ll.insert(31);
		ll.insert(30);

		ll.display();

		ll.deleteNthNode(3);
		ll.display();
		ll.deleteNthNode(4);
		ll.display();

	}
}
