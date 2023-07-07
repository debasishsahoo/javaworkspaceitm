class Node {

  public int data;
  public Node next;

  public void displayNodeData() {
    System.out.println("{ " + data + " } ");
  }
}

public class SinglyLinkedList {

  private Node head;

  public boolean isEmpty() {
    return (head == null);
  }

  // used to insert a node at the start of linked list
  public void insertFirst(int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = head;
    head = newNode;
  }

  // used to delete node from start of linked list
  public Node deleteFirst() {
    Node temp = head;
    head = head.next;
    return temp;
  }

  // Use to delete node after particular node
  public void deleteAfter(Node after) {
    Node temp = head;
    while (temp.next != null && temp.data != after.data) {
      temp = temp.next;
    }
    if (temp.next != null) temp.next = temp.next.next;
  }

  // used to insert a node at the start of linked list
  public void insertLast(int data) {
    Node current = head;
    while (current.next != null) {
      current = current.next; // we'll loop until current.next is null
    }
    Node newNode = new Node();
    newNode.data = data;
    current.next = newNode;
  }

  // For printing Linked List
  public void printLinkedList() {
    System.out.println("Printing LinkedList (head --> last) ");
    Node current = head;
    while (current != null) {
      current.displayNodeData();
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String args[]) {
    SinglyLinkedList myLinkedlist = new SinglyLinkedList();
    myLinkedlist.insertFirst(5);
    myLinkedlist.insertFirst(6);
    myLinkedlist.insertFirst(7);
    myLinkedlist.insertFirst(1);
    myLinkedlist.insertLast(2);
    // Linked list will be
    // 2 -> 1 ->  7 -> 6 -> 5
    Node node = new Node();
    node.data = 1;
    myLinkedlist.deleteAfter(node);
    // After deleting node after 1,Linked list will be
    // 2 -> 1 -> 6 -> 5
    myLinkedlist.printLinkedList();
  }
}
