package linklist;

public class LinkList_Insert {
	Node head;

	// Node Class
	class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	public Node insertBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		System.out.println(data + "  inserted at the Begninning");
		return head;
	}

	public void insertEnd(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			System.out.println(newNode.data + " inserted at the End");
			return;
		}

		Node temp = head;
		while (temp.next != null)
			temp = temp.next;
		
		temp.next = newNode;
		System.out.println(newNode.data + " inserted at the End");
	}

	
	
	
	
	
	
	
	public void insertAfter(int n, int data) {
		int size = calcSize(head);
		int pos=n;
		// Can only insert after 1st position
		// Can't insert if position to insert is greater than size of Linked List
		if (n < 1 || n > size) {
			System.out.println("Can't insert\n");
		} else {
			Node newNode = new Node(data);
			// required to traverse
			Node temp = head;
			// traverse to the nth node
			while (--n > 0)
				temp = temp.next;
			
			newNode.next = temp.next;
			temp.next = newNode;
			System.out.println(data + " inserted at the "+pos+" position ");
		}
	}

	public void display() {
		System.out.println();
		Node node = head;
		// as linked list will end when Node reaches Null
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public int calcSize(Node node) {
		int size = 0;
		while (node != null) {
			node = node.next;
			size++;
		}
		return size;
	}

	public static void main(String args[]) {
		LinkList_Insert listObj = new LinkList_Insert();

		listObj.insertBeginning(15);
		listObj.insertBeginning(10);
		listObj.insertBeginning(5);

		listObj.display();

		listObj.insertEnd(20);
		listObj.insertEnd(25);
		listObj.insertEnd(30);
		listObj.insertEnd(35);

		listObj.display();

		listObj.insertAfter(3, 100);

		listObj.display();
	}
}
