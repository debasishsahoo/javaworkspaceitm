package setProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class AddDemo {
public static void main(String[] args)
{
// Creating a set object.
   Set<String> set= new HashSet<>();

// Adding elements to set.
   set.add("Banana");
   set.add("Orange");
   set.add("Apple");
   set.add("Mango");

// Creating an iterator object.
   Iterator<String> itr = set.iterator();
   while(itr.hasNext())
   {
     Object str = itr.next();
     System.out.println(str);
     set.add("Grapes"); // Adding element during iteration. It will throw ConcurrentModificationException.
   }
  }
}