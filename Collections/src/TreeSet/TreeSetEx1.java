package TreeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetEx1 {
public static void main(String[] args)
{
// Create a tree set.
   Set<String> ts = new TreeSet<>();

// Check Set is empty or not.
   boolean empty = ts.isEmpty();
   System.out.println("Is TreeSet empty: " +empty);

// Checking the size of TreeSet before adding elements into it.
   int size = ts.size();
   System.out.println("Size of TreeSet: " +size);

// Adding elements into TreeSet.
   ts.add("India"); // ts.size() is 1.
   ts.add("USA"); // ts.size() is 2.
   ts.add("Australia"); // ts.size() is 3.
   ts.add("New zealand"); // ts.size() is 4.
   ts.add("Switzerland"); // ts.size() is 5.

   System.out.println("Sorted TreeSet: " +ts);
   int size2 = ts.size();
   System.out.println("Size of TreeSet after adding elements: " +size2);
   
   
   
// Creating a set object.
   Set<String> set= new HashSet<>();

// Adding elements to set.
   set.add("Banana");
   set.add("Orange");
   set.add("Apple");
   set.add("Mango");
  }
}