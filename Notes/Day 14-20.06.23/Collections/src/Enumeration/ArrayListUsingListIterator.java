package Enumeration;
import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayListUsingListIterator {
public static void main(String[] args)
{
 ArrayList al = new ArrayList();
  al.add("First");
  al.add("Second");
  al.add("Third");
  al.add("Fourth");
  al.add("Fifth");
  System.out.println(al);

// Iterating using ListIterator.
// Call listIterator() method to create object of ListIterator using reference variable al.
   ListIterator litr = al.listIterator(); // Here, we are not using generic. Therefore, typecasting is required.

// Checking the next element availability in the forward direction using reference variable litr.
   System.out.println("Iteration in the forward direction");
   while(litr.hasNext())
   {
  // Moving cursor to next element in the forward direction using reference variable litr.
     Object o = litr.next();
     String str = (String)o; // Type casting is required because the return type of next() method is an Object.
     System.out.println(str);
   }
 // Checking the previous element in the backward direction using reference variable litr1.
    System.out.println("Iteration in the backward direction.");
    while(litr.hasPrevious())
    {
  // Moving cursor to the previous element in the backward direction.
     Object o = litr.previous();
     String str1 = (String)o; // Type casting.
     System.out.println(str1);
  }
 }
}