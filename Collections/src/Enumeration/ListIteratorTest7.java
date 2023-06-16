package Enumeration;

import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorTest7 {
 public static void main(String[] args)
 {
   ArrayList al = new ArrayList();
   al.add("Apple");
   al.add("Orange");
   al.add("Banana");
   al.add("Guava");
   al.add("Pineapple");
  System.out.println(al);

// Create the object of ListIterator using listIterator() method.
   ListIterator litr = al.listIterator();
   while(litr.hasNext())
   {
     Object o = litr.next();
     String str = (String)o; // Type casting.
     if(str.equals("Orange"))
     {
       litr.remove(); // It will remove orange from the list.
       System.out.println(al);
     }
     else if(str.equals("Guava"))
     {
       litr.add("Grapes"); // Adding Grapes after guava.
       System.out.println(al);
     }
     else if(str.equals("Pineapple"))
     {
       litr.set("Pears"); // Replacing Pineapple element.
       System.out.println(al);
     }
   }
 }
}