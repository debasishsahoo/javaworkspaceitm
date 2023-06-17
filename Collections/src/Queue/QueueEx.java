package Queue;

import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {	
public static void main(String[] args)
{	
// Create a Queue. 
  Queue<String> q = new LinkedList<>();
  
// Adds elements to the tail of queue.
   q.add("ABC");
   q.add("DEF");
   q.add("GHI");
   q.add("JKL");
   q.add("MNO");
   
System.out.println("Elements in queue: " +q); 
System.out.println("Head element of queue: " +q.element());
System.out.println("Removed element: " +q.remove());
System.out.println("Elements in queue after removed: " +q);

boolean addElement = q.offer("PQR");
System.out.println("Is new element added to the tail of queue: " +addElement);
System.out.println("Elements in queue after adding new element: " +q);
 }
}