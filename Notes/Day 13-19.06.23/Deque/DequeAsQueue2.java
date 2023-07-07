package Deque;

import java.util.ArrayDeque;
import java.util.Deque;
public class DequeAsQueue2 {
public static void main(String[] args) 
{
 Deque<Integer> dq = new ArrayDeque<Integer>();
	
  dq.offer(50);
  dq.offer(10);
  dq.offer(20);
  dq.offer(05);
  dq.offer(30);

// Iterating over elements of deque using enhanced for loop.
 System.out.println("Iterating using enhanced for loop");  
  for (Integer element: dq) {
      System.out.println(element);
  }
 }
}