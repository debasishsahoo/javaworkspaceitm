package Enumeration;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest5 {
public static void main(String[] args)
{
 List<String> list = new ArrayList<>();
  list.add("Red");
  list.add("Green");
  list.add("Yellow");
  list.add("Orange");
  list.add("Blue");
  list.add("White");
 System.out.println("List: " + list);

// Get the list iterator
   ListIterator<String> iterator = list.listIterator();
   System.out.println();

   System.out.println("List Iterator in Forward Direction:");
   while (iterator.hasNext())
   {
     int index = iterator.nextIndex();
     String element = iterator.next();
     System.out.println("Index = " + index + ", Element = " + element);
   }
   System.out.println();
   System.out.println("List Iterator in Backward Direction:");

// Reuse the Java list iterator to iterate from the end to the beginning.
   while (iterator.hasPrevious())
   {
     int index = iterator.previousIndex();
     String element = iterator.previous();
     System.out.println("Index = " + index + ", Element = " + element);
   }
  }
}