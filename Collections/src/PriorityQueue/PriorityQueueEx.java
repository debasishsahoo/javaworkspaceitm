package PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueueEx {	
public static void main(String[] args)
{	
// Create a Queue. This priority queue stores Strings objects.  
   PriorityQueue<String> pq = new PriorityQueue<>();
   
// Adds elements to the priority queue.
   pq.offer("USA");
   pq.offer("India");
   pq.offer("England");
   pq.offer("Germany");
   pq.offer("Australia");

System.out.println("Priority queue: " +pq);

// Iterating elements of priority queue.
   System.out.println("Iterating elements of priority queue");
   Iterator<String> iterator = pq.iterator();
   while (iterator.hasNext()) {
    System.out.print(iterator.next() + " ");
   }
 }
}
