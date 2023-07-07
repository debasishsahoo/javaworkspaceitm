package linklist;

public class CircularLinkedList_Delete {

	public class Node {
		int element;
		Node next;

		public Node(int element) {
			this.element = element;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void print() {
		Node temp = head;
		if (head == null) {
			System.out.println("null");
		} else {
			do {
				System.out.print(" " + temp.element);
				temp = temp.next;
			} while (temp != head);
			System.out.println();
		}
	}

	public void add(int element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	public void deleteFirst() {
		if (head == null) {
			return;
		} else {
			if (head != tail) {
				head = head.next;
				tail.next = head;
			} else {
				head = tail = null;
			}
		}
	}

	public void deleteLast() {
		if (head == null) {
			return;
		} else {
			if (head != tail) {
				Node current = head;
				while (current.next != tail) {
					current = current.next;
				}
				tail = current;
				tail.next = head;
			} else {
				head = tail = null;
			}
		}
	}

	public int calcLen() {
		int len = 0;
		Node temp = head;

		while (temp != tail) {
			temp = temp.next;
			len++;
		}
		return len;
	}

	public void deleteNthNode(int n) {
		int len = calcLen();

		// Can only insert after 1st position
		// Can't insert if position to insert is greater than size of Linked List
		if (n < 1 || n > len) {
			System.out.println("Can't delete\n");

		} else {
			if (n == 1) {
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
			System.out.println("Deleted: " + temp.element);
		}
	}

	public static void main(String[] args) {
		CircularLinkedList_Delete Obj = new CircularLinkedList_Delete();
		Obj.add(10);
		Obj.add(20);
		Obj.add(30);
		Obj.add(40);
		Obj.add(50);
		Obj.add(60);

		System.out.println("List Before Deletion");
		Obj.print();

		System.out.println("List After Deleting first node");
		Obj.deleteFirst();
		Obj.print();

		System.out.println("List After Deleting last node");
		Obj.deleteLast();
		Obj.print();

		Obj.deleteNthNode(2);
		System.out.println("List After Deleting 2nd node");
		Obj.print();
	}

}
