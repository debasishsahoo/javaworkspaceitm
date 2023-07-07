package TreeMap;

import java.util.TreeMap;
public class TreeMapEx2{
public static void main(String[] args) 
{
  TreeMap<String, Integer> tmap = new TreeMap<>();
  int size = tmap.size();
  System.out.println("Size of TreeMap before adding entries: " +size);

  boolean isEmpty = tmap.isEmpty();
  System.out.println("Is TreeMap empty: " +isEmpty);
 
// Adding entries in tree map.
   tmap.put("John", 25);
   tmap.put("Ricky", 22);
   tmap.put("Deep", 28);
   tmap.put("Mark", 20);
   tmap.put("Peter", 30);
  
   System.out.println("Entries in ascending order: " +tmap);
   tmap.remove("Mark");
   System.out.println("Entries of TreeMap after removing: " +tmap);
 
   tmap.replace("Peter", 18);
   System.out.println("Updated enrties of TreeMap: " +tmap);
 }
}