package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
public class PriorityQueueEx3 {	
public static void main(String[] args)
{	
// Create a Queue. This priority queue stores Integer objects.  
    PriorityQueue<Integer> pq = new PriorityQueue<>();
   
// Adds elements to the priority queue.
   pq.offer(50);
   pq.offer(100);
   pq.offer(60);
   pq.offer(20);
   pq.offer(10);
   
System.out.println("Priority queue using Comparable:");   
while(pq.size() > 0) {
   System.out.print(pq.remove() + " ");
}
PriorityQueue<Integer> pq2 = new PriorityQueue<>(5, Collections.reverseOrder());
  pq2.offer(50);
  pq2.offer(100);
  pq2.offer(60);
  pq2.offer(20);
  pq2.offer(10);
  
int size = pq2.size();
System.out.println("\nSize of priority queue: " +size);
System.out.println("\nPriority queue using Comparator:"); 
while(size > 0) {
    System.out.print(pq2.remove() + " ");
   }
 }
}