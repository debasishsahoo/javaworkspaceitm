package Enumeration;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorTest {
public static void main(String[] args)
{
// Creating an object of ArrayList of String type.
   ArrayList<String> al = new ArrayList<String>();

// Adding elements in the array list.
   al.add("A");
   al.add("B");
   al.add("C");
   al.add("D");
   al.add("E");
   al.add("F");

// Creating an iterator object of String type.
   Iterator<String> itr = al.iterator();

// Checking the availability of next element in the collection using reference variable itr.
   while (itr.hasNext())
   {
  // Moving cursor to next element using reference variable itr.
     String str = itr.next();
     System.out.print(str + " ");
   }
  }
}