public class StackUsingLinkedList {

  private Node head; // the first node

  // nest class to define linkedlist node
  private class Node {

    int value;
    Node next;
  }

  public StackUsingLinkedList() {
    head = null;
  }

  // Remove value from the beginning of the list to simulate stack
  public int pop() throws LinkedListEmptyException {
    if (head == null) {
      throw new LinkedListEmptyException();
    }
    int value = head.value;
    head = head.next;
    return value;
  }

  // Add value to the beginning of the list to simulate stack
  public void push(int value) {
    Node prevHead = head;
    head = new Node();
    head.value = value;
    head.next = prevHead;
  }

  public static void main(String args[]) {
    StackUsingLinkedList sll = new StackUsingLinkedList();
    sll.push(200);
    sll.push(150);
    sll.push(80);
    sll.push(90);
    sll.push(600);
    sll.push(175);
    System.out.println("Removed element from LinkedList: " + sll.pop());
    System.out.println("Removed element from LinkedList: " + sll.pop());
    sll.push(100);
    System.out.println("Removed element from LinkedList: " + sll.pop());
    printList(sll.head);
  }

  public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.format("%d ", temp.value);
      temp = temp.next;
    }
    System.out.println();
  }
}

/**
 *
 * Throw LinkedListEmptyException if LinkedList is empty
 */

class LinkedListEmptyException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public LinkedListEmptyException() {
    super();
  }

  public LinkedListEmptyException(String message) {
    super(message);
  }
}
