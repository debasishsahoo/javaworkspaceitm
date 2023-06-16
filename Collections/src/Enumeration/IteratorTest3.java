package Enumeration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class IteratorTest3 {
public static void main(String[] args)
{
   Collection<String> collection = new ArrayList<>();
// Adding elements in the array list.
   collection.add("Red");
   collection.add("Green");
   collection.add("Black");
   collection.add("White");
   collection.add("Pink");

   Iterator<String> iterator = collection.iterator();
   while (iterator.hasNext())
   {
      System.out.print(iterator.next().toUpperCase() + " ");
   }
   System.out.println();
 }
}