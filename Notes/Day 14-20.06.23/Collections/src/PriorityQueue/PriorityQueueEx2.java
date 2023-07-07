package PriorityQueue;

import java.util.PriorityQueue;
public class PriorityQueueEx2 {	
public static void main(String[] args)
{	 
   PriorityQueue<String> pq = new PriorityQueue<>();
   pq.offer("USA");
   pq.offer("India");
   pq.offer("England");
   pq.offer("Germany");
   pq.offer("Australia");

   System.out.println("Elements in queue: " +pq);   

   while (pq.peek() != null) 
   {
     System.out.println("Head Element: " + pq.peek());
     System.out.println("Removed Element from Queue: " +pq.remove());
     System.out.println("Priority queue: " + pq);
   }
 }
}