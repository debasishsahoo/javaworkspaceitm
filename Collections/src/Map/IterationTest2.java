package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class IterationTest2 {
public static void main(String[] args)
{
  Map<String, String> map = new HashMap<>();

   map.put("V ", " Violet");
   map.put("I ", " Indigo");
   map.put("B ", " Blue");
   map.put("G ", " Green");
   map.put("Y ", " Yellow");
   map.put("O ", " Orange");
   map.put("R ", " Red");

// entrySet is a method that is used to get view of entries of a map.
   Iterator<Entry<String, String>> itr = map.entrySet().iterator();
   System.out.println("Iterating Entries of Map");
   while(itr.hasNext())
   {
     Object key = itr.next();
     System.out.println(key);
   }
// Removing last entry returned by Iterator
   itr.remove(); // This method will remove last entry of a map while iterating.
   System.out.println("Entries of Map after removing: " +map.entrySet());
 }
}