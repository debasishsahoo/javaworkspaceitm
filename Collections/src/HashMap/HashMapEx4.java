package HashMap;

import java.util.HashMap;
public class HashMapEx4 {
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

// Replacing specified value for the specified key.  
   Object replaceValue = hmap.replace('B', "Black");
   System.out.println("Replaced value: " +replaceValue);
   System.out.println("Updated entries in HashMap: " +hmap);
   
   boolean replaceValue2 = hmap.replace('G', "Green", "Greenish");
   System.out.println("Is value replaced: " +replaceValue2);
   System.out.println(hmap);
   }
}