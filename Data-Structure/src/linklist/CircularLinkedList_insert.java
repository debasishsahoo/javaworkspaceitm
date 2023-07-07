package linklist;

public class CircularLinkedList_insert {
	public class Node {
		int element;
		Node next;

		public Node(int element) {
			this.element = element;
		}
	}

	public Node head = null;
	public Node tail = null;
	int size = 0;

	public void insertBegin(int element) {
		Node newEle = new Node(element);
		if (head == null) {
			head = newEle;
			tail = newEle;
			newEle.next = head;
		} else {
			tail.next = newEle;
			tail = newEle;
			tail.next = head;
		}
	}

	public void insertEnd(int element) {
		Node newEle = new Node(element);
		if (head == null) {
			head = newEle;
			tail = newEle;
			newEle.next = head;
		} else {
			tail.next = newEle;
			newEle.next = head;
			tail = newEle;
		}
		size++;
	}

	public void insertAfter(int n, int data) {
		int size = calcSize(head);

		// Can only insert after 1st position
		// Can't insert if position to insert is greater than size of Linked List
		if (n < 1 || n > size) {
			System.out.println("Can't insert\n");
		}
		if (n == 1) {
			insertBegin(data);
			return;
		}
		Node newNode = new Node(data);
		// required to traverse
		Node temp = head;
		// traverse to the nth node
		while (--n > 1)
			temp = temp.next;

		newNode.next = temp.next;
		temp.next = newNode;

	}

	public int calcSize(Node node) {
		int size = 0;
		while (node != tail) {
			node = node.next;
			size++;
		}
		return size + 1;
	}

	public void print() { // print function
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			System.out.println("Nodes of the circular linked list: ");
			do {
				System.out.print(" " + current.element);
				current = current.next;
			} while (current != head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		CircularLinkedList_insert Obj = new CircularLinkedList_insert();
		Obj.insertBegin(11);
		Obj.insertBegin(22);
		Obj.insertBegin(33);
		Obj.insertBegin(44);
		Obj.insertBegin(55);

		Obj.print();

		Obj.insertEnd(110);
		Obj.insertEnd(220);
		Obj.insertEnd(330);
		Obj.insertEnd(440);

		Obj.print();
		Obj.insertAfter(2, 77);
		Obj.insertAfter(3, 88);
		Obj.print();
	}
}
