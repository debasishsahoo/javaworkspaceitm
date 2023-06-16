package Enumeration;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
public static void main(String[] args)
{
// Creating a list object.
   List<String> list = new LinkedList<>();

// Adding elements in the list.
   list.add("A");
   list.add("B");
   list.add("C");

// Creating ListIterator object.
   ListIterator<String> listIterator = list.listIterator();

// Traversing elements in forwarding direction.
   System.out.println("Forward Direction Iteration:");

   while(listIterator.hasNext())
   {
      System.out.println(listIterator.next());
   }
// Traversing elements in the backward direction. The ListIterator cursor is at just after the last element.
   System.out.println("Backward Direction Iteration:");

   while(listIterator.hasPrevious())
   {
     System.out.println(listIterator.previous());
   }
}}