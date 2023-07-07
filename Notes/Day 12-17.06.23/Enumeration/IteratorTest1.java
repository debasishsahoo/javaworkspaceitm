package Enumeration;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorTest1 {
public static void main(String[] args)
{
// Create an object of ArrayList of type Integer.
  ArrayList<Integer> al = new ArrayList<Integer>();
  for(int i = 0; i <= 8; i++)
  {
     al.add(i);
  }
  System.out.println(al); // It will print all elements at a time.

// Create the object of Iterator by calling iterator() method using reference variable al.
// At the beginning, itr (cursor) will point to index just before the first element in al.
   Iterator<Integer> itr = al.iterator();

// Checking the next element availability using reference variable itr.
   while(itr.hasNext())
   {
 // Moving cursor to next element using reference variable itr.
    Integer i = itr.next(); // Here, Type casting does not require due to using of generic with Iterator.
    System.out.println(i);

// Removing odd elements.
   if(i % 2!= 0)
     itr.remove();
   }
   System.out.println(al);
 }
}