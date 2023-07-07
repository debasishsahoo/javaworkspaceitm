package HashMap;

import java.util.HashMap;
public class HashMapEx3 {
public static void main(String[] args) 
{	
  HashMap<Character,String> hmap = new HashMap<>();
   
  hmap.put('R', "Red");
  hmap.put('O', "Orange");
  hmap.put('G', "Green");
  hmap.put('B', "Brown");
  hmap.put('W', "White");

// Displaying HashMap entries.  
   System.out.println("Entries in HashMap: " +hmap);

// Removing Key-Value pairs for key 'B'. 
   Object removeEntry = hmap.remove('B');
   System.out.println("Removed Entry: " +removeEntry);
   System.out.println("HashMap Entries after remove: " +hmap);
  
// Checking entry is removed or not.  
   Object removeEntry2 = hmap.remove('W', "White");
   System.out.println("Is entry removed: " +removeEntry2);
   System.out.println("Updated HashMap entries: " +hmap);
   }
}